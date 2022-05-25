package com.zahid.tax.products;


import com.zahid.tax.productfactory.FoodFactory;
import com.zahid.tax.utils.enums.LocalTaxValues;

public class Food extends Item {

    public Food() {
        super();
    }

    public Food(String name, double price, boolean imported, int quantity) {
        super(name, price, imported, quantity);

    }

    @Override
    public FoodFactory getFactory() {

        return new FoodFactory();

    }

    @Override
    public double getTaxValue(String country) {
        if (country.equals("Local")) {
            return LocalTaxValues.FOOD_TAX.getTax();
        } else {
            return 0;
        }
    }

}
