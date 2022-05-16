package org.store;

import javax.swing.text.Position;
import java.util.HashMap;

public class Products {

    HashMap<String, Double> item = new HashMap<>();
    final private String name;

    final private double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

}

