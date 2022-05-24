package com.zahid.tax.shop;

import com.zahid.tax.products.Item;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Item> itemList;

    public Cart() {
        itemList = new ArrayList<>();
    }

    public void addToCart(Item item) {
        itemList.add(item);
    }

    public List<Item> getItemsFromCart() {
        return itemList;
    }

}
