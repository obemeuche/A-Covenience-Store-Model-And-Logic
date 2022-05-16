package org.storeInterface;

import org.store.Customers;
import org.store.Products;

public interface CashierService {
    void sellProduct (Products product, Customers customer);

    void issueReceipt(Products product, Customers customer);
}
