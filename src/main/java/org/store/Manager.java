package org.store;

import org.storeEnum.Gender;
import org.storeEnum.Qualification;
import org.storeInterface.ManagerService;

public class Manager extends Staff implements ManagerService {


    public Manager(String name, String phoneNumber, String position, String emailAddress, Gender gender) {
        super(name, phoneNumber, position, emailAddress, gender);
    }

    @Override
    public void hireCashier(CashierApplicant cashierApplicant) {
        if ((cashierApplicant.getQualification() == Qualification.BSC_ACCOUNTING) && (cashierApplicant.getInterviewScore() > 70)
                && (cashierApplicant.getAge() >= 23 || cashierApplicant.getAge() <= 35)) {
            System.out.println("You have been successfully employed for the position of a Cashier. Welcome onboard!");
        } else {
            System.out.println("We are sorry to inform you that you didn't meet the criteria for this position. Please try again next time.");
        }
    }
}
