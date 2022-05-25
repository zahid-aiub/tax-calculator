package com.zahid.tax.cart;

import com.zahid.tax.factory.Product;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<Product> productList = new ArrayList<>();

    public void addToCart(Product item) {
        productList.add(item);
    }

    public List<Product> getItemsFromCart() {
        return productList;
    }

}
