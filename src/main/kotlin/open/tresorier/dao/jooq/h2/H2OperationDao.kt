package open.tresorier.dao.jooq.h2

import open.tresorier.dao.IOperationDao
import open.tresorier.exception.TresorierException
import open.tresorier.generated.jooq.test.public_.Tables.*
import open.tresorier.generated.jooq.test.public_.tables.daos.OperationDao
import open.tresorier.generated.jooq.test.public_.tables.records.OperationRecord
import open.tresorier.generated.jooq.test.public_.tables.records.PersonRecord
import open.tresorier.model.*
import org.jooq.Configuration
import org.jooq.Field
import org.jooq.Record3
import org.jooq.impl.DSL
import org.jooq.impl.DSL.sum
import java.math.BigDecimal
import open.tresorier.generated.jooq.test.public_.tables.pojos.Operation as JooqOperation


class H2OperationDao(val configuration: Configuration) : IOperationDao {

    private val generatedDao: OperationDao = OperationDao(configuration)
    private val query = DSL.using(configuration)

    // ready to use computed Field
    private val spendingSum: Field<BigDecimal> = sum(OPERATION.AMOUNT).`as`("sum")

    override fun insert(operation: Operation): Operation {
        val jooqOperation = this.toJooqOperation(operation)
        try {
            this.generatedDao.insert(jooqOperation)
        } catch (e: Exception) {
            throw TresorierException("could not insert operation : $operation", e)
        }
        return operation
    }

    override fun update(operation: Operation): Operation {
        val jooqOperation = this.toJooqOperation(operation)
        try {
            this.generatedDao.update(jooqOperation)
        } catch (e: Exception) {
            throw TresorierException("could not update operation : $operation", e)
        }
        return operation
    }

    override fun delete(operation: Operation) {
        val jooqOperation = this.toJooqOperation(operation)
        try {
            this.generatedDao.delete(jooqOperation)
        } catch (e: Exception) {
            throw TresorierException("could not delete operation : $operation", e)
        }
    }

    override fun getById(id: String): Operation {
        val jooqOperation = this.generatedDao.fetchOneById(id)
        return this.toOperation(jooqOperation)
                ?: throw TresorierException("no operation found for the following id : $id")
    }

    override fun findTotalSpendingByMonth(budget: Budget, maxMonth: Month?) : List<Spending> {
        val query = this.query
                .select(OPERATION.CATEGORY_ID, OPERATION.MONTH , spendingSum )
                .from(MASTER_CATEGORY)
                .join(CATEGORY).on(CATEGORY.MASTER_CATEGORY_ID.eq(MASTER_CATEGORY.ID))
                .join(OPERATION).on(OPERATION.CATEGORY_ID.eq(CATEGORY.ID))
                .where(MASTER_CATEGORY.BUDGET_ID.eq(budget.id))
        maxMonth?.let{ query.and( OPERATION.MONTH.lessOrEqual(it.comparable))}
        query.groupBy(OPERATION.CATEGORY_ID, OPERATION.MONTH)
                .orderBy(OPERATION.MONTH.asc())
        val jooqSpendingList = query.fetch()
        val spendingList: MutableList<Spending> = mutableListOf()
        for (spendingRecord in jooqSpendingList) {
            val allocation = this.toSpending(spendingRecord)
            spendingList.add(allocation)
        }
        return spendingList
    }

    override fun findByAccount(account: Account): List<Operation> {
        val jooqOperationList = this.generatedDao.fetchByAccountId(account.id)
        val accountList: MutableList<Operation> = mutableListOf()
        for (jooqOperation in jooqOperationList) {
            val operation = this.toOperation(jooqOperation)
            operation?.let { accountList.add(it) }
        }
        return accountList
    }

    override fun findByBudget(budget: Budget): List<Operation> {
        val query = this.query
            .select()
            .from(OPERATION)
            .join(ACCOUNT).on(OPERATION.ACCOUNT_ID.eq(ACCOUNT.ID))
            .where(ACCOUNT.BUDGET_ID.eq(budget.id))
        query.orderBy(OPERATION.MONTH.asc(), OPERATION.DAY.asc())

        val jooqOperationList = query.fetch().into(OPERATION)

        val operationList: MutableList<Operation> = mutableListOf()
        for (operationRecord : OperationRecord in jooqOperationList) {
            val operation = this.toOperation(operationRecord)
            operationList.add(operation)
        }

        return operationList
    }

    override fun getOwner(operation: Operation): Person {
        try {
            val owner: PersonRecord = this.query.select().from(PERSON)
                    .join(ACCOUNT).on(ACCOUNT.ID.eq(operation.accountId))
                    .join(BUDGET).on(BUDGET.ID.eq(ACCOUNT.BUDGET_ID))
                    .where(PERSON.ID.eq(BUDGET.PERSON_ID))
                    .fetchAny().into(PERSON)
            return H2PersonDao.toPerson(owner)
        } catch (e: Exception) {
            throw TresorierException("the given object appears to have no owner")
        }
    }

    private fun toJooqOperation(operation: Operation): JooqOperation {
        return JooqOperation(
            operation.id,
            operation.accountId,
            operation.day?.month?.comparable,
            operation.day?.day,
            operation.categoryId,
            BigDecimal(operation.amount),
            operation.memo
        )
    }

    private fun toOperation(jooqOperation: JooqOperation?): Operation? {
        return if (jooqOperation == null)
            null
        else Operation(
            jooqOperation.accountId,
            Day(Month.createFromComparable(jooqOperation.month), jooqOperation.day),
            jooqOperation.categoryId,
            jooqOperation.amount.toDouble(),
            jooqOperation.memo,
            jooqOperation.id,
        )
    }

    private fun toSpending(jooqSpending: Record3<String, Int, BigDecimal>) : Spending {
        return Spending(
                Month.createFromComparable(jooqSpending.get(OPERATION.MONTH)),
                jooqSpending.get(OPERATION.CATEGORY_ID),
                jooqSpending.get(spendingSum).toDouble()
        )
    }

    private fun toOperation(operationRecord: OperationRecord): Operation {
        return Operation(
            operationRecord.accountId,
            Day(Month.createFromComparable(operationRecord.month), operationRecord.day),
            operationRecord.categoryId,
            operationRecord.amount.toDouble(),
            operationRecord.memo,
            operationRecord.id,
        )
    }
}
