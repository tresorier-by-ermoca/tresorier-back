/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.tables.records;


import open.tresorier.generated.jooq.main.tables.UserActivity;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserActivityRecord extends UpdatableRecordImpl<UserActivityRecord> implements Record4<String, String, Long, String> {

    private static final long serialVersionUID = 1L;

    /**
     * Setter for <code>public.user_activity.id</code>.
     */
    public UserActivityRecord setId(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.user_activity.id</code>.
     */
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.user_activity.user_id</code>.
     */
    public UserActivityRecord setUserId(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.user_activity.user_id</code>.
     */
    public String getUserId() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.user_activity.date</code>.
     */
    public UserActivityRecord setDate(Long value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.user_activity.date</code>.
     */
    public Long getDate() {
        return (Long) get(2);
    }

    /**
     * Setter for <code>public.user_activity.action</code>.
     */
    public UserActivityRecord setAction(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.user_activity.action</code>.
     */
    public String getAction() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<String, String, Long, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<String, String, Long, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return UserActivity.USER_ACTIVITY.ID;
    }

    @Override
    public Field<String> field2() {
        return UserActivity.USER_ACTIVITY.USER_ID;
    }

    @Override
    public Field<Long> field3() {
        return UserActivity.USER_ACTIVITY.DATE;
    }

    @Override
    public Field<String> field4() {
        return UserActivity.USER_ACTIVITY.ACTION;
    }

    @Override
    public String component1() {
        return getId();
    }

    @Override
    public String component2() {
        return getUserId();
    }

    @Override
    public Long component3() {
        return getDate();
    }

    @Override
    public String component4() {
        return getAction();
    }

    @Override
    public String value1() {
        return getId();
    }

    @Override
    public String value2() {
        return getUserId();
    }

    @Override
    public Long value3() {
        return getDate();
    }

    @Override
    public String value4() {
        return getAction();
    }

    @Override
    public UserActivityRecord value1(String value) {
        setId(value);
        return this;
    }

    @Override
    public UserActivityRecord value2(String value) {
        setUserId(value);
        return this;
    }

    @Override
    public UserActivityRecord value3(Long value) {
        setDate(value);
        return this;
    }

    @Override
    public UserActivityRecord value4(String value) {
        setAction(value);
        return this;
    }

    @Override
    public UserActivityRecord values(String value1, String value2, Long value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached UserActivityRecord
     */
    public UserActivityRecord() {
        super(UserActivity.USER_ACTIVITY);
    }

    /**
     * Create a detached, initialised UserActivityRecord
     */
    public UserActivityRecord(String id, String userId, Long date, String action) {
        super(UserActivity.USER_ACTIVITY);

        setId(id);
        setUserId(userId);
        setDate(date);
        setAction(action);
    }

    /**
     * Create a detached, initialised UserActivityRecord
     */
    public UserActivityRecord(open.tresorier.generated.jooq.main.tables.pojos.UserActivity value) {
        super(UserActivity.USER_ACTIVITY);

        if (value != null) {
            setId(value.getId());
            setUserId(value.getUserId());
            setDate(value.getDate());
            setAction(value.getAction());
        }
    }
}
