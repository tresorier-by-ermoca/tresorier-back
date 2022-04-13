package open.tresorier.services

import open.tresorier.dependenciesinjection.ITest
import open.tresorier.dao.*
import open.tresorier.model.Operation
import open.tresorier.model.*
import open.tresorier.model.enum.ProfileEnum
import open.tresorier.utils.TestData

import java.text.SimpleDateFormat
import java.util.Date
import org.koin.core.component.inject
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions

class OperationServiceTest : ITest {

    val masterCategoryDao by inject<IMasterCategoryDao>()
    val categoryDao by inject<ICategoryDao>()
    val operationService by inject<OperationService>()
    val personService by inject<PersonService>()
    val budgetService by inject<BudgetService>()
    val accountService by inject<AccountService>()

    @Test
    fun testUpdateOperationWithoutChangingDate() {
        val mileva: Person = personService.createPerson(
            "Mileva Maric", "EPFZ!1896", "mileva@relativite.ch", ProfileEnum.PROFILE_USER
        )
        mileva.billingStatus = true
        val budget: Budget = budgetService.findByUser(mileva)[0]
        val account: Account = accountService.create(
            mileva, budget, "personal account", TestData.jan_14_2022, 10000
        )
        val masterCategory = MasterCategory("Fixed expense", budget.id)
        masterCategoryDao.insert(masterCategory)
        val category = Category("oftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category)
        val operationCreated = operationService.create(mileva, account, TestData.jan_16_2022, category, -1000, "encas")
        val orderInDayAtCreation = operationCreated.orderInDay              // needed for prevent side effect

        val operationModified = operationService.update(mileva, operationCreated, account, TestData.jan_16_2022, category, -1200, "encas")

        Assertions.assertEquals(orderInDayAtCreation, operationModified.orderInDay)
    }

    @Test
    fun testUpdateOperationWithChangingDate() {
        val emilie: Person = personService.createPerson(
            "Emilie du Châtelet", "1739_LaNatureDuFeu", "emilie@leibniz.fr", ProfileEnum.PROFILE_USER
        )
        emilie.billingStatus = true
        val budget: Budget = budgetService.findByUser(emilie)[0]
        val account: Account = accountService.create(
            emilie, budget, "personal account", TestData.jan_14_2022, 1000
        )
        val masterCategory = MasterCategory("Fixed expense", budget.id)
        masterCategoryDao.insert(masterCategory)
        val category = Category("oftenAllocatedCategory", masterCategory.id)
        categoryDao.insert(category)
        val operationCreated = operationService.create(emilie, account, TestData.jan_16_2022, category, 1000, "")
        val orderInDayAtCreation = operationCreated.orderInDay              // needed for prevent side effect
        
        val operationModified = operationService.update(emilie, operationCreated, account, TestData.jan_15_2022, null, null, null)

        Assertions.assertTrue(orderInDayAtCreation < operationModified.orderInDay)
    }

    @Test
    fun testOfxOperationDebit() {
        val rosalind: Person = personService.createPerson(
            "Rosalind Franklin", "Cliché_51", "rosalind@adn.uk", ProfileEnum.PROFILE_USER
        )
        rosalind.billingStatus = true
        val budget: Budget = budgetService.findByUser(rosalind)[0]
        val account: Account = accountService.create(
            rosalind, budget, "personal account", TestData.jan_14_2022, 1000
        )
        val ofxDebitOperation: String = "<STMTTRN><TRNTYPE>DEBIT<DTPOSTED>20220114<TRNAMT>-536,50<FITID>2802202220220228-03.01.56.182263<NAME>PRIX LOUISA GROSS HORWITZ<MEMO>PRIX LOUISA GROSS HORWITZ</STMTTRN>"

        val newOperation: Operation = operationService.createOperationFromOFX(account, ofxDebitOperation)
        val comparableOperation = operationService.create(rosalind, account, TestData.jan_14_2022, null, -53650, "PRIX LOUISA GROSS HORWITZ")

        Assertions.assertTrue(newOperation.isEquals(comparableOperation))
    }

    @Test
    fun testOfxOperationCredit() {
        val ada: Person = personService.createPerson(
            "Ada Lovelace", "Programme@1815", "ada@dev.uk", ProfileEnum.PROFILE_USER
        )
        ada.billingStatus = true
        val budget: Budget = budgetService.findByUser(ada)[0]
        val account: Account = accountService.create(
            ada, budget, "personal account", TestData.jan_14_2022, 1000
        )
        val ofxDebitOperation: String = "<STMTTRN><TRNTYPE>CREDIT<DTPOSTED>20220114<TRNAMT>+89,50<FITID>2802202220220228-03.01.56.182263<NAME>VIR SEPA Babbage<MEMO>VIR SEPA Babbage</STMTTRN>"

        val newOperation = operationService.createOperationFromOFX(account, ofxDebitOperation)
        val comparableOperation = operationService.create(ada, account, TestData.jan_14_2022, null, 8950, "VIR SEPA Babbage")

        Assertions.assertTrue(newOperation.isEquals(comparableOperation))
    }

    @Test
    fun testCuttingOperationsFromOfx() {
        val ofxFile: String = "<OFXHEADER:100DATA:OFXSGMLVERSION:102SECURITY:NONEENCODING:USASCIICHARSET:1252COMPRESSION:NONEOLDFILEUID:NONENEWFILEUID:NONE<OFX><SIGNONMSGSRSV1><SONRS><STATUS><CODE>0<SEVERITY>INFO</STATUS><DTSERVER>20220302<LANGUAGE>FRA<DTPROFUP>20220302<DTACCTUP>20220302</SONRS></SIGNONMSGSRSV1><BANKMSGSRSV1><STMTTRNRS><TRNUID>00<STATUS><CODE>0<SEVERITY>INFO</STATUS><STMTRS><CURDEF>EUR<BANKACCTFROM><BANKID>42559<BRANCHID>10000<ACCTID>04065601113<ACCTTYPE>SAVINGS</BANKACCTFROM><BANKTRANLIST><DTSTART>20220215<DTEND>20220228<STMTTRN><TRNTYPE>DEBIT<DTPOSTED>20220228<TRNAMT>-8,85<FITID>2802202220220228-17.02.34.872431<NAME>VIR SEPA DENISE EVE<MEMO>VIR SEPA DENISE EVE</STMTTRN><STMTTRN><TRNTYPE>CREDIT<DTPOSTED>20220215<TRNAMT>+40,00<FITID>1502202220220215-05.39.35.662478<NAME>POLONIUM<MEMO>POLONIUM</STMTTRN></BANKTRANLIST><LEDGERBAL><BALAMT>5693,5<DTASOF>20220302</LEDGERBAL></STMTRS></STMTTRNRS></BANKMSGSRSV1></OFX>"
        val listOperations: List<String> = operationService.separateOperationsOfOfxFile(ofxFile)
        
        Assertions.assertEquals(listOperations[0], "<STMTTRN><TRNTYPE>DEBIT<DTPOSTED>20220228<TRNAMT>-8,85<FITID>2802202220220228-17.02.34.872431<NAME>VIR SEPA DENISE EVE<MEMO>VIR SEPA DENISE EVE</STMTTRN>")
        Assertions.assertEquals(listOperations[1], "<STMTTRN><TRNTYPE>CREDIT<DTPOSTED>20220215<TRNAMT>+40,00<FITID>1502202220220215-05.39.35.662478<NAME>POLONIUM<MEMO>POLONIUM</STMTTRN>")
        Assertions.assertEquals(listOperations.size, 2)
    
    }

    @Test
    fun testOfxFileWithoutOperation() {
        val ofxFile: String = "<OFXHEADER:100DATA:OFXSGMLVERSION:102SECURITY:NONEENCODING:USASCIICHARSET:1252COMPRESSION:NONEOLDFILEUID:NONENEWFILEUID:NONE<OFX><SIGNONMSGSRSV1><SONRS><STATUS><CODE>0<SEVERITY>INFO</STATUS><DTSERVER>20220302<LANGUAGE>FRA<DTPROFUP>20220302<DTACCTUP>20220302</SONRS></SIGNONMSGSRSV1><BANKMSGSRSV1><STMTTRNRS><TRNUID>00<STATUS><CODE>0<SEVERITY>INFO</STATUS><STMTRS><CURDEF>EUR<BANKACCTFROM><BANKID>42559<BRANCHID>10000<ACCTID>04065601113<ACCTTYPE>SAVINGS</BANKACCTFROM><BANKTRANLIST><DTSTART>20220215<DTEND>20220228</BANKTRANLIST><LEDGERBAL><BALAMT>5693,5<DTASOF>20220302</LEDGERBAL></STMTRS></STMTTRNRS></BANKMSGSRSV1></OFX>"
        val listOperations: List<String> = operationService.separateOperationsOfOfxFile(ofxFile)

        Assertions.assertEquals(listOperations.size, 0)
    }

    @Test
    fun testOfxFileWithOnlyOneOperation() {
        val ofxFile: String = "<OFXHEADER:100DATA:OFXSGMLVERSION:102SECURITY:NONEENCODING:USASCIICHARSET:1252COMPRESSION:NONEOLDFILEUID:NONENEWFILEUID:NONE<OFX><SIGNONMSGSRSV1><SONRS><STATUS><CODE>0<SEVERITY>INFO</STATUS><DTSERVER>20220302<LANGUAGE>FRA<DTPROFUP>20220302<DTACCTUP>20220302</SONRS></SIGNONMSGSRSV1><BANKMSGSRSV1><STMTTRNRS><TRNUID>00<STATUS><CODE>0<SEVERITY>INFO</STATUS><STMTRS><CURDEF>EUR<BANKACCTFROM><BANKID>42559<BRANCHID>10000<ACCTID>04065601113<ACCTTYPE>SAVINGS</BANKACCTFROM><BANKTRANLIST><DTSTART>20220215<DTEND>20220228<STMTTRN><TRNTYPE>DEBIT<DTPOSTED>20220228<TRNAMT>-8,85<FITID>2802202220220228-17.02.34.872431<NAME>MERCURY REDSTONE 3<MEMO>MERCURY REDSTONE 3</STMTTRN></BANKTRANLIST><LEDGERBAL><BALAMT>5693,5<DTASOF>20220302</LEDGERBAL></STMTRS></STMTTRNRS></BANKMSGSRSV1></OFX>"
        val listOperations: List<String> = operationService.separateOperationsOfOfxFile(ofxFile)

        Assertions.assertEquals(listOperations.size, 1)
        Assertions.assertEquals(listOperations[0], "<STMTTRN><TRNTYPE>DEBIT<DTPOSTED>20220228<TRNAMT>-8,85<FITID>2802202220220228-17.02.34.872431<NAME>MERCURY REDSTONE 3<MEMO>MERCURY REDSTONE 3</STMTTRN>")
    }

    @Test
    fun testOfxOperationWithInvalidDate() {
        val agnodice: Person = personService.createPerson(
            "Agnodice", "Athène-350", "agnodice@gynéco.gr", ProfileEnum.PROFILE_USER
        )
        agnodice.billingStatus = true
        val budget: Budget = budgetService.findByUser(agnodice)[0]
        val account: Account = accountService.create(
            agnodice, budget, "personal account", TestData.jan_14_2022, 1000
        )
        val operationOfxWhithInvalidDate: String= "<STMTTRN><TRNTYPE>DEBIT<DTPOSTED>20221528<TRNAMT>-25,58<FITID>2802202220220228-14.32.39.703605<NAME>VIREMENT HEROPHILE ALEXANDRIE<MEMO>VIREMENT HEROPHILE ALEXANDRIE</STMTTRN>"
        val operationCreated: Operation = operationService.createOperationFromOFX(account, operationOfxWhithInvalidDate)

        Assertions.assertTrue(operationCreated.day.isEquals(Day.createFromComparable(Integer.parseInt(SimpleDateFormat("yyyyMMdd").format( Date())))))
        Assertions.assertTrue(operationCreated.memo.equals("problème de date VIREMENT HEROPHILE ALEXANDRIE"))
    }

    @Test
    fun testImportFileCorrect() {
        val hedy: Person = personService.createPerson(
            "Hedy Lamarr", "WIFI_2292387", "hedy@inventrice.at", ProfileEnum.PROFILE_USER
        )
        hedy.billingStatus = true
        val budget: Budget = budgetService.findByUser(hedy)[0]
        val account: Account = accountService.create(
            hedy, budget, "personal account", TestData.jan_14_2022, 1000
        )
        val operationList = "<STMTTRN><TRNTYPE>CREDIT<DTPOSTED>20220225<TRNAMT>+1,83<FITID>2502202220220225-08.36.00.593488<NAME>POSITIONNEMENT SATELLITES<MEMO>POSITIONNEMENT SATELLITES</STMTTRN><STMTTRN><TRNTYPE>CREDIT<DTPOSTED>20220225<TRNAMT>+1,83<FITID>2502202220220225-08.36.00.581463<NAME>ELECTRONIC FRONTIER FOUNDATION<MEMO>ELECTRONIC FRONTIER FOUNDATION</STMTTRN><STMTTRN><TRNTYPE>CREDIT<DTPOSTED>20220225<TRNAMT>+1,38<FITID>2502202220220225-08.36.00.568860<NAME>FHSS<MEMO>FHSS</STMTTRN>"
        val numberOperation = operationService.importOfxFile(hedy, account, operationList)

        Assertions.assertEquals(numberOperation, 3)
    }

    @Test
    fun testPassInEachOperationWithoutOperation() {
        val marion: Person = personService.createPerson(
            "Marion Créhange", "Thèsarde_1961", "marion@informatique.fr", ProfileEnum.PROFILE_USER
        )
        marion.billingStatus = true
        val budget: Budget = budgetService.findByUser(marion)[0]
        val account: Account = accountService.create(
            marion, budget, "personal account", TestData.jan_14_2022, 1000
        )
        val operationList = ""
        val numberOperation = operationService.importOfxFile(marion, account, operationList)

        Assertions.assertEquals(numberOperation, 0)
    }

}