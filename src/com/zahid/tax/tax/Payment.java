package com.zahid.tax.tax;

import com.zahid.tax.cart.Cart;
import com.zahid.tax.factory.Product;
import com.zahid.tax.utils.MathUtils;

import java.util.List;

public class Payment {

    private List<Product> productList;
    private Receipt receipt;

    public void generateBillsForAllItemsInCart(Cart cart) {
        productList = cart.getItemsFromCart();

        for (Product p : productList) {
            double productTax = this.calculateTax(p.getPrice(), p.getTaxValue(), p.getIsImported());
            double taxedCost = this.calcTotalProductCost(p.getPrice(), productTax);
            p.setTaxedCost(taxedCost);
        }

        this.checkout();

    }

    public void checkout() {
        double totalTax = this.calculateTotalTax(productList);
        double totalAmount = this.calculateTotalAmount(productList);
        receipt = createNewReceipt(productList, totalTax, totalAmount);
        this.printReceipt(receipt);

    }

    public Receipt createNewReceipt(List<Product> productList, double totalTax, double totalAmount) {
        return new Receipt(productList, totalTax, totalAmount);
    }

    public void printReceipt(Receipt r) {
        String receipt = r.toString();
        System.out.println(receipt);
    }

    public double calculateTax(double price, double tax, boolean isImported) {
        double taxVal = price * tax;
        if (isImported) {
            taxVal += (price * 0.05);
        }
        taxVal = MathUtils.roundOff(taxVal);

        return taxVal;
    }

    public double calcTotalProductCost(double price, double tax) {
        return MathUtils.truncate(price + tax);
    }


    public double calculateTotalTax(List<Product> prodList) {
        double totalTax = 0.0;

        for (Product p : prodList) {
            totalTax += (p.getTaxedCost() - p.getPrice());
        }
        return MathUtils.truncate(totalTax);
    }

    public double calculateTotalAmount(List<Product> prodList) {
        double totalAmount = 0.0;

        for (Product p : prodList) {
            totalAmount += p.getTaxedCost();
        }
        return MathUtils.truncate(totalAmount);
    }

}
