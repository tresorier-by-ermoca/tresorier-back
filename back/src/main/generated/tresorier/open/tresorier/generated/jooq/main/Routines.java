/*
 * This file is generated by jOOQ.
 */
package open.tresorier.generated.jooq.main;


import open.tresorier.generated.jooq.main.routines.AreCategoryAndAccountFromSameBudget;

import org.jooq.Configuration;
import org.jooq.Field;


/**
 * Convenience access to all stored procedures and functions in public.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Routines {

    /**
     * Call <code>public.are_category_and_account_from_same_budget</code>
     */
    public static Boolean areCategoryAndAccountFromSameBudget(
          Configuration configuration
        , String _CategoryId
        , String _AccountId
    ) {
        AreCategoryAndAccountFromSameBudget f = new AreCategoryAndAccountFromSameBudget();
        f.set_CategoryId(_CategoryId);
        f.set_AccountId(_AccountId);

        f.execute(configuration);
        return f.getReturnValue();
    }

    /**
     * Get <code>public.are_category_and_account_from_same_budget</code> as a
     * field.
     */
    public static Field<Boolean> areCategoryAndAccountFromSameBudget(
          String _CategoryId
        , String _AccountId
    ) {
        AreCategoryAndAccountFromSameBudget f = new AreCategoryAndAccountFromSameBudget();
        f.set_CategoryId(_CategoryId);
        f.set_AccountId(_AccountId);

        return f.asField();
    }

    /**
     * Get <code>public.are_category_and_account_from_same_budget</code> as a
     * field.
     */
    public static Field<Boolean> areCategoryAndAccountFromSameBudget(
          Field<String> _CategoryId
        , Field<String> _AccountId
    ) {
        AreCategoryAndAccountFromSameBudget f = new AreCategoryAndAccountFromSameBudget();
        f.set_CategoryId(_CategoryId);
        f.set_AccountId(_AccountId);

        return f.asField();
    }
}
