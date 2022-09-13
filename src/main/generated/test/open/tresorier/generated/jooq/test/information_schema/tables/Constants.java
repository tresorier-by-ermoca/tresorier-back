/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.ConstantsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row7;
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
public class Constants extends TableImpl<ConstantsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.CONSTANTS</code>
     */
    public static final Constants CONSTANTS = new Constants();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<ConstantsRecord> getRecordType() {
        return ConstantsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_CATALOG</code>.
     */
    public final TableField<ConstantsRecord, String> CONSTANT_CATALOG = createField(DSL.name("CONSTANT_CATALOG"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_SCHEMA</code>.
     */
    public final TableField<ConstantsRecord, String> CONSTANT_SCHEMA = createField(DSL.name("CONSTANT_SCHEMA"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.CONSTANT_NAME</code>.
     */
    public final TableField<ConstantsRecord, String> CONSTANT_NAME = createField(DSL.name("CONSTANT_NAME"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.DATA_TYPE</code>.
     */
    public final TableField<ConstantsRecord, Integer> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.REMARKS</code>.
     */
    public final TableField<ConstantsRecord, String> REMARKS = createField(DSL.name("REMARKS"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.SQL</code>.
     */
    public final TableField<ConstantsRecord, String> SQL = createField(DSL.name("SQL"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.CONSTANTS.ID</code>.
     */
    public final TableField<ConstantsRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER, this, "");

    private Constants(Name alias, Table<ConstantsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Constants(Name alias, Table<ConstantsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CONSTANTS</code> table
     * reference
     */
    public Constants(String alias) {
        this(DSL.name(alias), CONSTANTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.CONSTANTS</code> table
     * reference
     */
    public Constants(Name alias) {
        this(alias, CONSTANTS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.CONSTANTS</code> table reference
     */
    public Constants() {
        this(DSL.name("CONSTANTS"), null);
    }

    public <O extends Record> Constants(Table<O> child, ForeignKey<O, ConstantsRecord> key) {
        super(child, key, CONSTANTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Constants as(String alias) {
        return new Constants(DSL.name(alias), this);
    }

    @Override
    public Constants as(Name alias) {
        return new Constants(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Constants rename(String name) {
        return new Constants(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Constants rename(Name name) {
        return new Constants(name, null);
    }

    // -------------------------------------------------------------------------
    // Row7 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, String, Integer, String, String, Integer> fieldsRow() {
        return (Row7) super.fieldsRow();
    }
}
