package com.zahid.tax.productfactory;

import com.zahid.tax.products.Food;

public class FoodFactory extends ItemFactory {
    @Override
    public Food createItem(String name, double price, boolean isImported, int quantity) {
        return new Food(name, price, isImported, quantity);
    }

}
