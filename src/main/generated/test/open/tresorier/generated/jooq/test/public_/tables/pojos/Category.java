/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Category implements Serializable {

    private static final long serialVersionUID = -1569802160;

    private final String  id;
    private final String  masterCategoryId;
    private final String  name;
    private final Boolean archived;
    private final Boolean deleted;

    public Category(Category value) {
        this.id = value.id;
        this.masterCategoryId = value.masterCategoryId;
        this.name = value.name;
        this.archived = value.archived;
        this.deleted = value.deleted;
    }

    public Category(
        String  id,
        String  masterCategoryId,
        String  name,
        Boolean archived,
        Boolean deleted
    ) {
        this.id = id;
        this.masterCategoryId = masterCategoryId;
        this.name = name;
        this.archived = archived;
        this.deleted = deleted;
    }

    public String getId() {
        return this.id;
    }

    public String getMasterCategoryId() {
        return this.masterCategoryId;
    }

    public String getName() {
        return this.name;
    }

    public Boolean getArchived() {
        return this.archived;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Category (");

        sb.append(id);
        sb.append(", ").append(masterCategoryId);
        sb.append(", ").append(name);
        sb.append(", ").append(archived);
        sb.append(", ").append(deleted);

        sb.append(")");
        return sb.toString();
    }
}
