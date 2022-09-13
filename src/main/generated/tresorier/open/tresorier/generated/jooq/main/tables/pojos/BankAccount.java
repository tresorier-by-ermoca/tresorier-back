/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class BankAccount implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String  id;
    private final String  name;
    private final String  agreementId;
    private final Boolean deleted;

    public BankAccount(BankAccount value) {
        this.id = value.id;
        this.name = value.name;
        this.agreementId = value.agreementId;
        this.deleted = value.deleted;
    }

    public BankAccount(
        String  id,
        String  name,
        String  agreementId,
        Boolean deleted
    ) {
        this.id = id;
        this.name = name;
        this.agreementId = agreementId;
        this.deleted = deleted;
    }

    /**
     * Getter for <code>public.bank_account.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.bank_account.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.bank_account.agreement_id</code>.
     */
    public String getAgreementId() {
        return this.agreementId;
    }

    /**
     * Getter for <code>public.bank_account.deleted</code>.
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BankAccount (");

        sb.append(id);
        sb.append(", ").append(name);
        sb.append(", ").append(agreementId);
        sb.append(", ").append(deleted);

        sb.append(")");
        return sb.toString();
    }
}
