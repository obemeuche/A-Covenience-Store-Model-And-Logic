package org.store;

import javax.swing.text.Position;
import java.util.HashMap;

public class Products {

    HashMap<String, Double> item = new HashMap<>();
    private String name;

    private double price;

    public Products() {

    }

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
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
        this.price = price;
    }

    public HashMap<String, Double> getItem() {
        return item;
    }



    @Override
    public String toString() {
        return "Product{" +
                "itemCost=" + item +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

