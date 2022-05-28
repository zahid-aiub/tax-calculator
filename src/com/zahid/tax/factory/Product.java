package com.zahid.tax.factory;

public abstract class Product {

    private String name;

    private double price;

    private Boolean isImported;

    private int quantity;
    private double taxedCost;

    public Product() {
        this.price = 0.0;
        this.isImported = false;
        this.quantity = 0;
        this.taxedCost = 0.0;
    }

    public Product(String name, double price, boolean isImported, int quantity) {
        this.name = name;
        this.price = price * quantity;
        this.isImported = isImported;
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

    public boolean getIsImported() {
        return isImported;
    }

    public void setIsImported(boolean isImported) {
        this.isImported = isImported;
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
        return (quantity + toString(isImported) + " " + name + ": " + taxedCost);
    }

    public String toString(boolean imported) {
        if (!imported) {
            return "";
        } else {
            return " imported";
        }
    }

    public abstract double getTaxValue();

}
