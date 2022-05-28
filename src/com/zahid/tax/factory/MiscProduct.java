package com.zahid.tax.factory;

import com.zahid.tax.utils.enums.TaxValues;

public class MiscProduct extends Product implements IProduct {

    public MiscProduct() {

    }

    public MiscProduct(String name, double price, boolean isImported, int quantity) {
        super(name, price, isImported, quantity);
    }

    @Override
    public Product createProduct(String name, double price, boolean isImported, int quantity) {
        return new MiscProduct(name, price, isImported, quantity);
    }

    @Override
    public double getTaxValue() {
        return TaxValues.MISC_TAX.getTax();
    }

}
