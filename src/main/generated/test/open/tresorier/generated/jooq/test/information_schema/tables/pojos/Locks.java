/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Locks implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String  tableSchema;
    private final String  tableName;
    private final Integer sessionId;
    private final String  lockType;

    public Locks(Locks value) {
        this.tableSchema = value.tableSchema;
        this.tableName = value.tableName;
        this.sessionId = value.sessionId;
        this.lockType = value.lockType;
    }

    public Locks(
        String  tableSchema,
        String  tableName,
        Integer sessionId,
        String  lockType
    ) {
        this.tableSchema = tableSchema;
        this.tableName = tableName;
        this.sessionId = sessionId;
        this.lockType = lockType;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.LOCKS.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return this.tableSchema;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.LOCKS.TABLE_NAME</code>.
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.LOCKS.SESSION_ID</code>.
     */
    public Integer getSessionId() {
        return this.sessionId;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.LOCKS.LOCK_TYPE</code>.
     */
    public String getLockType() {
        return this.lockType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Locks (");

        sb.append(tableSchema);
        sb.append(", ").append(tableName);
        sb.append(", ").append(sessionId);
        sb.append(", ").append(lockType);

        sb.append(")");
        return sb.toString();
    }
}
