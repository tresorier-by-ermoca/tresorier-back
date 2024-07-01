/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.records;


import open.tresorier.generated.jooq.test.public_.tables.BankAccount;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class BankAccountRecord extends UpdatableRecordImpl<BankAccountRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.BANK_ACCOUNT.ID</code>.
     */
    public BankAccountRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BANK_ACCOUNT.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.BANK_ACCOUNT.NAME</code>.
     */
    public BankAccountRecord setName(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BANK_ACCOUNT.NAME</code>.
     */
    public String getName() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.BANK_ACCOUNT.AGREEMENT_ID</code>.
     */
    public BankAccountRecord setAgreementId(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BANK_ACCOUNT.AGREEMENT_ID</code>.
     */
    public String getAgreementId() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.BANK_ACCOUNT.DELETED</code>.
     */
    public BankAccountRecord setDeleted(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BANK_ACCOUNT.DELETED</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>PUBLIC.BANK_ACCOUNT.BANK_ID</code>.
     */
    public BankAccountRecord setBankId(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BANK_ACCOUNT.BANK_ID</code>.
     */
    public String getBankId() {
        return (String) get(4);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached BankAccountRecord
     */
    public BankAccountRecord() {
        super(BankAccount.BANK_ACCOUNT);
    }

    /**
     * Create a detached, initialised BankAccountRecord
     */
    public BankAccountRecord(String id, String name, String agreementId, Boolean deleted, String bankId) {
        super(BankAccount.BANK_ACCOUNT);

        setId(id);
        setName(name);
        setAgreementId(agreementId);
        setDeleted(deleted);
        setBankId(bankId);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised BankAccountRecord
     */
    public BankAccountRecord(open.tresorier.generated.jooq.test.public_.tables.pojos.BankAccount value) {
        super(BankAccount.BANK_ACCOUNT);

        if (value != null) {
            setId(value.getId());
            setName(value.getName());
            setAgreementId(value.getAgreementId());
            setDeleted(value.getDeleted());
            setBankId(value.getBankId());
            resetChangedOnNotNull();
        }
    }
}
