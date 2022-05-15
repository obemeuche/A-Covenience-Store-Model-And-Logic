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
        if (customer.getProduct().equals(product.getName()) && customer.getAmount().equals(product.getPrice())) {
            System.out.println("Purchase has been made successful! Thank you for patronizing us.");
        }
        else {
            System.out.println("Product not available for sale");
        }
    }

    @Override
    public void issueReceipt(Products product, Customers customer) {
        if (customer.getProduct().equals(product.getName()) && customer.getAmount().equals(product.getPrice())) {
            System.out.println("Here is your receipt!");
        }
        else {
            System.out.println("Can't issue receipt");
        }
    }
}
