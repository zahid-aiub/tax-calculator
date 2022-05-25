package com.zahid.tax.productfactory;

import com.zahid.tax.products.Book;

public class BookFactory extends ItemFactory {
    @Override
    public Book createItem(String name, double price, boolean isImported, int quantity) {
        return new Book(name, price, isImported, quantity);
    }

}
