package org.store;

import org.storeEnum.Gender;
import org.storeEnum.Position;
import org.storeEnum.Qualification;
import org.storeInterface.ManagerService;
import org.storeInterface.UpdateProduct;

public class Manager extends Staff implements ManagerService, UpdateProduct {


    public Manager(String name, String phoneNumber, Position position, String emailAddress, Gender gender) {
        super(name, phoneNumber, Position.SENIOR_STAFF, emailAddress, gender);
    }


    @Override
    public void hireCashier(CashierApplicant cashierApplicant) {
        if ((cashierApplicant.getQualification() == Qualification.BSC_ACCOUNTING) && (cashierApplicant.getInterviewScore() > 70)
                && (cashierApplicant.getAge() >= 23 || cashierApplicant.getAge() <= 35)) {
            System.out.print("Hello " + cashierApplicant.getName() + ", ");
            System.out.print("You have been successfully employed for the position of a Cashier. Welcome onboard!");
        } else {
            System.out.println("We are sorry to inform you that you didn't meet the criteria for this position. Please try again next time.");
        }
    }

    @Override
    public void updateProduct(Products product) {
        product.item.put(product.getName(), product.getPrice());
        System.out.println("Manager updated product successfully!");
    }

}
