package com.zahid.tax.factory;

import com.zahid.tax.utils.enums.TaxValues;

public class Food extends Product implements IProduct {

    public Food() {

    }

    public Food(String name, double price, boolean isImported, int quantity) {
        super(name, price, isImported, quantity);
    }

    @Override
    public Product createProduct(String name, double price, boolean isImported, int quantity) {
        return new Food(name, price, isImported, quantity);
    }

    @Override
    public double getTaxValue() {
        return TaxValues.FOOD_TAX.getTax();
    }

}
