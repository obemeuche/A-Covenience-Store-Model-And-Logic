package org;

import org.store.CashierApplicant;
import org.store.Manager;
import org.store.Products;
import org.storeEnum.Gender;
import org.storeEnum.Qualification;

public class Main {
    public static void main(String[] args) {
        // Instantiating the CashierApplicant class
        CashierApplicant cashierApplicant = new CashierApplicant();
        cashierApplicant.setAge(25);
        cashierApplicant.setInterviewScore(50);
        cashierApplicant.setQualification(Qualification.BSC_ACCOUNTING);

        // Instantiating the Manager class
         Manager manager = new Manager("Uchechi", "08067907142", "Manager",
                "obemeuchechi@gmail.com", Gender.MALE);

        // manager.hireCashier(cashierApplicant);

        // Instantiating the Product class
         Products product1 = new Products("milk", 20.20);
         manager.updateProduct(product1);
         Products product2 = new Products("burger", 5.10);
         manager.updateProduct(product2
         );
    }
}
