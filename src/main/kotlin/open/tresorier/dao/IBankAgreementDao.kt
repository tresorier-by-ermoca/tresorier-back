package open.tresorier.dao

import open.tresorier.model.banking.BankAgreement
import open.tresorier.model.Budget
import open.tresorier.model.Person

interface IBankAgreementDao {
    fun insert(agreement: BankAgreement) : BankAgreement
    fun update(agreement: BankAgreement) : BankAgreement
    fun getById(id: String): BankAgreement
    fun getOwner(bankAgreement: BankAgreement) : Person
    fun findByBudget(budget: Budget): List<BankAgreement>
}