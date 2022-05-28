package com.zahid.tax.factory;

public class ProductFactory {

    public IProduct getProductFromFactory(String productName) {

        if (productName == null || productName.isEmpty()) return null;

        switch (productName.trim().toUpperCase()) {
            case "BOOK":
                return new Book();
            case "CHOCOLATE BAR":
            case "BOX OF CHOCOLATES":
                return new Food();
            case "MEDICINE":
            case "PACKET OF HEADACHE PILLS":
                return new Medicine();
            case "MUSIC CD":
            case "BOTTLE OF PERFUME":
                return new MiscProduct();
            default:
                throw new IllegalArgumentException("Unknown product: " + productName);
        }
    }
}
