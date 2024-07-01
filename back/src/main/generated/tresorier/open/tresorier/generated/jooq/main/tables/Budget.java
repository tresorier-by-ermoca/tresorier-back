/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import open.tresorier.generated.jooq.main.Keys;
import open.tresorier.generated.jooq.main.Public;
import open.tresorier.generated.jooq.main.tables.Account.AccountPath;
import open.tresorier.generated.jooq.main.tables.BankAgreement.BankAgreementPath;
import open.tresorier.generated.jooq.main.tables.MasterCategory.MasterCategoryPath;
import open.tresorier.generated.jooq.main.tables.Person.PersonPath;
import open.tresorier.generated.jooq.main.tables.records.BudgetRecord;

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
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Budget extends TableImpl<BudgetRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.budget</code>
     */
    public static final Budget BUDGET = new Budget();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<BudgetRecord> getRecordType() {
        return BudgetRecord.class;
    }

    /**
     * The column <code>public.budget.id</code>.
     */
    public final TableField<BudgetRecord, String> ID = createField(DSL.name("id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.budget.person_id</code>.
     */
    public final TableField<BudgetRecord, String> PERSON_ID = createField(DSL.name("person_id"), SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>public.budget.name</code>.
     */
    public final TableField<BudgetRecord, String> NAME = createField(DSL.name("name"), SQLDataType.VARCHAR(100).nullable(false), this, "");

    /**
     * The column <code>public.budget.deleted</code>.
     */
    public final TableField<BudgetRecord, Boolean> DELETED = createField(DSL.name("deleted"), SQLDataType.BOOLEAN.defaultValue(DSL.field(DSL.raw("false"), SQLDataType.BOOLEAN)), this, "");

    /**
     * The column <code>public.budget.profile</code>.
     */
    public final TableField<BudgetRecord, String> PROFILE = createField(DSL.name("profile"), SQLDataType.VARCHAR(36).nullable(false).defaultValue(DSL.field(DSL.raw("'PROFILE_USER'::character varying"), SQLDataType.VARCHAR)), this, "");

    private Budget(Name alias, Table<BudgetRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Budget(Name alias, Table<BudgetRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>public.budget</code> table reference
     */
    public Budget(String alias) {
        this(DSL.name(alias), BUDGET);
    }

    /**
     * Create an aliased <code>public.budget</code> table reference
     */
    public Budget(Name alias) {
        this(alias, BUDGET);
    }

    /**
     * Create a <code>public.budget</code> table reference
     */
    public Budget() {
        this(DSL.name("budget"), null);
    }

    public <O extends Record> Budget(Table<O> path, ForeignKey<O, BudgetRecord> childPath, InverseForeignKey<O, BudgetRecord> parentPath) {
        super(path, childPath, parentPath, BUDGET);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class BudgetPath extends Budget implements Path<BudgetRecord> {

        private static final long serialVersionUID = 1L;
        public <O extends Record> BudgetPath(Table<O> path, ForeignKey<O, BudgetRecord> childPath, InverseForeignKey<O, BudgetRecord> parentPath) {
            super(path, childPath, parentPath);
        }
        private BudgetPath(Name alias, Table<BudgetRecord> aliased) {
            super(alias, aliased);
        }

        @Override
        public BudgetPath as(String alias) {
            return new BudgetPath(DSL.name(alias), this);
        }

        @Override
        public BudgetPath as(Name alias) {
            return new BudgetPath(alias, this);
        }

        @Override
        public BudgetPath as(Table<?> alias) {
            return new BudgetPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public UniqueKey<BudgetRecord> getPrimaryKey() {
        return Keys.BUDGET_PKEY;
    }

    @Override
    public List<ForeignKey<BudgetRecord, ?>> getReferences() {
        return Arrays.asList(Keys.BUDGET__BUDGET_PERSON_ID_FKEY);
    }

    private transient PersonPath _person;

    /**
     * Get the implicit join path to the <code>public.person</code> table.
     */
    public PersonPath person() {
        if (_person == null)
            _person = new PersonPath(this, Keys.BUDGET__BUDGET_PERSON_ID_FKEY, null);

        return _person;
    }

    private transient AccountPath _account;

    /**
     * Get the implicit to-many join path to the <code>public.account</code>
     * table
     */
    public AccountPath account() {
        if (_account == null)
            _account = new AccountPath(this, null, Keys.ACCOUNT__ACCOUNT_BUDGET_ID_FKEY.getInverseKey());

        return _account;
    }

    private transient BankAgreementPath _bankAgreement;

    /**
     * Get the implicit to-many join path to the
     * <code>public.bank_agreement</code> table
     */
    public BankAgreementPath bankAgreement() {
        if (_bankAgreement == null)
            _bankAgreement = new BankAgreementPath(this, null, Keys.BANK_AGREEMENT__BANK_AGREEMENT_BUDGET_ID_FKEY.getInverseKey());

        return _bankAgreement;
    }

    private transient MasterCategoryPath _masterCategory;

    /**
     * Get the implicit to-many join path to the
     * <code>public.master_category</code> table
     */
    public MasterCategoryPath masterCategory() {
        if (_masterCategory == null)
            _masterCategory = new MasterCategoryPath(this, null, Keys.MASTER_CATEGORY__MASTER_CATEGORY_BUDGET_ID_FKEY.getInverseKey());

        return _masterCategory;
    }

    @Override
    public Budget as(String alias) {
        return new Budget(DSL.name(alias), this);
    }

    @Override
    public Budget as(Name alias) {
        return new Budget(alias, this);
    }

    @Override
    public Budget as(Table<?> alias) {
        return new Budget(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public Budget rename(String name) {
        return new Budget(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Budget rename(Name name) {
        return new Budget(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public Budget rename(Table<?> name) {
        return new Budget(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Budget where(Condition condition) {
        return new Budget(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Budget where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Budget where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Budget where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Budget where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Budget where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Budget where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public Budget where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Budget whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public Budget whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
