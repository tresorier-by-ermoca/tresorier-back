/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.information_schema.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Roles implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String  name;
    private final String  remarks;
    private final Integer id;

    public Roles(Roles value) {
        this.name = value.name;
        this.remarks = value.remarks;
        this.id = value.id;
    }

    public Roles(
        String  name,
        String  remarks,
        Integer id
    ) {
        this.name = name;
        this.remarks = remarks;
        this.id = id;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.NAME</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.REMARKS</code>.
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.ROLES.ID</code>.
     */
    public Integer getId() {
        return this.id;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Roles (");

        sb.append(name);
        sb.append(", ").append(remarks);
        sb.append(", ").append(id);

        sb.append(")");
        return sb.toString();
    }
}
