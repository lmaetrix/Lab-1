/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lorie.store;
import java.util.Scanner;
/**
 *
 * @author yuanb
 */
public class LorieStore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean main = true;

        while (main == true) {
            System.out.println("Welcome sa tindahan ni lorie!!");
            Scanner enter = new Scanner(System.in);
            System.out.println("Malit ka??");
            String trap = enter.next();
            main = false;
            boolean check = false;
            double totalcost = 0;

            while (trap.equalsIgnoreCase("yes")) {
                System.out.println("teh pili sag product \n input number to product code \n item \t cost \t   code:"
                        + "\n Nike\t   PHP7000\t  1"
                        + "\n Jordan\t PHP3600\t 2 "
                        + "\n Fendi\t  PHP5000\t 3 "
                        + "\n Fila \t  PHP 1000\t4"
                        + "\n LV\t     PHP7000\t 5");

                int select = enter.nextInt();
                double price = 0;
                String productName = "";

                switch (select) {
                    case 1:
                        price = 7000;
                        productName = "Nike";
                        check = true;
                        break;

                    case 2:
                        price = 3600;
                        productName = "Jordan";
                        check = true;
                        break;

                    case 3:
                        price = 5000;
                        productName = "Fendi";
                        check = true;
                        break;

                    case 4:
                        price = 1000;
                        productName = "Fila";
                        check = true;
                        break;

                    case 5:
                        price = 7000;
                        productName = "Louis Vuitton";
                        check = true;
                        break;
                }
                if (check == true) {
                    System.out.println("Succesfully Selected" + productName + "for Php" + price + "\n enter quantity:");
                    double quantity =
                            enter.nextDouble();
                    double subtotal = price * quantity;
                    totalcost += subtotal;
                    System.out.println("Subtotal:" + quantity + " * " + price + "= Php" + subtotal);
                    // Ask if user want to purchased another item
                    System.out.println("Do you want to purchase another item? (yes/no)");
                    trap = enter.next();// update 'trap' for the loop condition
                }
               double discount = 0.10;
               double totalDis = 0;
               double total = 0;

               if (totalcost > 1000) {
                   totalDis = totalcost * discount;
                   total = totalcost - totalDis;
                   System.out.println("discount applied to 10%");
                } else {
                   total = totalcost;
               }
                if (trap.equalsIgnoreCase("no")) {
                    System.out.println("Total: Php" + total);
                    // Ask user to enter the payment amount
                    double payment = 0;

                    do {
                        System.out.println("please enter the amount of money to pay:");
                        payment = enter.nextDouble();
                        // Check if payment is sufficient
                        if (payment < total) {

                            System.out.print("Insufficient funds. You need at least Php" + (total - payment + "more."));
                        } else {
                            double change = payment - total;
                            System.out.println("Payment accepted. your change is Php" + change + "\n Thank you for shopping!");
                        }

                    } while (payment < total);
                    main = true;
                    System.out.println("---------------------------------------");
                }
            }



        }
    }
}
