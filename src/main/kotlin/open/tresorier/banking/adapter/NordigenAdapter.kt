package open.tresorier.banking.adapter

import org.json.JSONArray
import open.tresorier.utils.HTTPConnection
import open.tresorier.utils.Properties
import open.tresorier.utils.PropertiesEnum.*
import open.tresorier.banking.IBankingPort
import open.tresorier.exception.BankingException
import org.json.JSONObject
import open.tresorier.model.Account
import open.tresorier.model.Person
import open.tresorier.model.Day
import open.tresorier.model.Operation
import open.tresorier.model.banking.Bank
import open.tresorier.model.banking.BankAccount
import open.tresorier.model.banking.BankAgreement
import open.tresorier.dao.IBankAgreementDao
import open.tresorier.dao.IBankAccountDao
import open.tresorier.utils.Time

class NordigenAdapter(private val bankAgreementDao: IBankAgreementDao) : IBankingPort {

    override fun getLinkForUserAgreement(person: Person, bankId: String) : String {
        val url = "https://ob.nordigen.com/api/v2/requisitions/"
        val bankAgreement = BankAgreement(person.id, bankId)

        val headerProperties = mapOf(
            "Content-Type" to "application/json",
            "Accept" to "application/json",
            "User-Agent" to "Agatha/1.0",
            "Authorization" to "Bearer ${this.getToken()}"
        )

        val bodyProperties = mapOf(
            "redirect" to "https://beta.agatha-budget.fr/bank?agreementId=${bankAgreement.id}",
            "institution_id" to bankId,
            "user_language" to "FR"
        )

        val connection = HTTPConnection.sendRequest("POST", url, headerProperties, bodyProperties)

        if (connection.responseCode !in HTTPConnection.validResponseCodes) {
            throw BankingException("could not get AgreementLink : ${connection.errorStream.reader().use { it.readText() }}")
		}

        val response = JSONObject(connection.inputStream.reader().use { it.readText() })
        // create Requisition 
        bankAgreement.nordigenRequisitionId = response.get("id").toString()
        this.bankAgreementDao.insert(bankAgreement)
        return response.get("link").toString()
    }

    override fun revokeAgreement(person: Person, agreement: BankAgreement) {
        

    }

    override fun getBankAccountList(agreement: BankAgreement) : List<BankAccount> {
        val url = "https://ob.nordigen.com/api/v2/requisitions/${agreement.nordigenRequisitionId}/"

        val headerProperties = mapOf(
            "Content-Type" to "application/json",
            "Accept" to "application/json",
            "User-Agent" to "Agatha/1.0",
            "Authorization" to "Bearer ${this.getToken()}"
        )

        val connection = HTTPConnection.sendRequest("GET", url, headerProperties)

        if (connection.responseCode !in HTTPConnection.validResponseCodes) {
            throw BankingException("could not get Requisition for ${agreement.id} : ${connection.errorStream.reader().use { it.readText() }}")
		}
        val response = JSONObject(connection.inputStream.reader().use { it.readText() })
        val accounts = response.getJSONArray("accounts")
     
        var accountList = listOf<BankAccount>()
        for (i in 1..accounts.length()) {
            val id = accounts.getString(i-1);
            val bankAccount = BankAccount(this.getAccountName(id), agreement.id, id)
            accountList = accountList + bankAccount 
        }
        return accountList
    }

    private fun getAccountName(id: String) : String {
        val url = "https://ob.nordigen.com/api/v2/accounts/${id}/details/"

        val headerProperties = mapOf(
            "Content-Type" to "application/json",
            "Accept" to "application/json",
            "User-Agent" to "Agatha/1.0",
            "Authorization" to "Bearer ${this.getToken()}"
        )

        val connection = HTTPConnection.sendRequest("GET", url, headerProperties)

        if (connection.responseCode !in HTTPConnection.validResponseCodes) {
            throw BankingException("could not get account details for ${id} : ${connection.errorStream.reader().use { it.readText() }}")
		}
        val response = JSONObject(connection.inputStream.reader().use { it.readText() })
        return response.getJSONObject("account").getString("name")
    }

    override fun getOperations(account: Account) : List<Operation> {
        // date format is 2022-07-07
        val from="2022-01-01"
        val url = "https://ob.nordigen.com/api/v2/accounts/${account.bankAccountId}/transactions/?date_from=${from}"

        val headerProperties = mapOf(
            "Content-Type" to "application/json",
            "Accept" to "application/json",
            "User-Agent" to "Agatha/1.0",
            "Authorization" to "Bearer ${this.getToken()}"
        )

        val connection = HTTPConnection.sendRequest("GET", url, headerProperties)

        if (connection.responseCode !in HTTPConnection.validResponseCodes) {
            throw BankingException("could not get account transaction for ${account.id} : ${connection.errorStream.reader().use { it.readText() }}")
		}
        val response = JSONObject(connection.inputStream.reader().use { it.readText() })
        // add new transaction for account

        var operationList = listOf<Operation>()

        var nordigenOperations = response.getJSONObject("transactions").getJSONArray("booked")
        for (i in 1..nordigenOperations.length()) {
            val nordigenOperation = nordigenOperations.getJSONObject(i-1);
            val operation = this.createOperation(account, false, nordigenOperation)
            operationList = operationList + operation 
        }

        nordigenOperations = response.getJSONObject("transactions").getJSONArray("pending")
        for (i in 1..nordigenOperations.length()) {
            val nordigenOperation = nordigenOperations.getJSONObject(i-1);
            val operation = this.createOperation(account, true, nordigenOperation)
            operationList = operationList + operation 
        }

        return operationList
    }

    private fun createOperation(account: Account, pending: Boolean, nordigenOperation: JSONObject) : Operation {
        val date : String? = nordigenOperation.optString("bookingDate")
        val day : Day = date?.let {Day.createFromComparable(it.replace("-","").toInt())} ?: Day.today()
        val amount = (nordigenOperation.getJSONObject("transactionAmount").getFloat("amount") * 100).toInt()
        val orderInDay = Time.now()
       // val memo = nordigenOperation.optJSONArray("remittanceInformationUnstructuredArray")?.getString(0)
        val memo = nordigenOperation.optString("entryReference")
        val importIdentifier = day.toString() + "__" + amount + "__" + memo
        return Operation(
            account.id, day, null, amount, orderInDay, 
            memo, pending, false, importIdentifier
        )
    }

    override fun getAvailableBanks() : List<Bank> {
        return listOf<Bank>(
            Bank("CREDIT_COOPERATIF_CCOPFRPPXXX",
             "Crédit Coopératif",
             "https://cdn.nordigen.com/ais/CREDIT_COOPERATIF_CCOPFRPPXXX.png"
            )
        )
    }

    fun getToken() : String {
        val properties = Properties()

        val url = "https://ob.nordigen.com/api/v2/token/new/"

        val headerProperties = mapOf(
            "Content-Type" to "application/json",
            "Accept" to "application/json",
            "User-Agent" to "Agatha/1.0",
        )

        val bodyProperties = mapOf(
            "secret_id" to properties.get(NORDIGEN_SECRET_ID),
            "secret_key" to properties.get(NORDIGEN_SECRET_KEY)
        )

        val connection = HTTPConnection.sendRequest("POST", url, headerProperties, bodyProperties)

        if (connection.responseCode !in HTTPConnection.validResponseCodes) {
            throw BankingException("could not get Token : ${connection.errorStream.reader().use { it.readText() }}")
		}

        val response = JSONObject(connection.inputStream.reader().use { it.readText() })
        return response.get("access").toString()
    }

}