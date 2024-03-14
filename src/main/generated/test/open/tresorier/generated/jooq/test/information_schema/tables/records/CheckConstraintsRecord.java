/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.records;


import open.tresorier.generated.jooq.test.information_schema.tables.CheckConstraints;

import org.jooq.impl.TableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CheckConstraintsRecord extends TableRecordImpl<CheckConstraintsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public CheckConstraintsRecord setConstraintCatalog(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public CheckConstraintsRecord setConstraintSchema(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return (String) get(1);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public CheckConstraintsRecord setConstraintName(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(2);
    }

    /**
     * Setter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public CheckConstraintsRecord setCheckClause(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS.CHECK_CLAUSE</code>.
     */
    public String getCheckClause() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CheckConstraintsRecord
     */
    public CheckConstraintsRecord() {
        super(CheckConstraints.CHECK_CONSTRAINTS);
    }

    /**
     * Create a detached, initialised CheckConstraintsRecord
     */
    public CheckConstraintsRecord(String constraintCatalog, String constraintSchema, String constraintName, String checkClause) {
        super(CheckConstraints.CHECK_CONSTRAINTS);

        setConstraintCatalog(constraintCatalog);
        setConstraintSchema(constraintSchema);
        setConstraintName(constraintName);
        setCheckClause(checkClause);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised CheckConstraintsRecord
     */
    public CheckConstraintsRecord(open.tresorier.generated.jooq.test.information_schema.tables.pojos.CheckConstraints value) {
        super(CheckConstraints.CHECK_CONSTRAINTS);

        if (value != null) {
            setConstraintCatalog(value.getConstraintCatalog());
            setConstraintSchema(value.getConstraintSchema());
            setConstraintName(value.getConstraintName());
            setCheckClause(value.getCheckClause());
            resetChangedOnNotNull();
        }
    }
}
