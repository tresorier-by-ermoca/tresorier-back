/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main.routines;


import open.tresorier.generated.jooq.main.Public;

import org.jooq.Field;
import org.jooq.Parameter;
import org.jooq.impl.AbstractRoutine;
import org.jooq.impl.Internal;
import org.jooq.impl.SQLDataType;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AreCategoryAndAccountFromSameBudget extends AbstractRoutine<Boolean> {

    private static final long serialVersionUID = 1L;

    /**
     * The parameter
     * <code>public.are_category_and_account_from_same_budget.RETURN_VALUE</code>.
     */
    public static final Parameter<Boolean> RETURN_VALUE = Internal.createParameter("RETURN_VALUE", SQLDataType.BOOLEAN, false, false);

    /**
     * The parameter
     * <code>public.are_category_and_account_from_same_budget._category_id</code>.
     */
    public static final Parameter<String> _CATEGORY_ID = Internal.createParameter("_category_id", SQLDataType.VARCHAR, false, false);

    /**
     * The parameter
     * <code>public.are_category_and_account_from_same_budget._account_id</code>.
     */
    public static final Parameter<String> _ACCOUNT_ID = Internal.createParameter("_account_id", SQLDataType.VARCHAR, false, false);

    /**
     * Create a new routine call instance
     */
    public AreCategoryAndAccountFromSameBudget() {
        super("are_category_and_account_from_same_budget", Public.PUBLIC, SQLDataType.BOOLEAN);

        setReturnParameter(RETURN_VALUE);
        addInParameter(_CATEGORY_ID);
        addInParameter(_ACCOUNT_ID);
    }

    /**
     * Set the <code>_category_id</code> parameter IN value to the routine
     */
    public void set_CategoryId(String value) {
        setValue(_CATEGORY_ID, value);
    }

    /**
     * Set the <code>_category_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public AreCategoryAndAccountFromSameBudget set_CategoryId(Field<String> field) {
        setField(_CATEGORY_ID, field);
        return this;
    }

    /**
     * Set the <code>_account_id</code> parameter IN value to the routine
     */
    public void set_AccountId(String value) {
        setValue(_ACCOUNT_ID, value);
    }

    /**
     * Set the <code>_account_id</code> parameter to the function to be used
     * with a {@link org.jooq.Select} statement
     */
    public AreCategoryAndAccountFromSameBudget set_AccountId(Field<String> field) {
        setField(_ACCOUNT_ID, field);
        return this;
    }
}