/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankAgreement implements Serializable {

    private static final long serialVersionUID = -636190752;

    private final String  id;
    private final String  budgetId;
    private final String  bankId;
    private final Long    timestamp;
    private final String  nordigenRequisitionId;
    private final Boolean archived;
    private final Boolean deleted;

    public BankAgreement(BankAgreement value) {
        this.id = value.id;
        this.budgetId = value.budgetId;
        this.bankId = value.bankId;
        this.timestamp = value.timestamp;
        this.nordigenRequisitionId = value.nordigenRequisitionId;
        this.archived = value.archived;
        this.deleted = value.deleted;
    }

    public BankAgreement(
        String  id,
        String  budgetId,
        String  bankId,
        Long    timestamp,
        String  nordigenRequisitionId,
        Boolean archived,
        Boolean deleted
    ) {
        this.id = id;
        this.budgetId = budgetId;
        this.bankId = bankId;
        this.timestamp = timestamp;
        this.nordigenRequisitionId = nordigenRequisitionId;
        this.archived = archived;
        this.deleted = deleted;
    }

    public String getId() {
        return this.id;
    }

    public String getBudgetId() {
        return this.budgetId;
    }

    public String getBankId() {
        return this.bankId;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getNordigenRequisitionId() {
        return this.nordigenRequisitionId;
    }

    public Boolean getArchived() {
        return this.archived;
    }

    public Boolean getDeleted() {
        return this.deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BankAgreement (");

        sb.append(id);
        sb.append(", ").append(budgetId);
        sb.append(", ").append(bankId);
        sb.append(", ").append(timestamp);
        sb.append(", ").append(nordigenRequisitionId);
        sb.append(", ").append(archived);
        sb.append(", ").append(deleted);

        sb.append(")");
        return sb.toString();
    }
}
