package com.zahid.tax.factory;

public class ProductFactory {

    public IProduct getProductFromFactory(String productName) {

        if (productName == null || productName.isEmpty()) return null;

        switch (productName.toUpperCase()) {
            case "BOOK":
                return new Book();
            case "FOOD":
                return new Food();
            default:
                throw new IllegalArgumentException("Unknown product: " + productName);
        }
    }
}
