package org.storeInterface;

import org.store.Product;

public interface CustomerService {
    default void buyProduct(Product product) {

    }
}
