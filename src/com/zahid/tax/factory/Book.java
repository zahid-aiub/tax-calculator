package com.zahid.tax.factory;

public class Book extends Product implements IProduct {

    public Book() {

    }

    public Book(String name, double price, boolean isImported, int quantity) {
        super(name, price, isImported, quantity);
    }

    @Override
    public Product createProduct(String name, double price, boolean isImported, int quantity) {
        return new Book(name, price, isImported, quantity);
    }
}
