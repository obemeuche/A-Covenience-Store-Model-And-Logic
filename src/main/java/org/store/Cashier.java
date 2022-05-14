package org.store;

import org.storeEnum.Gender;
import org.storeInterface.CashierService;

public class Cashier extends Staff implements CashierService {

    public Cashier(String name, String phoneNumber, String position, String emailAddress, Gender gender) {
        super(name, phoneNumber, position, emailAddress, gender);
    }

    @Override
    public void sellProduct() {

    }

    @Override
    public void issueReceipt() {

    }
}
