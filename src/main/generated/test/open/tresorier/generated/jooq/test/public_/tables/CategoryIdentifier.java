/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables;


import java.util.Arrays;
import java.util.List;

import open.tresorier.generated.jooq.test.public_.Keys;
import open.tresorier.generated.jooq.test.public_.Public;
import open.tresorier.generated.jooq.test.public_.tables.records.CategoryIdentifierRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row4;
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
public class CategoryIdentifier extends TableImpl<CategoryIdentifierRecord> {

    private static final long serialVersionUID = 1355070619;

    /**
     * The reference instance of <code>PUBLIC.CATEGORY_IDENTIFIER</code>
     */
    public static final CategoryIdentifier CATEGORY_IDENTIFIER = new CategoryIdentifier();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CategoryIdentifierRecord> getRecordType() {
        return CategoryIdentifierRecord.class;
    }

    /**
     * The column <code>PUBLIC.CATEGORY_IDENTIFIER.ID</code>.
     */
    public final TableField<CategoryIdentifierRecord, String> ID = createField(DSL.name("ID"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CATEGORY_IDENTIFIER.BUDGET_ID</code>.
     */
    public final TableField<CategoryIdentifierRecord, String> BUDGET_ID = createField(DSL.name("BUDGET_ID"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CATEGORY_IDENTIFIER.PATTERN</code>.
     */
    public final TableField<CategoryIdentifierRecord, String> PATTERN = createField(DSL.name("PATTERN"), org.jooq.impl.SQLDataType.VARCHAR(36).nullable(false), this, "");

    /**
     * The column <code>PUBLIC.CATEGORY_IDENTIFIER.CATEGORY_ID</code>.
     */
    public final TableField<CategoryIdentifierRecord, String> CATEGORY_ID = createField(DSL.name("CATEGORY_ID"), org.jooq.impl.SQLDataType.VARCHAR(36), this, "");

    /**
     * Create a <code>PUBLIC.CATEGORY_IDENTIFIER</code> table reference
     */
    public CategoryIdentifier() {
        this(DSL.name("CATEGORY_IDENTIFIER"), null);
    }

    /**
     * Create an aliased <code>PUBLIC.CATEGORY_IDENTIFIER</code> table reference
     */
    public CategoryIdentifier(String alias) {
        this(DSL.name(alias), CATEGORY_IDENTIFIER);
    }

    /**
     * Create an aliased <code>PUBLIC.CATEGORY_IDENTIFIER</code> table reference
     */
    public CategoryIdentifier(Name alias) {
        this(alias, CATEGORY_IDENTIFIER);
    }

    private CategoryIdentifier(Name alias, Table<CategoryIdentifierRecord> aliased) {
        this(alias, aliased, null);
    }

    private CategoryIdentifier(Name alias, Table<CategoryIdentifierRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    public <O extends Record> CategoryIdentifier(Table<O> child, ForeignKey<O, CategoryIdentifierRecord> key) {
        super(child, key, CATEGORY_IDENTIFIER);
    }

    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    @Override
    public UniqueKey<CategoryIdentifierRecord> getPrimaryKey() {
        return Keys.CONSTRAINT_B;
    }

    @Override
    public List<UniqueKey<CategoryIdentifierRecord>> getKeys() {
        return Arrays.<UniqueKey<CategoryIdentifierRecord>>asList(Keys.CONSTRAINT_B);
    }

    @Override
    public CategoryIdentifier as(String alias) {
        return new CategoryIdentifier(DSL.name(alias), this);
    }

    @Override
    public CategoryIdentifier as(Name alias) {
        return new CategoryIdentifier(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryIdentifier rename(String name) {
        return new CategoryIdentifier(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public CategoryIdentifier rename(Name name) {
        return new CategoryIdentifier(name, null);
    }

    // -------------------------------------------------------------------------
    // Row4 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, String, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }
}
