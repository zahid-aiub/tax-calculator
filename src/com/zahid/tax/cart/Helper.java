package com.zahid.tax.cart;

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
            boolean isImported = isProductImported();
            int quantity = getQuantityFromEndUser();
            fetchProductAndAddToCart(name, price, isImported, quantity);
        } while (isAddAnotherProduct());

        //todo: need to call generateBillsForAllItemsInCart() from here
        Payment payment = new Payment();
        payment.generateBillsForAllItemsInCart(cart);
    }

    private void fetchProductAndAddToCart(String name, double price, boolean isImported, int quantity) {
        ProductFactory factory = new ProductFactory();
        IProduct iProduct = factory.getProductFromFactory(name);
        Product product = iProduct.createProduct(name, price, isImported, quantity);
        cart.addToCart(product);
        System.out.println(cart.getItemsFromCart().size());
    }


    public boolean isAddAnotherProduct() {
        System.out.println("Do you want to add another Product?(Y/N): ");

        while (!(input.hasNext())) {
            System.out.println("Invalid input. Enter (Y/N): ");
        }
        String ans = input.next();
        boolean addAnotherProduct = parseBoolean(ans);
        input.nextLine();
        return addAnotherProduct;
    }

    public String getProductNameFromEndUser() {
        System.out.println("Enter the product name: ");
        return input.nextLine();
    }

    public double getProductPriceFromEndUser() {
        System.out.println("Enter the product price: ");

        while (!(input.hasNextDouble())) {
            System.out.println("Invalid price. Enter a number");
        }
        return input.nextDouble();
    }

    public boolean isProductImported() {
        System.out.println("Is product imported or not?(Y/N): ");

        while (!(input.hasNext())) {
            System.out.println("Invalid input. Enter (Y/N): ");
        }
        String ans = input.next();
        boolean isImported = parseBoolean(ans);
        return isImported;
    }

    public int getQuantityFromEndUser() {
        System.out.println("Enter the quantity: ");

        while (!(input.hasNextInt())) {
            System.out.println("Invalid input. Please enter a number: ");
        }
        return input.nextInt();
    }

    //todo: move this function to utils
    public boolean parseBoolean(String value) {
        boolean flag = true;
        boolean result = false;

        while (flag) {
            if (value.equalsIgnoreCase("Y")) {
                result = true;
                flag = false;
            } else if (value.equalsIgnoreCase("N")) {
                flag = false;
            } else {
                System.out.println("Invalid input. Enter (Y/N): ");
            }
        }
        return result;
    }

}
