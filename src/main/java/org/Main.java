package org;

import org.store.*;
import org.storeEnum.Gender;
import org.storeEnum.Position;
import org.storeEnum.Qualification;

public class Main {
    public static void main(String[] args) {
        // Instantiating the CashierApplicant class
        CashierApplicant cashierApplicant = new CashierApplicant("Cynthia", "0809567452", Gender.FEMALE, 25,
                Qualification.BSC_ACCOUNTING, 40);

        // Instantiating the Manager class
         Manager manager = new Manager("Uchechi", "08067907142", Position.SENIOR_STAFF,
                "obemeuchechi@gmail.com", Gender.MALE);

         System.out.println("***************Manager Hiring Cashier********************");
         manager.hireCashier(cashierApplicant);

        // Instantiating the Product class
         Products product1 = new Products("milk", 20.20);

         System.out.println();

         System.out.println("***************Manager Updating Product********************");
         manager.updateProduct(product1);

         Products product2 = new Products("burger", 5.10);
         manager.updateProduct(product2);

         // Instantiating the Customer class
        Customers customer1 = new Customers("Jacob", "08034567547", Gender.MALE, "iamjacob@gmail.com",
                "milk", 19.20);

        System.out.println();
        System.out.println("***************Buying of Product by Customer********************");
        customer1.buyProduct(product1, customer1);


        // Instantiating the Cashier class
        Cashier cashier = new Cashier("Cynthia", "08043456790", Position.JUNIOR_STAFF,
                "iamcynthia@gmail.com", Gender.FEMALE);

        System.out.println();
        System.out.println("***************Selling Of product********************");
        cashier.sellProduct(product1, customer1);

        System.out.println();
        System.out.println("***************Issue Receipt********************");

        cashier.issueReceipt(product1, customer1);


    }
}
