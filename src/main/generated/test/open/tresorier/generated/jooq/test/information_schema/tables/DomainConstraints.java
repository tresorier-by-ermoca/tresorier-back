/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import java.util.function.Function;

import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.DomainConstraintsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Function9;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Records;
import org.jooq.Row9;
import org.jooq.Schema;
import org.jooq.SelectField;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DomainConstraints extends TableImpl<DomainConstraintsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code>
     */
    public static final DomainConstraints DOMAIN_CONSTRAINTS = new DomainConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainConstraintsRecord> getRecordType() {
        return DomainConstraintsRecord.class;
    }

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<DomainConstraintsRecord, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<DomainConstraintsRecord, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public final TableField<DomainConstraintsRecord, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.DOMAIN_CATALOG</code>.
     */
    public final TableField<DomainConstraintsRecord, String> DOMAIN_CATALOG = createField(DSL.name("DOMAIN_CATALOG"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.DOMAIN_SCHEMA</code>.
     */
    public final TableField<DomainConstraintsRecord, String> DOMAIN_SCHEMA = createField(DSL.name("DOMAIN_SCHEMA"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.DOMAIN_NAME</code>.
     */
    public final TableField<DomainConstraintsRecord, String> DOMAIN_NAME = createField(DSL.name("DOMAIN_NAME"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.IS_DEFERRABLE</code>.
     */
    public final TableField<DomainConstraintsRecord, String> IS_DEFERRABLE = createField(DSL.name("IS_DEFERRABLE"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.INITIALLY_DEFERRED</code>.
     */
    public final TableField<DomainConstraintsRecord, String> INITIALLY_DEFERRED = createField(DSL.name("INITIALLY_DEFERRED"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.REMARKS</code>.
     */
    public final TableField<DomainConstraintsRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(1000000000), this, "");

    private DomainConstraints(Name alias, Table<DomainConstraintsRecord> aliased) {
        this(alias, aliased, null);
    }

    private DomainConstraints(Name alias, Table<DomainConstraintsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code>
     * table reference
     */
    public DomainConstraints(String alias) {
        this(DSL.name(alias), DOMAIN_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code>
     * table reference
     */
    public DomainConstraints(Name alias) {
        this(alias, DOMAIN_CONSTRAINTS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code> table
     * reference
     */
    public DomainConstraints() {
        this(DSL.name("DOMAIN_CONSTRAINTS"), null);
    }

    public <O extends Record> DomainConstraints(Table<O> child, ForeignKey<O, DomainConstraintsRecord> key) {
        super(child, key, DOMAIN_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public DomainConstraints as(String alias) {
        return new DomainConstraints(DSL.name(alias), this);
    }

    @Override
    public DomainConstraints as(Name alias) {
        return new DomainConstraints(alias, this);
    }

    @Override
    public DomainConstraints as(Table<?> alias) {
        return new DomainConstraints(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainConstraints rename(String name) {
        return new DomainConstraints(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainConstraints rename(Name name) {
        return new DomainConstraints(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public DomainConstraints rename(Table<?> name) {
        return new DomainConstraints(name.getQualifiedName(), null);
    }

    // -------------------------------------------------------------------------
    // Row9 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row9<String, String, String, String, String, String, String, String, String> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Function)}.
     */
    public <U> SelectField<U> mapping(Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(Records.mapping(from));
    }

    /**
     * Convenience mapping calling {@link SelectField#convertFrom(Class,
     * Function)}.
     */
    public <U> SelectField<U> mapping(Class<U> toType, Function9<? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? super String, ? extends U> from) {
        return convertFrom(toType, Records.mapping(from));
    }
}
