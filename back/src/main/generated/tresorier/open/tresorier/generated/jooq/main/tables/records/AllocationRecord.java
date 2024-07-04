/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.records;


import open.tresorier.generated.jooq.main.tables.Allocation;

import org.jooq.Record2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AllocationRecord extends UpdatableRecordImpl<AllocationRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.allocation.category_id</code>.
     */
    public AllocationRecord setCategoryId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.allocation.category_id</code>.
     */
    public String getCategoryId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.allocation.month</code>.
     */
    public AllocationRecord setMonth(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.allocation.month</code>.
     */
    public Integer getMonth() {
        return (Integer) get(1);
    }

    /**
     * Setter for <code>public.allocation.amount</code>.
     */
    public AllocationRecord setAmount(Integer value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.allocation.amount</code>.
     */
    public Integer getAmount() {
        return (Integer) get(2);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AllocationRecord
     */
    public AllocationRecord() {
        super(Allocation.ALLOCATION);
    }

    /**
     * Create a detached, initialised AllocationRecord
     */
    public AllocationRecord(String categoryId, Integer month, Integer amount) {
        super(Allocation.ALLOCATION);

        setCategoryId(categoryId);
        setMonth(month);
        setAmount(amount);
        resetChangedOnNotNull();
    }

    /**
     * Create a detached, initialised AllocationRecord
     */
    public AllocationRecord(open.tresorier.generated.jooq.main.tables.pojos.Allocation value) {
        super(Allocation.ALLOCATION);

        if (value != null) {
            setCategoryId(value.getCategoryId());
            setMonth(value.getMonth());
            setAmount(value.getAmount());
            resetChangedOnNotNull();
        }
    }
}
