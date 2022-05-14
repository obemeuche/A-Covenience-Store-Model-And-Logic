package org.storeInterface;

import org.store.Products;

public interface CustomerService {
    default void buyProduct(Products products) {

    }
}
