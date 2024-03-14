/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.records;


import open.tresorier.generated.jooq.test.public_.tables.Budget;

import org.jooq.Record1;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BudgetRecord extends UpdatableRecordImpl<BudgetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>PUBLIC.BUDGET.ID</code>.
     */
    public BudgetRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BUDGET.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.BUDGET.PERSON_ID</code>.
     */
    public BudgetRecord setPersonId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BUDGET.PERSON_ID</code>.
     */
    public String getPersonId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.BUDGET.NAME</code>.
     */
    public BudgetRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BUDGET.NAME</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.BUDGET.DELETED</code>.
     */
    public BudgetRecord setDeleted(Boolean value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BUDGET.DELETED</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>PUBLIC.BUDGET.PROFILE</code>.
     */
    public BudgetRecord setProfile(String value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.BUDGET.PROFILE</code>.
     */
    public String getProfile() {
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
     * Create a detached BudgetRecord
     */
    public BudgetRecord() {
        super(Budget.BUDGET);
    }

    /**
     * Create a detached, initialised BudgetRecord
     */
    public BudgetRecord(String id, String personId, String name, Boolean deleted, String profile) {
        super(Budget.BUDGET);

        setId(id);
        setPersonId(personId);
        setName(name);
        setDeleted(deleted);
        setProfile(profile);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised BudgetRecord
     */
    public BudgetRecord(open.tresorier.generated.jooq.test.public_.tables.pojos.Budget value) {
        super(Budget.BUDGET);

        if (value != null) {
            setId(value.getId());
            setPersonId(value.getPersonId());
            setName(value.getName());
            setDeleted(value.getDeleted());
            setProfile(value.getProfile());
            resetChangedOnNotNull();
        }
    }
}
