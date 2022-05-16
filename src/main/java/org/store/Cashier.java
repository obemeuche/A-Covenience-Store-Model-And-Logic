package org.store;

import org.storeEnum.Gender;
import org.storeEnum.Position;
import org.storeInterface.CashierService;

public class Cashier extends Staff implements CashierService {

    public Cashier(String name, String phoneNumber, Position position, String emailAddress, Gender gender) {
        super(name, phoneNumber, Position.JUNIOR_STAFF, emailAddress, gender);
    }

    @Override
    public void sellProduct(Products product, Customers customer) {
        if (customer.getProduct().equals(product.getName()) && (customer.getAmount().equals(product.getPrice()))) {
            System.out.println("Hello " + " " + customer.getName() + "," + " your purchase of " + " " + customer.getProduct()
                    + " " + "costs " + " " + product.getPrice() + " " + " and is available for sale" );
        }
        else if (customer.getProduct().equals(product.getName()) && (customer.getAmount() > product.getPrice())) {
            System.out.println("Hello " + " " + customer.getName() + " " + ", your purchase of " + " " + customer.getProduct()
                    + " " + "costs " + " " + product.getPrice() + " " + " and is available for sale" );
        }
        else if (customer.getProduct().equals(product.getName()) && (customer.getAmount() < product.getPrice())) {
            System.out.println("Hello " + " " + customer.getName() + " " + "your current balance of " + " " + customer.getAmount()
                    + " " + " is insufficient for the " + " " + product.getName());
        }
        else {
            System.out.println("Product not available for sale at the moment. Please check back later!");
        }
    }

    @Override
    public void issueReceipt(Products product, Customers customer) {
        if (customer.getProduct().equals(product.getName()) && customer.getAmount().equals(product.getPrice())) {
            System.out.println("Here is your receipt: " + "\n" +
                    "Item Cost = " + " " + product.getPrice() + "\n" +
                     "Item = " + " " + customer.getProduct() + "\n" +
                    "Balance = " + " " + (customer.getAmount() - product.getPrice()));
        }
        else if (customer.getProduct().equals(product.getName()) && (customer.getAmount() > product.getPrice())) {
            System.out.println("Here is your receipt: " + "\n" +
                    "Item Cost = " + " " + product.getPrice() + "\n" +
                    "Item = " + " " + customer.getProduct() + "\n" +
                    "Balance = " + " " + (customer.getAmount() - product.getPrice()));
        }
        else {
            System.out.println("Insufficient Balance!");
        }
    }
}
