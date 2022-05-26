package com.zahid.tax.tax;


import com.zahid.tax.factory.Product;

import java.util.List;

public class Receipt {
    private List<Product> productList;
    private double totalSalesTax;
    private double totalAmount;

    public Receipt(List<Product> prod, double tax, double amount) {
        productList = prod;
        totalSalesTax = tax;
        totalAmount = amount;
    }

    @Override
    public String toString() {
        String receipt = "";

        for (Product p : productList) {
            receipt += (p.toString() + "\n");
        }

        receipt += "Sales Taxes: " + totalSalesTax + "\n";
        receipt += "Total: " + totalAmount + "\n";

        return receipt;
    }

}
