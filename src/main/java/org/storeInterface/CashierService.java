package org.storeInterface;

import org.store.Customers;
import org.store.Products;

public interface CashierService {
    void sellProduct (Products product, Customers customer);

    default void issueReceipt(Products product, Customers customer) {

    }
}
