/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class ConstraintColumnUsage implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String tableCatalog;
    private final String tableSchema;
    private final String tableName;
    private final String columnName;
    private final String constraintCatalog;
    private final String constraintSchema;
    private final String constraintName;

    public ConstraintColumnUsage(ConstraintColumnUsage value) {
        this.tableCatalog = value.tableCatalog;
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.columnName = value.columnName;
        this.constraintCatalog = value.constraintCatalog;
        this.constraintSchema = value.constraintSchema;
        this.constraintName = value.constraintName;
    }

    public ConstraintColumnUsage(
        String tableCatalog,
        String tableSchema,
        String tableName,
        String columnName,
        String constraintCatalog,
        String constraintSchema,
        String constraintName
    ) {
        this.tableCatalog = tableCatalog;
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.columnName = columnName;
        this.constraintCatalog = constraintCatalog;
        this.constraintSchema = constraintSchema;
        this.constraintName = constraintName;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return this.tableCatalog;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_CATALOG</code>.
     */
    public String getConstraintCatalog() {
        return this.constraintCatalog;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_SCHEMA</code>.
     */
    public String getConstraintSchema() {
        return this.constraintSchema;
    }

    /**
     * Getter for
     * <code>INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return this.constraintName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final ConstraintColumnUsage other = (ConstraintColumnUsage) obj;
        if (this.tableCatalog == null) {
            if (other.tableCatalog != null)
                return false;
        }
        else if (!this.tableCatalog.equals(other.tableCatalog))
            return false;
        if (this.tableSchema == null) {
            if (other.tableSchema != null)
                return false;
        }
        else if (!this.tableSchema.equals(other.tableSchema))
            return false;
        if (this.tableName == null) {
            if (other.tableName != null)
                return false;
        }
        else if (!this.tableName.equals(other.tableName))
            return false;
        if (this.columnName == null) {
            if (other.columnName != null)
                return false;
        }
        else if (!this.columnName.equals(other.columnName))
            return false;
        if (this.constraintCatalog == null) {
            if (other.constraintCatalog != null)
                return false;
        }
        else if (!this.constraintCatalog.equals(other.constraintCatalog))
            return false;
        if (this.constraintSchema == null) {
            if (other.constraintSchema != null)
                return false;
        }
        else if (!this.constraintSchema.equals(other.constraintSchema))
            return false;
        if (this.constraintName == null) {
            if (other.constraintName != null)
                return false;
        }
        else if (!this.constraintName.equals(other.constraintName))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.tableCatalog == null) ? 0 : this.tableCatalog.hashCode());
        result = prime * result + ((this.tableSchema == null) ? 0 : this.tableSchema.hashCode());
        result = prime * result + ((this.tableName == null) ? 0 : this.tableName.hashCode());
        result = prime * result + ((this.columnName == null) ? 0 : this.columnName.hashCode());
        result = prime * result + ((this.constraintCatalog == null) ? 0 : this.constraintCatalog.hashCode());
        result = prime * result + ((this.constraintSchema == null) ? 0 : this.constraintSchema.hashCode());
        result = prime * result + ((this.constraintName == null) ? 0 : this.constraintName.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("ConstraintColumnUsage (");

        sb.append(tableCatalog);
        sb.append(", ").append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(columnName);
        sb.append(", ").append(constraintCatalog);
        sb.append(", ").append(constraintSchema);
        sb.append(", ").append(constraintName);

        sb.append(")");
        return sb.toString();
    }
}
