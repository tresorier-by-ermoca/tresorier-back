/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import java.time.OffsetDateTime;

import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.SessionsRecord;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Row12;
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
public class Sessions extends TableImpl<SessionsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SESSIONS</code>
     */
    public static final Sessions SESSIONS = new Sessions();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<SessionsRecord> getRecordType() {
        return SessionsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.ID</code>.
     */
    public final TableField<SessionsRecord, Integer> ID = createField(DSL.name("ID"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.USER_NAME</code>.
     */
    public final TableField<SessionsRecord, String> USER_NAME = createField(DSL.name("USER_NAME"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.SERVER</code>.
     */
    public final TableField<SessionsRecord, String> SERVER = createField(DSL.name("SERVER"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.CLIENT_ADDR</code>.
     */
    public final TableField<SessionsRecord, String> CLIENT_ADDR = createField(DSL.name("CLIENT_ADDR"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.CLIENT_INFO</code>.
     */
    public final TableField<SessionsRecord, String> CLIENT_INFO = createField(DSL.name("CLIENT_INFO"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.SESSION_START</code>.
     */
    public final TableField<SessionsRecord, OffsetDateTime> SESSION_START = createField(DSL.name("SESSION_START"), SQLDataType.TIMESTAMPWITHTIMEZONE(9), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.ISOLATION_LEVEL</code>.
     */
    public final TableField<SessionsRecord, String> ISOLATION_LEVEL = createField(DSL.name("ISOLATION_LEVEL"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT</code>.
     */
    public final TableField<SessionsRecord, String> STATEMENT = createField(DSL.name("STATEMENT"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATEMENT_START</code>.
     */
    public final TableField<SessionsRecord, OffsetDateTime> STATEMENT_START = createField(DSL.name("STATEMENT_START"), SQLDataType.TIMESTAMPWITHTIMEZONE(9), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.CONTAINS_UNCOMMITTED</code>.
     */
    public final TableField<SessionsRecord, Boolean> CONTAINS_UNCOMMITTED = createField(DSL.name("CONTAINS_UNCOMMITTED"), SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.STATE</code>.
     */
    public final TableField<SessionsRecord, String> STATE = createField(DSL.name("STATE"), SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SESSIONS.BLOCKER_ID</code>.
     */
    public final TableField<SessionsRecord, Integer> BLOCKER_ID = createField(DSL.name("BLOCKER_ID"), SQLDataType.INTEGER, this, "");

    private Sessions(Name alias, Table<SessionsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Sessions(Name alias, Table<SessionsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table());
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table
     * reference
     */
    public Sessions(String alias) {
        this(DSL.name(alias), SESSIONS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SESSIONS</code> table
     * reference
     */
    public Sessions(Name alias) {
        this(alias, SESSIONS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.SESSIONS</code> table reference
     */
    public Sessions() {
        this(DSL.name("SESSIONS"), null);
    }

    public <O extends Record> Sessions(Table<O> child, ForeignKey<O, SessionsRecord> key) {
        super(child, key, SESSIONS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public Sessions as(String alias) {
        return new Sessions(DSL.name(alias), this);
    }

    @Override
    public Sessions as(Name alias) {
        return new Sessions(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessions rename(String name) {
        return new Sessions(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Sessions rename(Name name) {
        return new Sessions(name, null);
    }

    // -------------------------------------------------------------------------
    // Row12 type methods
    // -------------------------------------------------------------------------

    @Override
    public Row12<Integer, String, String, String, String, OffsetDateTime, String, String, OffsetDateTime, Boolean, String, Integer> fieldsRow() {
        return (Row12) super.fieldsRow();
    }
}
