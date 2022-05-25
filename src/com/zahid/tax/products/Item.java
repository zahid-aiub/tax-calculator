package com.zahid.tax.products;

import com.zahid.tax.productfactory.ItemFactory;

public abstract class Item {
    protected String name;

    protected double price;

    protected Boolean imported;

    protected int quantity;
    protected double taxedCost;

    public Item() {
        this.price = 0.0;
        this.imported = false;
        this.quantity = 0;
        this.taxedCost = 0.0;
    }

    public Item(String name, double price, boolean imported, int quantity) {
        this.name = name;
        this.price = price * quantity;
        this.imported = imported;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price * quantity;
    }

    public boolean isImported() {
        return imported;
    }

    public void setImported(boolean imported) {
        this.imported = imported;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTaxedCost() {
        return taxedCost;
    }

    public void setTaxedCost(double taxedCost) {
        this.taxedCost = taxedCost;
    }

    @Override
    public String toString() {
        return (quantity + " " + toString(imported) + " " + name + " : " + taxedCost);
    }

    public String toString(boolean imported) {
        if (!imported) {
            return null;
        } else {
            return "imported";
        }
    }

    public abstract ItemFactory getFactory();

    public abstract double getTaxValue(String country);

}
