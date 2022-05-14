package org;

import org.store.CashierApplicant;
import org.store.Manager;
import org.storeEnum.Gender;
import org.storeEnum.Qualification;

public class Main {
    public static void main(String[] args) {
        CashierApplicant cashierApplicant = new CashierApplicant();
        cashierApplicant.setAge(25);
        cashierApplicant.setInterviewScore(50);
        cashierApplicant.setQualification(Qualification.BSC_ACCOUNTING);

        Manager manager = new Manager("Uchechi", "08067907142", "Manager",
                "obemeuchechi@gmail.com", Gender.MALE);

        manager.hireCashier(cashierApplicant);
    }
}
