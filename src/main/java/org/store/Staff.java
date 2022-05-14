package org.store;

import org.storeEnum.Gender;

public abstract class Staff {
    private String name;
    private String phoneNumber;
    private String position;
    private String emailAddress;
    private Gender gender;

    public Staff(String name, String phoneNumber, String position, String emailAddress, Gender gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }
}
