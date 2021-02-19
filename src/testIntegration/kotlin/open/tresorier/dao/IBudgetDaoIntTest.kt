package open.tresorier.dao

import open.tresorier.dependenciesinjection.IIntegrationTest
import open.tresorier.exception.TresorierException
import open.tresorier.model.Budget
import open.tresorier.model.Person
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.koin.core.component.inject

class BudgetDaoTest : IIntegrationTest {

    val budgetDao by inject<IBudgetDao>()
    val personDao by inject<IPersonDao>()

    @Test fun testFindByPersonId() {
        val anne = Person("anne", "ahahahahah", "anna@mail.eu")
        personDao.insert(anne)
        val lucie = Person("lucie", "lululu", "lucie@mail.eu")
        personDao.insert(lucie)
        val budgetAnne1 = Budget("anne-B1", anne.id)
        budgetDao.insert(budgetAnne1)
        val budgetAnne2 = Budget("anne-B2", anne.id)
        budgetDao.insert(budgetAnne2)
        val budgetLucie1 = Budget("lucie-B1", lucie.id)
        budgetDao.insert(budgetLucie1)
        val anneBudgets : List<Budget> = budgetDao.findByPersonId(anne.id)
        val anneBudgetsName : MutableList<String> = mutableListOf()
        for (budget in anneBudgets){
            anneBudgetsName.add(budget.name)
        }
        val expectedAnneBudgetsName : MutableList<String> = mutableListOf("anne-B1", "anne-B2")

        assertEquals(expectedAnneBudgetsName, anneBudgetsName)
    }

    @Test fun testInsertWithInvalidPersonId() {
        val invalidBudget = Budget("anne-B3", "not_a_real_id")
        val exception = Assertions.assertThrows(TresorierException::class.java) {
            budgetDao.insert(invalidBudget)
        }
        assertEquals("could not insert budget : $invalidBudget", exception.message)

    }

    @Test fun testUpdateWithInvalidPersonId() {
        val celine = Person("celine", "cecece", "cecile@mail.eu")
        personDao.insert(celine)
        val budgetCeline = Budget("celine-B1", celine.id)
        budgetDao.insert(budgetCeline)
        budgetCeline.personId = "not_a_real_id"
        val exception = Assertions.assertThrows(TresorierException::class.java) {
            budgetDao.update(budgetCeline)
        }
        assertEquals("could not update budget : $budgetCeline", exception.message)

    }
}