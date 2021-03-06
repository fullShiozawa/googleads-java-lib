
package com.google.api.ads.adwords.jaxws.v201306.cm;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BudgetError.Reason.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="BudgetError.Reason">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BUDGET_DELETED"/>
 *     &lt;enumeration value="BUDGET_ERROR"/>
 *     &lt;enumeration value="BUDGET_IN_USE"/>
 *     &lt;enumeration value="BUDGET_PERIOD_NOT_AVAILABLE"/>
 *     &lt;enumeration value="CANNOT_EDIT_SHARED_BUDGET"/>
 *     &lt;enumeration value="DUPLICATE_NAME"/>
 *     &lt;enumeration value="MONEY_AMOUNT_IN_WRONG_CURRENCY"/>
 *     &lt;enumeration value="MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC"/>
 *     &lt;enumeration value="MONEY_AMOUNT_TOO_LARGE"/>
 *     &lt;enumeration value="NEGATIVE_MONEY_AMOUNT"/>
 *     &lt;enumeration value="NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "BudgetError.Reason")
@XmlEnum
public enum BudgetErrorReason {


    /**
     * 
     *                 The requested budget no longer exists.
     *               
     * 
     */
    BUDGET_DELETED,

    /**
     * 
     *                 Default budget error.
     *               
     * 
     */
    BUDGET_ERROR,

    /**
     * 
     *                 The budget is associated with at least one campaign, and so the budget cannot be removed.
     *               
     * 
     */
    BUDGET_IN_USE,

    /**
     * 
     *                 Customer is not whitelisted for this budget period.
     *               
     * 
     */
    BUDGET_PERIOD_NOT_AVAILABLE,

    /**
     * 
     *                 Customer cannot use CampaignService to edit a shared budget.
     *               
     * 
     */
    CANNOT_EDIT_SHARED_BUDGET,

    /**
     * 
     *                 A budget with this name already exists.
     *               
     * 
     */
    DUPLICATE_NAME,

    /**
     * 
     *                 A money amount was not in the expected currency.
     *               
     * 
     */
    MONEY_AMOUNT_IN_WRONG_CURRENCY,

    /**
     * 
     *                 A money amount was less than the minimum CPC for currency.
     *               
     * 
     */
    MONEY_AMOUNT_LESS_THAN_CURRENCY_MINIMUM_CPC,

    /**
     * 
     *                 A money amount was greater than the maximum allowed.
     *               
     * 
     */
    MONEY_AMOUNT_TOO_LARGE,

    /**
     * 
     *                 A money amount was negative.
     *               
     * 
     */
    NEGATIVE_MONEY_AMOUNT,

    /**
     * 
     *                 A money amount was not a multiple of a minimum unit.
     *               
     * 
     */
    NON_MULTIPLE_OF_MINIMUM_CURRENCY_UNIT;

    public String value() {
        return name();
    }

    public static BudgetErrorReason fromValue(String v) {
        return valueOf(v);
    }

}
