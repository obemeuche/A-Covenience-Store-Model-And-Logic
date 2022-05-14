package org.store;

import org.storeEnum.Gender;
import org.storeInterface.CustomerService;

public class Customers implements CustomerService {
    private String name;
    private String phoneNumber;
    private Gender gender;
    private String emailAddress;

    @Override
    public void buyProduct(Product product) {

    }
}
