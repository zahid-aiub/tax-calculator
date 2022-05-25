package com.zahid.tax.factory;

public interface IProduct {

    Product createProduct(String name, double price, boolean isImported, int quantity);

}
