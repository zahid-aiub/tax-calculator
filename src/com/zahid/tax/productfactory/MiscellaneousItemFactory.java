package com.zahid.tax.productfactory;

import com.zahid.tax.products.MiscellaneousItem;

public class MiscellaneousItemFactory extends ItemFactory {
    @Override
    public MiscellaneousItem createItem(String name, double price, boolean isImported, int quantity) {
        return new MiscellaneousItem(name, price, isImported, quantity);
    }

}
