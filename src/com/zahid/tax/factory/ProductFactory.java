package com.zahid.tax.factory;

public class ProductFactory {

    public IProduct getProductFromFactory(String productName) {

        if (productName == null || productName.isEmpty()) return null;

        //todo: need to add more items here
        switch (productName.trim().toUpperCase()) {
            case "BOOK":
                return new Book();
            case "CHOCOLATE BAR":
            case "BOX OF CHOCOLATES":
                return new Food();
            case "MEDICINE":
                return new Medicine();
            case "MUSIC CD":
            case "BOTTLE OF PERFUME":
                return new MiscProduct();
            default:
                throw new IllegalArgumentException("Unknown product: " + productName);
        }
    }
}
