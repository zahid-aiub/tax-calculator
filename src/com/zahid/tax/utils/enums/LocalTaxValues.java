package com.zahid.tax.utils.enums;

public enum LocalTaxValues {

    BOOK_TAX(0.0),
    FOOD_TAX(0.0),
    MEDICINE_TAX(0.0),
    MISC_TAX(0.10);

    /**
     * The item tax value.
     */
    private double itemTaxValue;

    private LocalTaxValues(double taxValue) {
        itemTaxValue = taxValue;
    }

    public double getTax() {
        return itemTaxValue;
    }

}
