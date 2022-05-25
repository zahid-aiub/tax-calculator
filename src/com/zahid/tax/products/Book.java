package com.zahid.tax.products;

import com.zahid.tax.productfactory.BookFactory;
import com.zahid.tax.utils.enums.LocalTaxValues;

public class Book extends Item {

    public Book() {
        super();
    }

    public Book(String name, double price, boolean imported, int quantity) {
        super(name, price, imported, quantity);

    }

    @Override
    public BookFactory getFactory() {
        return new BookFactory();

    }

    @Override
    public double getTaxValue(String country) {
        if (country.equals("Local")) {
            return LocalTaxValues.BOOK_TAX.getTax();
        } else {
            return 0;
        }
    }
}
