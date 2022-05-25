package com.zahid.tax.productfactory;

import com.zahid.tax.products.Item;

public abstract class ItemFactory {
    public abstract Item createItem(String name, double price, boolean isImported, int quantity);

}
