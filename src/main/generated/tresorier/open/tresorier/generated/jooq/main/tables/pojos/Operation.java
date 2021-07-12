/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Operation implements Serializable {

    private static final long serialVersionUID = -658183351;

    private final String  id;
    private final String  accountId;
    private final Integer month;
    private final Integer day;
    private final String  categoryId;
    private final String  memo;
    private final Integer amount;

    public Operation(Operation value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.month = value.month;
        this.day = value.day;
        this.categoryId = value.categoryId;
        this.memo = value.memo;
        this.amount = value.amount;
    }

    public Operation(
        String  id,
        String  accountId,
        Integer month,
        Integer day,
        String  categoryId,
        String  memo,
        Integer amount
    ) {
        this.id = id;
        this.accountId = accountId;
        this.month = month;
        this.day = day;
        this.categoryId = categoryId;
        this.memo = memo;
        this.amount = amount;
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

    public String getMemo() {
        return this.memo;
    }

    public Integer getAmount() {
        return this.amount;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Operation (");

        sb.append(id);
        sb.append(", ").append(accountId);
        sb.append(", ").append(month);
        sb.append(", ").append(day);
        sb.append(", ").append(categoryId);
        sb.append(", ").append(memo);
        sb.append(", ").append(amount);

        sb.append(")");
        return sb.toString();
    }
}
