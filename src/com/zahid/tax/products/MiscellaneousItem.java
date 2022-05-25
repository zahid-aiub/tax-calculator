package com.zahid.tax.products;

import com.zahid.tax.productfactory.MiscellaneousItemFactory;
import com.zahid.tax.utils.enums.LocalTaxValues;

public class MiscellaneousItem extends Item {

    public MiscellaneousItem() {
        super();
    }

    public MiscellaneousItem(String name, double price, boolean imported, int quantity) {
        super(name, price, imported, quantity);

    }

    @Override
    public MiscellaneousItemFactory getFactory() {

        return new MiscellaneousItemFactory();
    }

    @Override
    public double getTaxValue(String country) {
        if (country.equals("Local")) {
            return LocalTaxValues.MISC_TAX.getTax();
        } else {
            return 0;
        }
    }
}
