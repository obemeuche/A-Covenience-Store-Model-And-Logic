package org.storeInterface;

public interface CashierService {
    void sellProduct ();

    default void issueReceipt() {

    }
}
