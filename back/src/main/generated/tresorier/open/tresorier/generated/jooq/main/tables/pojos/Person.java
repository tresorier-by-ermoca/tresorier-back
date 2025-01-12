/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.pojos;


import java.io.Serializable;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String id;
    private final String email;
    private final String name;
    private final String password;
    private final Long unlockingdate;
    private final Integer loginattemptcount;
    private final Boolean deleted;
    private final String billingId;
    private final Boolean billingStatus;
    private final Long creationDate;
    private final String style;
    private final Boolean dyslexia;

    public Person(Person value) {
        this.id = value.id;
        this.email = value.email;
        this.name = value.name;
        this.password = value.password;
        this.unlockingdate = value.unlockingdate;
        this.loginattemptcount = value.loginattemptcount;
        this.deleted = value.deleted;
        this.billingId = value.billingId;
        this.billingStatus = value.billingStatus;
        this.creationDate = value.creationDate;
        this.style = value.style;
        this.dyslexia = value.dyslexia;
    }

    public Person(
        String id,
        String email,
        String name,
        String password,
        Long unlockingdate,
        Integer loginattemptcount,
        Boolean deleted,
        String billingId,
        Boolean billingStatus,
        Long creationDate,
        String style,
        Boolean dyslexia
    ) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.password = password;
        this.unlockingdate = unlockingdate;
        this.loginattemptcount = loginattemptcount;
        this.deleted = deleted;
        this.billingId = billingId;
        this.billingStatus = billingStatus;
        this.creationDate = creationDate;
        this.style = style;
        this.dyslexia = dyslexia;
    }

    /**
     * Getter for <code>public.person.id</code>.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for <code>public.person.email</code>.
     */
    public String getEmail() {
        return this.email;
    }

    /**
     * Getter for <code>public.person.name</code>.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Getter for <code>public.person.password</code>.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Getter for <code>public.person.unlockingdate</code>.
     */
    public Long getUnlockingdate() {
        return this.unlockingdate;
    }

    /**
     * Getter for <code>public.person.loginattemptcount</code>.
     */
    public Integer getLoginattemptcount() {
        return this.loginattemptcount;
    }

    /**
     * Getter for <code>public.person.deleted</code>.
     */
    public Boolean getDeleted() {
        return this.deleted;
    }

    /**
     * Getter for <code>public.person.billing_id</code>.
     */
    public String getBillingId() {
        return this.billingId;
    }

    /**
     * Getter for <code>public.person.billing_status</code>.
     */
    public Boolean getBillingStatus() {
        return this.billingStatus;
    }

    /**
     * Getter for <code>public.person.creation_date</code>.
     */
    public Long getCreationDate() {
        return this.creationDate;
    }

    /**
     * Getter for <code>public.person.style</code>.
     */
    public String getStyle() {
        return this.style;
    }

    /**
     * Getter for <code>public.person.dyslexia</code>.
     */
    public Boolean getDyslexia() {
        return this.dyslexia;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Person other = (Person) obj;
        if (this.id == null) {
            if (other.id != null)
                return false;
        }
        else if (!this.id.equals(other.id))
            return false;
        if (this.email == null) {
            if (other.email != null)
                return false;
        }
        else if (!this.email.equals(other.email))
            return false;
        if (this.name == null) {
            if (other.name != null)
                return false;
        }
        else if (!this.name.equals(other.name))
            return false;
        if (this.password == null) {
            if (other.password != null)
                return false;
        }
        else if (!this.password.equals(other.password))
            return false;
        if (this.unlockingdate == null) {
            if (other.unlockingdate != null)
                return false;
        }
        else if (!this.unlockingdate.equals(other.unlockingdate))
            return false;
        if (this.loginattemptcount == null) {
            if (other.loginattemptcount != null)
                return false;
        }
        else if (!this.loginattemptcount.equals(other.loginattemptcount))
            return false;
        if (this.deleted == null) {
            if (other.deleted != null)
                return false;
        }
        else if (!this.deleted.equals(other.deleted))
            return false;
        if (this.billingId == null) {
            if (other.billingId != null)
                return false;
        }
        else if (!this.billingId.equals(other.billingId))
            return false;
        if (this.billingStatus == null) {
            if (other.billingStatus != null)
                return false;
        }
        else if (!this.billingStatus.equals(other.billingStatus))
            return false;
        if (this.creationDate == null) {
            if (other.creationDate != null)
                return false;
        }
        else if (!this.creationDate.equals(other.creationDate))
            return false;
        if (this.style == null) {
            if (other.style != null)
                return false;
        }
        else if (!this.style.equals(other.style))
            return false;
        if (this.dyslexia == null) {
            if (other.dyslexia != null)
                return false;
        }
        else if (!this.dyslexia.equals(other.dyslexia))
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.id == null) ? 0 : this.id.hashCode());
        result = prime * result + ((this.email == null) ? 0 : this.email.hashCode());
        result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
        result = prime * result + ((this.password == null) ? 0 : this.password.hashCode());
        result = prime * result + ((this.unlockingdate == null) ? 0 : this.unlockingdate.hashCode());
        result = prime * result + ((this.loginattemptcount == null) ? 0 : this.loginattemptcount.hashCode());
        result = prime * result + ((this.deleted == null) ? 0 : this.deleted.hashCode());
        result = prime * result + ((this.billingId == null) ? 0 : this.billingId.hashCode());
        result = prime * result + ((this.billingStatus == null) ? 0 : this.billingStatus.hashCode());
        result = prime * result + ((this.creationDate == null) ? 0 : this.creationDate.hashCode());
        result = prime * result + ((this.style == null) ? 0 : this.style.hashCode());
        result = prime * result + ((this.dyslexia == null) ? 0 : this.dyslexia.hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Person (");

        sb.append(id);
        sb.append(", ").append(email);
        sb.append(", ").append(name);
        sb.append(", ").append(password);
        sb.append(", ").append(unlockingdate);
        sb.append(", ").append(loginattemptcount);
        sb.append(", ").append(deleted);
        sb.append(", ").append(billingId);
        sb.append(", ").append(billingStatus);
        sb.append(", ").append(creationDate);
        sb.append(", ").append(style);
        sb.append(", ").append(dyslexia);

        sb.append(")");
        return sb.toString();
    }
}
