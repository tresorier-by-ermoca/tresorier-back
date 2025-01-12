/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import open.tresorier.generated.jooq.test.Keys;
import open.tresorier.generated.jooq.test.Public;
import open.tresorier.generated.jooq.test.tables.Account.AccountPath;
import open.tresorier.generated.jooq.test.tables.Category.CategoryPath;
import open.tresorier.generated.jooq.test.tables.records.OperationRecord;

import org.jooq.Check;
import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.Record;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Operation extends TableImpl<OperationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.operation</code>
     */
    public static final Operation OPERATION = new Operation();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<OperationRecord> getRecordType() {
        return OperationRecord.class;
    }

    /**
     * The column <code>public.operation.id</code>.
     */
    public final TableField<OperationRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.operation.account_id</code>.
     */
    public final TableField<OperationRecord, String> ACCOUNT_ID = createField(DSL.name("account_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.operation.month</code>.
     */
    public final TableField<OperationRecord, Integer> MONTH = createField(DSL.name("month"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.operation.day</code>.
     */
    public final TableField<OperationRecord, Integer> DAY = createField(DSL.name("day"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>public.operation.category_id</code>.
     */
    public final TableField<OperationRecord, String> CATEGORY_ID = createField(DSL.name("category_id"), SQLDataType.VARCHAR(36).defaultValue(DSL.field(DSL.raw("NULL::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.operation.memo</code>.
     */
    public final TableField<OperationRecord, String> MEMO = createField(DSL.name("memo"), SQLDataType.VARCHAR(280).defaultValue(DSL.field(DSL.raw("NULL::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.operation.amount</code>.
     */
    public final TableField<OperationRecord, Integer> AMOUNT = createField(DSL.name("amount"), SQLDataType.INTEGER.nullable(false).defaultValue(DSL.field(DSL.raw("0"), SQLDataType.INTEGER)), this, "");

    /**
     * The column <code>public.operation.order_in_day</code>.
     */
    public final TableField<OperationRecord, Long> ORDER_IN_DAY = createField(DSL.name("order_in_day"), SQLDataType.BIGINT.nullable(false).defaultValue(DSL.field(DSL.raw("1"), SQLDataType.BIGINT)), this, "");

    /**
     * The column <code>public.operation.pending</code>.
     */
    public final TableField<OperationRecord, Boolean> PENDING = createField(DSL.name("pending"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.operation.locked</code>.
     */
    public final TableField<OperationRecord, Boolean> LOCKED = createField(DSL.name("locked"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.operation.mother_operation_id</code>.
     */
    public final TableField<OperationRecord, String> MOTHER_OPERATION_ID = createField(DSL.name("mother_operation_id"), SQLDataType.VARCHAR(36).defaultValue(DSL.field(DSL.raw("NULL::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.operation.import_identifier</code>.
     */
    public final TableField<OperationRecord, String> IMPORT_IDENTIFIER = createField(DSL.name("import_identifier"), SQLDataType.VARCHAR(150).defaultValue(DSL.field(DSL.raw("NULL::character varying"), SQLDataType.VARCHAR)), this, "");

    /**
     * The column <code>public.operation.import_timestamp</code>.
     */
    public final TableField<OperationRecord, Long> IMPORT_TIMESTAMP = createField(DSL.name("import_timestamp"), SQLDataType.BIGINT, this, "");

    private Operation(Name alias, Table<OperationRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Operation(Name alias, Table<OperationRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.operation</code> table reference
     */
    public Operation(String alias) {
        this(DSL.name(alias), OPERATION);
    }

    /**
     * Create an aliased <code>public.operation</code> table reference
     */
    public Operation(Name alias) {
        this(alias, OPERATION);
    }

    /**
     * Create a <code>public.operation</code> table reference
     */
    public Operation() {
        this(DSL.name("operation"), null);
    }

    public <O extends Record> Operation(Table<O> path, ForeignKey<O, OperationRecord> childPath, InverseForeignKey<O, OperationRecord> parentPath) {
        super(path, childPath, parentPath, OPERATION);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class OperationPath extends Operation implements Path<OperationRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> OperationPath(Table<O> path, ForeignKey<O, OperationRecord> childPath, InverseForeignKey<O, OperationRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private OperationPath(Name alias, Table<OperationRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public OperationPath as(String alias) {
            return new OperationPath(DSL.name(alias), this);
        }

        @Override
        public OperationPath as(Name alias) {
            return new OperationPath(alias, this);
        }

        @Override
        public OperationPath as(Table<?> alias) {
            return new OperationPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<OperationRecord> getPrimaryKey() {
        return Keys.OPERATION_PKEY;
    }

    @Override
    public List<UniqueKey<OperationRecord>> getUniqueKeys() {
        return Arrays.asList(Keys.OPERATION_IMPORT_IDENTIFIER_KEY);
    }

    @Override
    public List<ForeignKey<OperationRecord, ?>> getReferences() {
        return Arrays.asList(Keys.OPERATION__OPERATION_ACCOUNT_ID_FKEY, Keys.OPERATION__OPERATION_CATEGORY_ID_FKEY);
    }

    private transient AccountPath _account;

    /**
     * Get the implicit join path to the <code>public.account</code> table.
     */
    public AccountPath account() {
        if (_account == null)
            _account = new AccountPath(this, Keys.OPERATION__OPERATION_ACCOUNT_ID_FKEY, null);

        return _account;
    }

    private transient CategoryPath _category;

    /**
     * Get the implicit join path to the <code>public.category</code> table.
     */
    public CategoryPath category() {
        if (_category == null)
            _category = new CategoryPath(this, Keys.OPERATION__OPERATION_CATEGORY_ID_FKEY, null);

        return _category;
    }

    @Override
    public List<Check<OperationRecord>> getChecks() {
        return Arrays.asList(
            Internal.createCheck(this, DSL.name("category_and_account_are_from_same_budget"), "(are_category_and_account_from_same_budget(category_id, account_id))", true),
            Internal.createCheck(this, DSL.name("no_invalid_day_operation"), "((day < 32))", true),
            Internal.createCheck(this, DSL.name("no_invalid_month_operation"), "(((month % 100) < 13))", true),
            Internal.createCheck(this, DSL.name("no_negative_day_operation"), "((day > 0))", true),
            Internal.createCheck(this, DSL.name("no_negative_month_operation"), "(((month % 100) > 0))", true)
        );
    }

    @Override
    public Operation as(String alias) {
        return new Operation(DSL.name(alias), this);
    }

    @Override
    public Operation as(Name alias) {
        return new Operation(alias, this);
    }

    @Override
    public Operation as(Table<?> alias) {
        return new Operation(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Operation rename(String name) {
        return new Operation(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Operation rename(Name name) {
        return new Operation(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Operation rename(Table<?> name) {
        return new Operation(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Operation where(Condition condition) {
        return new Operation(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Operation where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Operation where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Operation where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Operation where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Operation where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Operation where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Operation where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Operation whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Operation whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
