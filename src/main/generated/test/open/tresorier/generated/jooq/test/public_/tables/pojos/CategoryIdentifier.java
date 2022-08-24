/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CategoryIdentifier implements Serializable {

    private static final long serialVersionUID = 1039482584;

    private final String id;
    private final String budgetId;
    private final String pattern;
    private final String categoryId;

    public CategoryIdentifier(CategoryIdentifier value) {
        this.id = value.id;
        this.budgetId = value.budgetId;
        this.pattern = value.pattern;
        this.categoryId = value.categoryId;
    }

    public CategoryIdentifier(
        String id,
        String budgetId,
        String pattern,
        String categoryId
    ) {
        this.id = id;
        this.budgetId = budgetId;
        this.pattern = pattern;
        this.categoryId = categoryId;
    }

    public String getId() {
        return this.id;
    }

    public String getBudgetId() {
        return this.budgetId;
    }

    public String getPattern() {
        return this.pattern;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("CategoryIdentifier (");

        sb.append(id);
        sb.append(", ").append(budgetId);
        sb.append(", ").append(pattern);
        sb.append(", ").append(categoryId);

        sb.append(")");
        return sb.toString();
    }
}
