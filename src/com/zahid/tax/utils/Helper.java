package com.zahid.tax.utils;

import com.zahid.tax.cart.Cart;
import com.zahid.tax.factory.IProduct;
import com.zahid.tax.factory.Product;
import com.zahid.tax.factory.ProductFactory;
import com.zahid.tax.tax.Payment;

import java.util.Scanner;

public class Helper {

    private Cart cart;

    private Scanner input;

    public Helper() {
        this.cart = new Cart();
        input = new Scanner(System.in);
    }

    public void start() {
        handleOrder();
    }

    public void handleOrder() {
        do {
            String name = getProductNameFromEndUser();
            double price = getProductPriceFromEndUser();
            int quantity = getQuantityFromEndUser();
            boolean isImported = isProductImported();
            fetchProductAndAddToCart(name, price, isImported, quantity);
        } while (isAddAnotherProduct());

        Payment payment = new Payment();
        payment.generateBillsForAllItemsInCart(cart);
    }

    private void fetchProductAndAddToCart(String name, double price, boolean isImported, int quantity) {
        ProductFactory factory = new ProductFactory();
        IProduct iProduct = factory.getProductFromFactory(name);
        Product product = iProduct.createProduct(name, price, isImported, quantity);
        cart.addToCart(product);
    }


    public boolean isAddAnotherProduct() {
        System.out.println("Do you want to add another Product? (Y/N): ");

        String ans = input.next();
        boolean addAnotherProduct = ParseUtils.parseBoolean(ans);
        input.nextLine();

        return addAnotherProduct;
    }

    public String getProductNameFromEndUser() {
        System.out.println("Enter the product name: ");
        return input.nextLine();
    }

    public double getProductPriceFromEndUser() {
        System.out.println("Enter the product price: ");

        if (!(input.hasNextDouble())) {
            throw new IllegalArgumentException("Invalid input! Please insert a correct input.");
        }

        return input.nextDouble();
    }

    public boolean isProductImported() {
        System.out.println("Is the product is imported or not? (Y/N): ");

        String ans = input.next();
        boolean isImported = ParseUtils.parseBoolean(ans);
        return isImported;
    }

    public int getQuantityFromEndUser() {
        System.out.println("Enter the quantity: ");

        if (!(input.hasNextDouble())) {
            throw new IllegalArgumentException("Invalid input! Please insert a correct input.");
        }

        return input.nextInt();
    }

}
