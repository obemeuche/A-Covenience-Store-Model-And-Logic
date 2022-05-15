package org;

import org.store.*;
import org.storeEnum.Gender;
import org.storeEnum.Position;
import org.storeEnum.Qualification;

public class Main {
    public static void main(String[] args) {
        // Instantiating the CashierApplicant class
        CashierApplicant cashierApplicant = new CashierApplicant();
        cashierApplicant.setName("Cynthia");
        cashierApplicant.setAge(25);
        cashierApplicant.setInterviewScore(80);
        cashierApplicant.setQualification(Qualification.BSC_ACCOUNTING);

        // Instantiating the Manager class
         Manager manager = new Manager("Uchechi", "08067907142", Position.SENIOR_STAFF,
                "obemeuchechi@gmail.com", Gender.MALE);

         manager.hireCashier(cashierApplicant);

         System.out.println();

        // Instantiating the Product class
         Products product = new Products();
         Products product1 = new Products("milk", 20.20);

         System.out.println();

         manager.updateProduct(product1);

         System.out.println();
         Products product2 = new Products("burger", 5.10);
         manager.updateProduct(product2);

        System.out.println();

         // Instantiating the Customer class
        Customers customer1 = new Customers("Jacob", "08034567547", Gender.MALE, "iamjacob@gmail.com", "milk", 20.20);

        customer1.buyProduct(product1, customer1);

        System.out.println();

        // Instantiating Cashier class
        Cashier cashier = new Cashier("Cynthia", "08043456790", Position.JUNIOR_STAFF,"iamcynthia@gmail.com", Gender.FEMALE);
        cashier.sellProduct(product1, customer1);

        System.out.println();

        cashier.issueReceipt(product1, customer1);


    }
}
