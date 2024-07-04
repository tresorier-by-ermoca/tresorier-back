/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Allocation implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String categoryId;
    private final Integer month;
    private final Integer amount;

    public Allocation(Allocation value) {
        this.categoryId = value.categoryId;
        this.month = value.month;
        this.amount = value.amount;
    }

    public Allocation(
        String categoryId,
        Integer month,
        Integer amount
    ) {
        this.categoryId = categoryId;
        this.month = month;
        this.amount = amount;
    }

    /**
     * Getter for <code>public.allocation.category_id</code>.
     */
    public String getCategoryId() {
        return this.categoryId;
    }

    /**
     * Getter for <code>public.allocation.month</code>.
     */
    public Integer getMonth() {
        return this.month;
    }

    /**
     * Getter for <code>public.allocation.amount</code>.
     */
    public Integer getAmount() {
        return this.amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Allocation other = (Allocation) obj;
        if (this.categoryId == null) {
            if (other.categoryId != null)
                return false;
        }
        else if (!this.categoryId.equals(other.categoryId))
            return false;
        if (this.month == null) {
            if (other.month != null)
                return false;
        }
        else if (!this.month.equals(other.month))
            return false;
        if (this.amount == null) {
            if (other.amount != null)
                return false;
        }
        else if (!this.amount.equals(other.amount))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.categoryId == null) ? 0 : this.categoryId.hashCode());
        result = prime * result + ((this.month == null) ? 0 : this.month.hashCode());
        result = prime * result + ((this.amount == null) ? 0 : this.amount.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Allocation (");

        sb.append(categoryId);
        sb.append(", ").append(month);
        sb.append(", ").append(amount);

        sb.append(")");
        return sb.toString();
    }
}
