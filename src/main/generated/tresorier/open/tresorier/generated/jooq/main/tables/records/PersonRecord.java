/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.records;


import open.tresorier.generated.jooq.main.tables.Person;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record12;
import org.jooq.Row12;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PersonRecord extends UpdatableRecordImpl<PersonRecord> implements Record12<String, String, String, String, Long, Integer, Boolean, String, Boolean, Long, String, Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.person.id</code>.
     */
    public PersonRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.person.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.person.email</code>.
     */
    public PersonRecord setEmail(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.person.email</code>.
     */
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.person.name</code>.
     */
    public PersonRecord setName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.person.name</code>.
     */
    public String getName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.person.password</code>.
     */
    public PersonRecord setPassword(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.person.password</code>.
     */
    public String getPassword() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.person.unlockingdate</code>.
     */
    public PersonRecord setUnlockingdate(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.person.unlockingdate</code>.
     */
    public Long getUnlockingdate() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.person.loginattemptcount</code>.
     */
    public PersonRecord setLoginattemptcount(Integer value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.person.loginattemptcount</code>.
     */
    public Integer getLoginattemptcount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>public.person.deleted</code>.
     */
    public PersonRecord setDeleted(Boolean value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.person.deleted</code>.
     */
    public Boolean getDeleted() {
        return (Boolean) get(6);
    }

    /**
     * Setter for <code>public.person.billing_id</code>.
     */
    public PersonRecord setBillingId(String value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.person.billing_id</code>.
     */
    public String getBillingId() {
        return (String) get(7);
    }

    /**
     * Setter for <code>public.person.billing_status</code>.
     */
    public PersonRecord setBillingStatus(Boolean value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.person.billing_status</code>.
     */
    public Boolean getBillingStatus() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>public.person.creation_date</code>.
     */
    public PersonRecord setCreationDate(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.person.creation_date</code>.
     */
    public Long getCreationDate() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.person.style</code>.
     */
    public PersonRecord setStyle(String value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.person.style</code>.
     */
    public String getStyle() {
        return (String) get(10);
    }

    /**
     * Setter for <code>public.person.dyslexia</code>.
     */
    public PersonRecord setDyslexia(Boolean value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.person.dyslexia</code>.
     */
    public Boolean getDyslexia() {
        return (Boolean) get(11);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record12 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row12<String, String, String, String, Long, Integer, Boolean, String, Boolean, Long, String, Boolean> fieldsRow() {
        return (Row12) super.fieldsRow();
    }

    @Override
    public Row12<String, String, String, String, Long, Integer, Boolean, String, Boolean, Long, String, Boolean> valuesRow() {
        return (Row12) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Person.PERSON.ID;
    }

    @Override
    public Field<String> field2() {
        return Person.PERSON.EMAIL;
    }

    @Override
    public Field<String> field3() {
        return Person.PERSON.NAME;
    }

    @Override
    public Field<String> field4() {
        return Person.PERSON.PASSWORD;
    }

    @Override
    public Field<Long> field5() {
        return Person.PERSON.UNLOCKINGDATE;
    }

    @Override
    public Field<Integer> field6() {
        return Person.PERSON.LOGINATTEMPTCOUNT;
    }

    @Override
    public Field<Boolean> field7() {
        return Person.PERSON.DELETED;
    }

    @Override
    public Field<String> field8() {
        return Person.PERSON.BILLING_ID;
    }

    @Override
    public Field<Boolean> field9() {
        return Person.PERSON.BILLING_STATUS;
    }

    @Override
    public Field<Long> field10() {
        return Person.PERSON.CREATION_DATE;
    }

    @Override
    public Field<String> field11() {
        return Person.PERSON.STYLE;
    }

    @Override
    public Field<Boolean> field12() {
        return Person.PERSON.DYSLEXIA;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getEmail();
    }

    @Override
    public String component3() {
        return getName();
    }

    @Override
    public String component4() {
        return getPassword();
    }

    @Override
    public Long component5() {
        return getUnlockingdate();
    }

    @Override
    public Integer component6() {
        return getLoginattemptcount();
    }

    @Override
    public Boolean component7() {
        return getDeleted();
    }

    @Override
    public String component8() {
        return getBillingId();
    }

    @Override
    public Boolean component9() {
        return getBillingStatus();
    }

    @Override
    public Long component10() {
        return getCreationDate();
    }

    @Override
    public String component11() {
        return getStyle();
    }

    @Override
    public Boolean component12() {
        return getDyslexia();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getEmail();
    }

    @Override
    public String value3() {
        return getName();
    }

    @Override
    public String value4() {
        return getPassword();
    }

    @Override
    public Long value5() {
        return getUnlockingdate();
    }

    @Override
    public Integer value6() {
        return getLoginattemptcount();
    }

    @Override
    public Boolean value7() {
        return getDeleted();
    }

    @Override
    public String value8() {
        return getBillingId();
    }

    @Override
    public Boolean value9() {
        return getBillingStatus();
    }

    @Override
    public Long value10() {
        return getCreationDate();
    }

    @Override
    public String value11() {
        return getStyle();
    }

    @Override
    public Boolean value12() {
        return getDyslexia();
    }

    @Override
    public PersonRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public PersonRecord value2(String value) {
        setEmail(value);
        return this;
    }

    @Override
    public PersonRecord value3(String value) {
        setName(value);
        return this;
    }

    @Override
    public PersonRecord value4(String value) {
        setPassword(value);
        return this;
    }

    @Override
    public PersonRecord value5(Long value) {
        setUnlockingdate(value);
        return this;
    }

    @Override
    public PersonRecord value6(Integer value) {
        setLoginattemptcount(value);
        return this;
    }

    @Override
    public PersonRecord value7(Boolean value) {
        setDeleted(value);
        return this;
    }

    @Override
    public PersonRecord value8(String value) {
        setBillingId(value);
        return this;
    }

    @Override
    public PersonRecord value9(Boolean value) {
        setBillingStatus(value);
        return this;
    }

    @Override
    public PersonRecord value10(Long value) {
        setCreationDate(value);
        return this;
    }

    @Override
    public PersonRecord value11(String value) {
        setStyle(value);
        return this;
    }

    @Override
    public PersonRecord value12(Boolean value) {
        setDyslexia(value);
        return this;
    }

    @Override
    public PersonRecord values(String value1, String value2, String value3, String value4, Long value5, Integer value6, Boolean value7, String value8, Boolean value9, Long value10, String value11, Boolean value12) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PersonRecord
     */
    public PersonRecord() {
        super(Person.PERSON);
    }

    /**
     * Create a detached, initialised PersonRecord
     */
    public PersonRecord(String id, String email, String name, String password, Long unlockingdate, Integer loginattemptcount, Boolean deleted, String billingId, Boolean billingStatus, Long creationDate, String style, Boolean dyslexia) {
        super(Person.PERSON);

        setId(id);
        setEmail(email);
        setName(name);
        setPassword(password);
        setUnlockingdate(unlockingdate);
        setLoginattemptcount(loginattemptcount);
        setDeleted(deleted);
        setBillingId(billingId);
        setBillingStatus(billingStatus);
        setCreationDate(creationDate);
        setStyle(style);
        setDyslexia(dyslexia);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised PersonRecord
     */
    public PersonRecord(open.tresorier.generated.jooq.main.tables.pojos.Person value) {
        super(Person.PERSON);

        if (value != null) {
            setId(value.getId());
            setEmail(value.getEmail());
            setName(value.getName());
            setPassword(value.getPassword());
            setUnlockingdate(value.getUnlockingdate());
            setLoginattemptcount(value.getLoginattemptcount());
            setDeleted(value.getDeleted());
            setBillingId(value.getBillingId());
            setBillingStatus(value.getBillingStatus());
            setCreationDate(value.getCreationDate());
            setStyle(value.getStyle());
            setDyslexia(value.getDyslexia());
            resetChangedOnNotNull();
        }
    }
}
