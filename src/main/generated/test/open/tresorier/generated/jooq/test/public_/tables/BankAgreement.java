/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.test.public_.Keys;
import open.tresorier.generated.jooq.test.public_.Public;
import open.tresorier.generated.jooq.test.public_.tables.records.BankAgreementRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankAgreement extends TableImpl<BankAgreementRecord> {

    private static final long serialVersionUID = 252590728;

    /**
     * The reference instance of <code>PUBLIC.BANK_AGREEMENT</code>
     */
    public static final BankAgreement BANK_AGREEMENT = new BankAgreement();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BankAgreementRecord> getRecordType() {
        return BankAgreementRecord.class;
    }

    /**
     * The column <code>PUBLIC.BANK_AGREEMENT.ID</code>.
     */
    public final TableField<BankAgreementRecord, String> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BANK_AGREEMENT.BUDGET_ID</code>.
     */
    public final TableField<BankAgreementRecord, String> BUDGET_ID = createField(DSL.name("BUDGET_ID"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BANK_AGREEMENT.BANK_ID</code>.
     */
    public final TableField<BankAgreementRecord, String> BANK_ID = createField(DSL.name("BANK_ID"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.BANK_AGREEMENT.VALID_UNTIL</code>.
     */
    public final TableField<BankAgreementRecord, Long> VALID_UNTIL = createField(DSL.name("VALID_UNTIL"), org.jooq.impl.SQLDataType.BIGINT.defaultValue(org.jooq.impl.DSL.field("0", org.jooq.impl.SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>PUBLIC.BANK_AGREEMENT.NORDIGEN_REQUISITION_ID</code>.
     */
    public final TableField<BankAgreementRecord, String> NORDIGEN_REQUISITION_ID = createField(DSL.name("NORDIGEN_REQUISITION_ID"), org.jooq.impl.SQLDataType.VARCHAR(36).defaultValue(org.jooq.impl.DSL.field("NULL", org.jooq.impl.SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>PUBLIC.BANK_AGREEMENT.ARCHIVED</code>.
     */
    public final TableField<BankAgreementRecord, Boolean> ARCHIVED = createField(DSL.name("ARCHIVED"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("FALSE", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>PUBLIC.BANK_AGREEMENT.DELETED</code>.
     */
    public final TableField<BankAgreementRecord, Boolean> DELETED = createField(DSL.name("DELETED"), org.jooq.impl.SQLDataType.BOOLEAN.defaultValue(org.jooq.impl.DSL.field("FALSE", org.jooq.impl.SQLDataType.BOOLEAN)), this, "");

    /**
     * Create a <code>PUBLIC.BANK_AGREEMENT</code> table reference
     */
    public BankAgreement() {
        this(DSL.name("BANK_AGREEMENT"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.BANK_AGREEMENT</code> table reference
     */
    public BankAgreement(String alias) {
        this(DSL.name(alias), BANK_AGREEMENT);
    }

    /**
     * Create an aliased <code>PUBLIC.BANK_AGREEMENT</code> table reference
     */
    public BankAgreement(Name alias) {
        this(alias, BANK_AGREEMENT);
    }

    private BankAgreement(Name alias, Table<BankAgreementRecord> aliased) {
        this(alias, aliased, null);
    }

    private BankAgreement(Name alias, Table<BankAgreementRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> BankAgreement(Table<O> child, ForeignKey<O, BankAgreementRecord> key) {
        super(child, key, BANK_AGREEMENT);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<BankAgreementRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_4;
    }

    @Override
    public List<UniqueKey<BankAgreementRecord>> getKeys() {
        return Arrays.<UniqueKey<BankAgreementRecord>>asList(Keys.CONSTRAINT_4);
    }

    @Override
    public List<ForeignKey<BankAgreementRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<BankAgreementRecord, ?>>asList(Keys.CONSTRAINT_49);
    }

    public Budget budget() {
        return new Budget(this, Keys.CONSTRAINT_49);
    }

    @Override
    public BankAgreement as(String alias) {
        return new BankAgreement(DSL.name(alias), this);
    }

    @Override
    public BankAgreement as(Name alias) {
        return new BankAgreement(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public BankAgreement rename(String name) {
        return new BankAgreement(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public BankAgreement rename(Name name) {
        return new BankAgreement(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Long, String, Boolean, Boolean> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
