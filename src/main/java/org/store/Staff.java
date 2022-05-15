package org.store;

import org.storeEnum.Gender;
import org.storeEnum.Position;

public abstract class Staff {
    private String name;
    private String phoneNumber;
    private Position position;
    private String emailAddress;
    private Gender gender;

    public Staff(String name, String phoneNumber, Position position, String emailAddress, Gender gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.position = position;
        this.emailAddress = emailAddress;
        this.gender = gender;
    }

    public void setPosition(Position position) {
        if(position == Position.SENIOR_STAFF) {
            this.position = position;
        } else if (position == Position.JUNIOR_STAFF) {
            this.position = position;
        }

    }
}
