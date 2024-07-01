/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import java.util.Collection;

import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.TablesRecord;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Tables extends TableImpl<TablesRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.TABLES</code>
     */
    public static final Tables TABLES = new Tables();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<TablesRecord> getRecordType() {
        return TablesRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CATALOG</code>.
     */
    public final TableField<TablesRecord, String> TABLE_CATALOG = createField(DSL.name("TABLE_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_SCHEMA</code>.
     */
    public final TableField<TablesRecord, String> TABLE_SCHEMA = createField(DSL.name("TABLE_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_NAME</code>.
     */
    public final TableField<TablesRecord, String> TABLE_NAME = createField(DSL.name("TABLE_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_TYPE</code>.
     */
    public final TableField<TablesRecord, String> TABLE_TYPE = createField(DSL.name("TABLE_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.IS_INSERTABLE_INTO</code>.
     */
    public final TableField<TablesRecord, String> IS_INSERTABLE_INTO = createField(DSL.name("IS_INSERTABLE_INTO"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.COMMIT_ACTION</code>.
     */
    public final TableField<TablesRecord, String> COMMIT_ACTION = createField(DSL.name("COMMIT_ACTION"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.STORAGE_TYPE</code>.
     */
    public final TableField<TablesRecord, String> STORAGE_TYPE = createField(DSL.name("STORAGE_TYPE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.REMARKS</code>.
     */
    public final TableField<TablesRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.LAST_MODIFICATION</code>.
     */
    public final TableField<TablesRecord, Long> LAST_MODIFICATION = createField(DSL.name("LAST_MODIFICATION"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.TABLE_CLASS</code>.
     */
    public final TableField<TablesRecord, String> TABLE_CLASS = createField(DSL.name("TABLE_CLASS"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.TABLES.ROW_COUNT_ESTIMATE</code>.
     */
    public final TableField<TablesRecord, Long> ROW_COUNT_ESTIMATE = createField(DSL.name("ROW_COUNT_ESTIMATE"), SQLDataType.BIGINT, this, "");

    private Tables(Name alias, Table<TablesRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Tables(Name alias, Table<TablesRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(String alias) {
        this(DSL.name(alias), TABLES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables(Name alias) {
        this(alias, TABLES);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.TABLES</code> table reference
     */
    public Tables() {
        this(DSL.name("TABLES"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Tables as(String alias) {
        return new Tables(DSL.name(alias), this);
    }

    @Override
    public Tables as(Name alias) {
        return new Tables(alias, this);
    }

    @Override
    public Tables as(Table<?> alias) {
        return new Tables(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(String name) {
        return new Tables(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Name name) {
        return new Tables(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Tables rename(Table<?> name) {
        return new Tables(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Tables where(Condition condition) {
        return new Tables(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Tables where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Tables where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Tables where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Tables where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Tables where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Tables where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Tables where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Tables whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Tables whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
