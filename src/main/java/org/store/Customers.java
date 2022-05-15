package org.store;

import org.storeEnum.Gender;
import org.storeInterface.CustomerService;

public class Customers implements CustomerService {
    private String name;
    private String phoneNumber;
    private Gender gender;
    private String emailAddress;
    private  String product;
    private Double amount;

    public Customers(String name, String phoneNumber, Gender gender, String emailAddress, String product, Double amount) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.emailAddress = emailAddress;
        this.product = product;
        this.amount = amount;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public void buyProduct(Products product, Customers customer) {
        if (customer.getProduct().equals(product.getName()) && customer.getAmount().equals(product.getPrice())) {
            System.out.println("Hello "+ customer.name + ", you can go ahead with your purchase as the product is available.");
        }
        else {
            System.out.println("Check back later for product");
        }

    }
}
