/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.DomainsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row14;
import org.jooq.Schema;
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
public class Domains extends TableImpl<DomainsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.DOMAINS</code>
     */
    public static final Domains DOMAINS = new Domains();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<DomainsRecord> getRecordType() {
        return DomainsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_CATALOG</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_CATALOG = createField(DSL.name("DOMAIN_CATALOG"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_SCHEMA</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_SCHEMA = createField(DSL.name("DOMAIN_SCHEMA"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DOMAIN_NAME</code>.
     */
    public final TableField<DomainsRecord, String> DOMAIN_NAME = createField(DSL.name("DOMAIN_NAME"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.COLUMN_DEFAULT</code>.
     */
    public final TableField<DomainsRecord, String> COLUMN_DEFAULT = createField(DSL.name("COLUMN_DEFAULT"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.IS_NULLABLE</code>.
     */
    public final TableField<DomainsRecord, String> IS_NULLABLE = createField(DSL.name("IS_NULLABLE"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.DATA_TYPE</code>.
     */
    public final TableField<DomainsRecord, Integer> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.PRECISION</code>.
     */
    public final TableField<DomainsRecord, Integer> PRECISION = createField(DSL.name("PRECISION"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.SCALE</code>.
     */
    public final TableField<DomainsRecord, Integer> SCALE = createField(DSL.name("SCALE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.TYPE_NAME</code>.
     */
    public final TableField<DomainsRecord, String> TYPE_NAME = createField(DSL.name("TYPE_NAME"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.SELECTIVITY</code>.
     */
    public final TableField<DomainsRecord, Integer> SELECTIVITY = createField(DSL.name("SELECTIVITY"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.CHECK_CONSTRAINT</code>.
     */
    public final TableField<DomainsRecord, String> CHECK_CONSTRAINT = createField(DSL.name("CHECK_CONSTRAINT"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.REMARKS</code>.
     */
    public final TableField<DomainsRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.SQL</code>.
     */
    public final TableField<DomainsRecord, String> SQL = createField(DSL.name("SQL"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.DOMAINS.ID</code>.
     */
    public final TableField<DomainsRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER, this, "");

    private Domains(Name alias, Table<DomainsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Domains(Name alias, Table<DomainsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
     */
    public Domains(String alias) {
        this(DSL.name(alias), DOMAINS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
     */
    public Domains(Name alias) {
        this(alias, DOMAINS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.DOMAINS</code> table reference
     */
    public Domains() {
        this(DSL.name("DOMAINS"), null);
    }

    public <O extends Record> Domains(Table<O> child, ForeignKey<O, DomainsRecord> key) {
        super(child, key, DOMAINS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Domains as(String alias) {
        return new Domains(DSL.name(alias), this);
    }

    @Override
    public Domains as(Name alias) {
        return new Domains(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(String name) {
        return new Domains(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Domains rename(Name name) {
        return new Domains(name, null);
    }

    // -------------------------------------------------------------------------
    // Row14 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row14<String, String, String, String, String, Integer, Integer, Integer, String, Integer, String, String, String, Integer> fieldsRow() {
        return (Row14) super.fieldsRow();
    }
}
