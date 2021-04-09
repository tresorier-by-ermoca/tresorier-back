package open.tresorier.dao


import open.tresorier.dependenciesinjection.ITest
import open.tresorier.exception.TresorierException
import open.tresorier.model.*
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.koin.core.component.inject

open class AllocationDaoTest : ITest {

    val allocationDao by inject<IAllocationDao>()
    val personDao by inject<IPersonDao>()
    val budgetDao by inject<IBudgetDao>()
    val masterCategoryDao by inject<IMasterCategoryDao>()
    val categoryDao by inject<ICategoryDao>()

    @Test
    fun getOwner() {
        val allocation = allocationDao.getById("allocation1")
        val expectedOwner = personDao.getById("person1")
        val owner = allocationDao.getOwner(allocation)
        Assertions.assertEquals(expectedOwner.email, owner.email)
    }

    @Test
    fun getOwnerForUnstored() {
        val allocation = Allocation(Month(12,2020),"251",-254.25)
        val exception = Assertions.assertThrows(TresorierException::class.java) {
            allocationDao.getOwner(allocation)
        }
        Assertions.assertEquals("the given object appears to have no owner", exception.message)
    }

    @Test
    fun cannotHaveAllocationForInvalidMonth() {
        val allocation = Allocation(Month(14,1225), "category1", -254.25)
        val exception = Assertions.assertThrows(TresorierException::class.java) {
            allocationDao.insert(allocation)
        }
        Assertions.assertEquals("could not insert allocation : $allocation", exception.message)
    }

    @Test
    fun cannotHaveAllocationForInvalidMonth2() {
        val allocation = Allocation(Month(-5, 1225), "category1", -254.25)
        val exception = Assertions.assertThrows(TresorierException::class.java) {
            allocationDao.insert(allocation)
        }
        Assertions.assertEquals("could not insert allocation : $allocation", exception.message)
    }

    @Test
    fun cannotInsertMultipleAllocationForTheSameMonthAndCategory() {
       // TO DO
    }

    @Test
    fun getAllAllocationsOfBudget() {
        val budget = Budget("wellAllocatedBudget", "person1")
        budgetDao.insert(budget)
        val masterCategory = MasterCategory("Fixed expense", budget.id)
        masterCategoryDao.insert(masterCategory)
        val category = Category("oftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category)
        val allocationList = listOf(
            Allocation(Month(1,2020),category.id,40.00),
            Allocation(Month(12,2020),category.id,20.00)
        )
        for (allocation in allocationList) {
            allocationDao.insert(allocation)
        }
        val result = allocationDao.findByBudget(budget)
        Assertions.assertEquals(2, result.size)
        Assertions.assertEquals(allocationList[0].id, result[0].id)
        Assertions.assertEquals(allocationList[1].id, result[1].id)
    }


    @Test
    fun getAllAllocationsOfBudgetUntilMonth() {
        val budget = Budget("wellAllocatedBudget", "person1")
        budgetDao.insert(budget)
        val masterCategory = MasterCategory("Fixed expense", budget.id)
        masterCategoryDao.insert(masterCategory)
        val category = Category("oftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category)
        val allocationList = listOf(
                Allocation(Month(1,2020),category.id,40.00),
                Allocation(Month(12,2020),category.id,20.00),
                Allocation(Month(1,2021),category.id,20.00),
                Allocation(Month(2,2022),category.id,20.00),
                Allocation(Month(3,2022),category.id,20.00)

        )
        for (allocation in allocationList) {
            allocationDao.insert(allocation)
        }
        val result = allocationDao.findByBudget(budget, Month(2,2022))
        Assertions.assertEquals(4, result.size)
        Assertions.assertEquals(allocationList[0].id, result[0].id)
        Assertions.assertEquals(allocationList[1].id, result[1].id)
        Assertions.assertEquals(allocationList[2].id, result[2].id)
        Assertions.assertEquals(allocationList[3].id, result[3].id)
    }

    @Test
    fun getAllAllocationsOfNonExistingBudget() {
        val budget = Budget("wellAllocatedBudget", "person1")
        val result = allocationDao.findByBudget(budget)
        Assertions.assertEquals(0, result.size)
    }
}