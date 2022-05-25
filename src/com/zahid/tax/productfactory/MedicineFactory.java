package com.zahid.tax.productfactory;

import com.zahid.tax.products.Medicine;

public class MedicineFactory extends ItemFactory {
    @Override
    public Medicine createItem(String name, double price, boolean isImported, int quantity) {
        return new Medicine(name, price, isImported, quantity);
    }

}
