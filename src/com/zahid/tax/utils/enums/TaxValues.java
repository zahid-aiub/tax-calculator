package com.zahid.tax.utils.enums;

public enum TaxValues {

    BOOK_TAX(0.0),
    FOOD_TAX(0.0),
    MEDICINE_TAX(0.0),
    MISC_TAX(0.10);

    private double itemTaxValue;

    private TaxValues(double taxValue) {
        itemTaxValue = taxValue;
    }

    public double getTax() {
        return itemTaxValue;
    }

}
