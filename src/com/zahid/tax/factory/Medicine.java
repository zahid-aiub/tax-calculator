package com.zahid.tax.factory;

import com.zahid.tax.utils.enums.TaxValues;

public class Medicine extends Product implements IProduct {

    public Medicine() {

    }

    public Medicine(String name, double price, boolean isImported, int quantity) {
        super(name, price, isImported, quantity);
    }

    @Override
    public Product createProduct(String name, double price, boolean isImported, int quantity) {
        return new Medicine(name, price, isImported, quantity);
    }

    @Override
    public double getTaxValue() {
        return TaxValues.MEDICINE_TAX.getTax();
    }

}
