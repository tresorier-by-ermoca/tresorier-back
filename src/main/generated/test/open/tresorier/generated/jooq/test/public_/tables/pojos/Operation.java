/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.pojos;


import java.io.Serializable;
import java.math.BigDecimal;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Operation implements Serializable {

    private static final long serialVersionUID = 301465978;

    private final String     id;
    private final String     accountId;
    private final Integer    month;
    private final Integer    day;
    private final String     categoryId;
    private final BigDecimal amount;
    private final String     memo;

    public Operation(Operation value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.month = value.month;
        this.day = value.day;
        this.categoryId = value.categoryId;
        this.amount = value.amount;
        this.memo = value.memo;
    }

    public Operation(
        String     id,
        String     accountId,
        Integer    month,
        Integer    day,
        String     categoryId,
        BigDecimal amount,
        String     memo
    ) {
        this.id = id;
        this.accountId = accountId;
        this.month = month;
        this.day = day;
        this.categoryId = categoryId;
        this.amount = amount;
        this.memo = memo;
    }

    public String getId() {
        return this.id;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public Integer getMonth() {
        return this.month;
    }

    public Integer getDay() {
        return this.day;
    }

    public String getCategoryId() {
        return this.categoryId;
    }

    public BigDecimal getAmount() {
        return this.amount;
    }

    public String getMemo() {
        return this.memo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Operation (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(month);
        sb.append(", ").append(day);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(amount);
        sb.append(", ").append(memo);

        sb.append(")");
        return sb.toString();
    }
}
