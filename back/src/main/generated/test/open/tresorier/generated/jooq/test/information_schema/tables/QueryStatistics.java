/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables;


import java.util.Collection;

import open.tresorier.generated.jooq.test.information_schema.InformationSchema;
import open.tresorier.generated.jooq.test.information_schema.tables.records.QueryStatisticsRecord;

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
public class QueryStatistics extends TableImpl<QueryStatisticsRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code>
     */
    public static final QueryStatistics QUERY_STATISTICS = new QueryStatistics();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<QueryStatisticsRecord> getRecordType() {
        return QueryStatisticsRecord.class;
    }

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.SQL_STATEMENT</code>.
     */
    public final TableField<QueryStatisticsRecord, String> SQL_STATEMENT = createField(DSL.name("SQL_STATEMENT"), SQLDataType.VARCHAR(1000000000), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.EXECUTION_COUNT</code>.
     */
    public final TableField<QueryStatisticsRecord, Integer> EXECUTION_COUNT = createField(DSL.name("EXECUTION_COUNT"), SQLDataType.INTEGER, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MIN_EXECUTION_TIME</code>.
     */
    public final TableField<QueryStatisticsRecord, Double> MIN_EXECUTION_TIME = createField(DSL.name("MIN_EXECUTION_TIME"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MAX_EXECUTION_TIME</code>.
     */
    public final TableField<QueryStatisticsRecord, Double> MAX_EXECUTION_TIME = createField(DSL.name("MAX_EXECUTION_TIME"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.CUMULATIVE_EXECUTION_TIME</code>.
     */
    public final TableField<QueryStatisticsRecord, Double> CUMULATIVE_EXECUTION_TIME = createField(DSL.name("CUMULATIVE_EXECUTION_TIME"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.AVERAGE_EXECUTION_TIME</code>.
     */
    public final TableField<QueryStatisticsRecord, Double> AVERAGE_EXECUTION_TIME = createField(DSL.name("AVERAGE_EXECUTION_TIME"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.STD_DEV_EXECUTION_TIME</code>.
     */
    public final TableField<QueryStatisticsRecord, Double> STD_DEV_EXECUTION_TIME = createField(DSL.name("STD_DEV_EXECUTION_TIME"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MIN_ROW_COUNT</code>.
     */
    public final TableField<QueryStatisticsRecord, Long> MIN_ROW_COUNT = createField(DSL.name("MIN_ROW_COUNT"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.MAX_ROW_COUNT</code>.
     */
    public final TableField<QueryStatisticsRecord, Long> MAX_ROW_COUNT = createField(DSL.name("MAX_ROW_COUNT"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.CUMULATIVE_ROW_COUNT</code>.
     */
    public final TableField<QueryStatisticsRecord, Long> CUMULATIVE_ROW_COUNT = createField(DSL.name("CUMULATIVE_ROW_COUNT"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.AVERAGE_ROW_COUNT</code>.
     */
    public final TableField<QueryStatisticsRecord, Double> AVERAGE_ROW_COUNT = createField(DSL.name("AVERAGE_ROW_COUNT"), SQLDataType.DOUBLE, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.QUERY_STATISTICS.STD_DEV_ROW_COUNT</code>.
     */
    public final TableField<QueryStatisticsRecord, Double> STD_DEV_ROW_COUNT = createField(DSL.name("STD_DEV_ROW_COUNT"), SQLDataType.DOUBLE, this, "");

    private QueryStatistics(Name alias, Table<QueryStatisticsRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private QueryStatistics(Name alias, Table<QueryStatisticsRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code> table
     * reference
     */
    public QueryStatistics(String alias) {
        this(DSL.name(alias), QUERY_STATISTICS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code> table
     * reference
     */
    public QueryStatistics(Name alias) {
        this(alias, QUERY_STATISTICS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.QUERY_STATISTICS</code> table reference
     */
    public QueryStatistics() {
        this(DSL.name("QUERY_STATISTICS"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public QueryStatistics as(String alias) {
        return new QueryStatistics(DSL.name(alias), this);
    }

    @Override
    public QueryStatistics as(Name alias) {
        return new QueryStatistics(alias, this);
    }

    @Override
    public QueryStatistics as(Table<?> alias) {
        return new QueryStatistics(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public QueryStatistics rename(String name) {
        return new QueryStatistics(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public QueryStatistics rename(Name name) {
        return new QueryStatistics(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public QueryStatistics rename(Table<?> name) {
        return new QueryStatistics(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public QueryStatistics where(Condition condition) {
        return new QueryStatistics(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public QueryStatistics where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public QueryStatistics where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public QueryStatistics where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public QueryStatistics where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public QueryStatistics where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public QueryStatistics where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public QueryStatistics where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public QueryStatistics whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public QueryStatistics whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}
