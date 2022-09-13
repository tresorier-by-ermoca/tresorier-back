/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Indexes implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String  tableCatalog;
    private final String  tableSchema;
    private final String  tableName;
    private final Boolean nonUnique;
    private final String  indexName;
    private final Short   ordinalPosition;
    private final String  columnName;
    private final Integer cardinality;
    private final Boolean primaryKey;
    private final String  indexTypeName;
    private final Boolean isGenerated;
    private final Short   indexType;
    private final String  ascOrDesc;
    private final Integer pages;
    private final String  filterCondition;
    private final String  remarks;
    private final String  sql;
    private final Integer id;
    private final Integer sortType;
    private final String  constraintName;
    private final String  indexClass;
    private final Boolean affinity;

    public Indexes(Indexes value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.nonUnique = value.nonUnique;
        this.indexName = value.indexName;
        this.ordinalPosition = value.ordinalPosition;
        this.columnName = value.columnName;
        this.cardinality = value.cardinality;
        this.primaryKey = value.primaryKey;
        this.indexTypeName = value.indexTypeName;
        this.isGenerated = value.isGenerated;
        this.indexType = value.indexType;
        this.ascOrDesc = value.ascOrDesc;
        this.pages = value.pages;
        this.filterCondition = value.filterCondition;
        this.remarks = value.remarks;
        this.sql = value.sql;
        this.id = value.id;
        this.sortType = value.sortType;
        this.constraintName = value.constraintName;
        this.indexClass = value.indexClass;
        this.affinity = value.affinity;
    }

    public Indexes(
        String  tableCatalog,
        String  tableSchema,
        String  tableName,
        Boolean nonUnique,
        String  indexName,
        Short   ordinalPosition,
        String  columnName,
        Integer cardinality,
        Boolean primaryKey,
        String  indexTypeName,
        Boolean isGenerated,
        Short   indexType,
        String  ascOrDesc,
        Integer pages,
        String  filterCondition,
        String  remarks,
        String  sql,
        Integer id,
        Integer sortType,
        String  constraintName,
        String  indexClass,
        Boolean affinity
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.nonUnique = nonUnique;
        this.indexName = indexName;
        this.ordinalPosition = ordinalPosition;
        this.columnName = columnName;
        this.cardinality = cardinality;
        this.primaryKey = primaryKey;
        this.indexTypeName = indexTypeName;
        this.isGenerated = isGenerated;
        this.indexType = indexType;
        this.ascOrDesc = ascOrDesc;
        this.pages = pages;
        this.filterCondition = filterCondition;
        this.remarks = remarks;
        this.sql = sql;
        this.id = id;
        this.sortType = sortType;
        this.constraintName = constraintName;
        this.indexClass = indexClass;
        this.affinity = affinity;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.NON_UNIQUE</code>.
     */
    public Boolean getNonUnique() {
        return this.nonUnique;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.ORDINAL_POSITION</code>.
     */
    public Short getOrdinalPosition() {
        return this.ordinalPosition;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.CARDINALITY</code>.
     */
    public Integer getCardinality() {
        return this.cardinality;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.PRIMARY_KEY</code>.
     */
    public Boolean getPrimaryKey_() {
        return this.primaryKey;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE_NAME</code>.
     */
    public String getIndexTypeName() {
        return this.indexTypeName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.IS_GENERATED</code>.
     */
    public Boolean getIsGenerated() {
        return this.isGenerated;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE</code>.
     */
    public Short getIndexType() {
        return this.indexType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.ASC_OR_DESC</code>.
     */
    public String getAscOrDesc() {
        return this.ascOrDesc;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.PAGES</code>.
     */
    public Integer getPages() {
        return this.pages;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.FILTER_CONDITION</code>.
     */
    public String getFilterCondition() {
        return this.filterCondition;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.SQL</code>.
     */
    public String getSql() {
        return this.sql;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.SORT_TYPE</code>.
     */
    public Integer getSortType() {
        return this.sortType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return this.constraintName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_CLASS</code>.
     */
    public String getIndexClass() {
        return this.indexClass;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.AFFINITY</code>.
     */
    public Boolean getAffinity() {
        return this.affinity;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Indexes (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(nonUnique);
        sb.append(", ").append(indexName);
        sb.append(", ").append(ordinalPosition);
        sb.append(", ").append(columnName);
        sb.append(", ").append(cardinality);
        sb.append(", ").append(primaryKey);
        sb.append(", ").append(indexTypeName);
        sb.append(", ").append(isGenerated);
        sb.append(", ").append(indexType);
        sb.append(", ").append(ascOrDesc);
        sb.append(", ").append(pages);
        sb.append(", ").append(filterCondition);
        sb.append(", ").append(remarks);
        sb.append(", ").append(sql);
        sb.append(", ").append(id);
        sb.append(", ").append(sortType);
        sb.append(", ").append(constraintName);
        sb.append(", ").append(indexClass);
        sb.append(", ").append(affinity);

        sb.append(")");
        return sb.toString();
    }
}
