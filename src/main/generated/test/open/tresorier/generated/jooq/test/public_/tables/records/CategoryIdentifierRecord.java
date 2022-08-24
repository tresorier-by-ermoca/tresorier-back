/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.records;


import open.tresorier.generated.jooq.test.public_.tables.CategoryIdentifier;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryIdentifierRecord extends UpdatableRecordImpl<CategoryIdentifierRecord> implements Record4<String, String, String, String> {

    private static final long serialVersionUID = 1663776267;

    /**
     * Setter for <code>PUBLIC.CATEGORY_IDENTIFIER.ID</code>.
     */
    public CategoryIdentifierRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.CATEGORY_IDENTIFIER.ID</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>PUBLIC.CATEGORY_IDENTIFIER.BUDGET_ID</code>.
     */
    public CategoryIdentifierRecord setBudgetId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.CATEGORY_IDENTIFIER.BUDGET_ID</code>.
     */
    public String getBudgetId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>PUBLIC.CATEGORY_IDENTIFIER.PATTERN</code>.
     */
    public CategoryIdentifierRecord setPattern(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.CATEGORY_IDENTIFIER.PATTERN</code>.
     */
    public String getPattern() {
        return (String) get(2);
    }

    /**
     * Setter for <code>PUBLIC.CATEGORY_IDENTIFIER.CATEGORY_ID</code>.
     */
    public CategoryIdentifierRecord setCategoryId(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>PUBLIC.CATEGORY_IDENTIFIER.CATEGORY_ID</code>.
     */
    public String getCategoryId() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, String, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return CategoryIdentifier.CATEGORY_IDENTIFIER.ID;
    }

    @Override
    public Field<String> field2() {
        return CategoryIdentifier.CATEGORY_IDENTIFIER.BUDGET_ID;
    }

    @Override
    public Field<String> field3() {
        return CategoryIdentifier.CATEGORY_IDENTIFIER.PATTERN;
    }

    @Override
    public Field<String> field4() {
        return CategoryIdentifier.CATEGORY_IDENTIFIER.CATEGORY_ID;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getBudgetId();
    }

    @Override
    public String component3() {
        return getPattern();
    }

    @Override
    public String component4() {
        return getCategoryId();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getBudgetId();
    }

    @Override
    public String value3() {
        return getPattern();
    }

    @Override
    public String value4() {
        return getCategoryId();
    }

    @Override
    public CategoryIdentifierRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public CategoryIdentifierRecord value2(String value) {
        setBudgetId(value);
        return this;
    }

    @Override
    public CategoryIdentifierRecord value3(String value) {
        setPattern(value);
        return this;
    }

    @Override
    public CategoryIdentifierRecord value4(String value) {
        setCategoryId(value);
        return this;
    }

    @Override
    public CategoryIdentifierRecord values(String value1, String value2, String value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CategoryIdentifierRecord
     */
    public CategoryIdentifierRecord() {
        super(CategoryIdentifier.CATEGORY_IDENTIFIER);
    }

    /**
     * Create a detached, initialised CategoryIdentifierRecord
     */
    public CategoryIdentifierRecord(String id, String budgetId, String pattern, String categoryId) {
        super(CategoryIdentifier.CATEGORY_IDENTIFIER);

        set(0, id);
        set(1, budgetId);
        set(2, pattern);
        set(3, categoryId);
    }
}
