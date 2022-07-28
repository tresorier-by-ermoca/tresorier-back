/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.daos;


import java.util.List;

import open.tresorier.generated.jooq.main.tables.BankAgreement;
import open.tresorier.generated.jooq.main.tables.records.BankAgreementRecord;

import org.jooq.Configuration;
import org.jooq.impl.DAOImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankAgreementDao extends DAOImpl<BankAgreementRecord, open.tresorier.generated.jooq.main.tables.pojos.BankAgreement, String> {

    /**
     * Create a new BankAgreementDao without any configuration
     */
    public BankAgreementDao() {
        super(BankAgreement.BANK_AGREEMENT, open.tresorier.generated.jooq.main.tables.pojos.BankAgreement.class);
    }

    /**
     * Create a new BankAgreementDao with an attached configuration
     */
    public BankAgreementDao(Configuration configuration) {
        super(BankAgreement.BANK_AGREEMENT, open.tresorier.generated.jooq.main.tables.pojos.BankAgreement.class, configuration);
    }

    @Override
    public String getId(open.tresorier.generated.jooq.main.tables.pojos.BankAgreement object) {
        return object.getId();
    }

    /**
     * Fetch records that have <code>id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchRangeOfId(String lowerInclusive, String upperInclusive) {
        return fetchRange(BankAgreement.BANK_AGREEMENT.ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchById(String... values) {
        return fetch(BankAgreement.BANK_AGREEMENT.ID, values);
    }

    /**
     * Fetch a unique record that has <code>id = value</code>
     */
    public open.tresorier.generated.jooq.main.tables.pojos.BankAgreement fetchOneById(String value) {
        return fetchOne(BankAgreement.BANK_AGREEMENT.ID, value);
    }

    /**
     * Fetch records that have <code>budget_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchRangeOfBudgetId(String lowerInclusive, String upperInclusive) {
        return fetchRange(BankAgreement.BANK_AGREEMENT.BUDGET_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>budget_id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchByBudgetId(String... values) {
        return fetch(BankAgreement.BANK_AGREEMENT.BUDGET_ID, values);
    }

    /**
     * Fetch records that have <code>bank_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchRangeOfBankId(String lowerInclusive, String upperInclusive) {
        return fetchRange(BankAgreement.BANK_AGREEMENT.BANK_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>bank_id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchByBankId(String... values) {
        return fetch(BankAgreement.BANK_AGREEMENT.BANK_ID, values);
    }

    /**
     * Fetch records that have <code>valid_until BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchRangeOfValidUntil(Long lowerInclusive, Long upperInclusive) {
        return fetchRange(BankAgreement.BANK_AGREEMENT.VALID_UNTIL, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>valid_until IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchByValidUntil(Long... values) {
        return fetch(BankAgreement.BANK_AGREEMENT.VALID_UNTIL, values);
    }

    /**
     * Fetch records that have <code>nordigen_requisition_id BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchRangeOfNordigenRequisitionId(String lowerInclusive, String upperInclusive) {
        return fetchRange(BankAgreement.BANK_AGREEMENT.NORDIGEN_REQUISITION_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>nordigen_requisition_id IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchByNordigenRequisitionId(String... values) {
        return fetch(BankAgreement.BANK_AGREEMENT.NORDIGEN_REQUISITION_ID, values);
    }

    /**
     * Fetch records that have <code>archived BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchRangeOfArchived(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(BankAgreement.BANK_AGREEMENT.ARCHIVED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>archived IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchByArchived(Boolean... values) {
        return fetch(BankAgreement.BANK_AGREEMENT.ARCHIVED, values);
    }

    /**
     * Fetch records that have <code>deleted BETWEEN lowerInclusive AND upperInclusive</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchRangeOfDeleted(Boolean lowerInclusive, Boolean upperInclusive) {
        return fetchRange(BankAgreement.BANK_AGREEMENT.DELETED, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>deleted IN (values)</code>
     */
    public List<open.tresorier.generated.jooq.main.tables.pojos.BankAgreement> fetchByDeleted(Boolean... values) {
        return fetch(BankAgreement.BANK_AGREEMENT.DELETED, values);
    }
}
