/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.test.public_.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Operation implements Serializable {

    private static final long serialVersionUID = 955103306;

    private final String  id;
    private final String  accountId;
    private final Integer month;
    private final Integer day;
    private final String  categoryId;
    private final String  memo;
    private final Integer amount;
    private final Long    orderInDay;
    private final Boolean pending;
    private final Boolean locked;
    private final String  motherOperationId;
    private final String  importIdentifier;
    private final Long    importTimestamp;

    public Operation(Operation value) {
        this.id = value.id;
        this.accountId = value.accountId;
        this.month = value.month;
        this.day = value.day;
        this.categoryId = value.categoryId;
        this.memo = value.memo;
        this.amount = value.amount;
        this.orderInDay = value.orderInDay;
        this.pending = value.pending;
        this.locked = value.locked;
        this.motherOperationId = value.motherOperationId;
        this.importIdentifier = value.importIdentifier;
        this.importTimestamp = value.importTimestamp;
    }

    public Operation(
        String  id,
        String  accountId,
        Integer month,
        Integer day,
        String  categoryId,
        String  memo,
        Integer amount,
        Long    orderInDay,
        Boolean pending,
        Boolean locked,
        String  motherOperationId,
        String  importIdentifier,
        Long    importTimestamp
    ) {
        this.id = id;
        this.accountId = accountId;
        this.month = month;
        this.day = day;
        this.categoryId = categoryId;
        this.memo = memo;
        this.amount = amount;
        this.orderInDay = orderInDay;
        this.pending = pending;
        this.locked = locked;
        this.motherOperationId = motherOperationId;
        this.importIdentifier = importIdentifier;
        this.importTimestamp = importTimestamp;
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

    public Long getOrderInDay() {
        return this.orderInDay;
    }

    public Boolean getPending() {
        return this.pending;
    }

    public Boolean getLocked() {
        return this.locked;
    }

    public String getMotherOperationId() {
        return this.motherOperationId;
    }

    public String getImportIdentifier() {
        return this.importIdentifier;
    }

    public Long getImportTimestamp() {
        return this.importTimestamp;
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
        sb.append(", ").append(orderInDay);
        sb.append(", ").append(pending);
        sb.append(", ").append(locked);
        sb.append(", ").append(motherOperationId);
        sb.append(", ").append(importIdentifier);
        sb.append(", ").append(importTimestamp);

        sb.append(")");
        return sb.toString();
    }
}
