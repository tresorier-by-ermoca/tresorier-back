/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Allocation implements Serializable {

    private static final long serialVersionUID = -1489825884;

    private final String     categoryId;
    private final Integer    month;
    private final BigDecimal amount;

    public Allocation(Allocation value) {
        this.categoryId = value.categoryId;
        this.month = value.month;
        this.amount = value.amount;
    }

    public Allocation(
        String     categoryId,
        Integer    month,
        BigDecimal amount
    ) {
        this.categoryId = categoryId;
        this.month = month;
        this.amount = amount;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public Integer getMonth() {
        return this.month;
    }

    public BigDecimal getAmount() {
        return this.amount;
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
