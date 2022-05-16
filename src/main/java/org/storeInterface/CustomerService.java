package org.storeInterface;

import org.store.Customers;
import org.store.Products;

public interface CustomerService {
    void buyProduct(Products products, Customers customers);
}
