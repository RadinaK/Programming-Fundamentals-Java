package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P07VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        You task is to calculate the total price of a purchase from a vending machine.
//        Until you receive "Start" you will be given different coins that are being inserted in the machine.
//        You have to sum them in order to have the total money inserted. There is a problem though.
//        Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins
//        you have to display "Cannot accept {money}", where the value is formatted to the second digit after the decimal point
//        and not add it to the total money. On the next few lines until you receive "End" you will be given products to purchase.
//        Your machine has however only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively.
//        If the person tries to purchase a not existing product print “Invalid product”. Be careful that the person may try to purchase
//        a product for which he doesn't have money. In that case print "Sorry, not enough money".
//        If the person purchases a product successfully print "Purchased {product name}". After the “End” command
//        print the money that are left formatted to the second decimal point in the format "Change: {money left}".
        String command = scanner.nextLine();
        double sum = 0;
        while (!command.equals("Start")) {
            double money = Double.parseDouble(command);
            if (money != 0.10 && money != 0.20 && money != 0.50 && money != 1.00 && money != 2.00) {
                System.out.printf("Cannot acept %.2f", money);
                System.out.println();
            } else {
                sum = sum + money;
            }
            command=scanner.nextLine();
        }
        command=scanner.nextLine();
        while (!command.equals("End")) {
            String item = command;

            switch (item) {
                case "Nuts":
                    if (sum >= 2.0) {
                        System.out.printf("Purchased %s", item);
                        System.out.println();
                        sum = sum - 2.0;
                    } else {
                        System.out.printf("Sorry, not enough money");
                    }
                    break;
                case "Water":
                    if (sum >= 0.7) {
                        System.out.printf("Purchased %s", item);
                        System.out.println();
                        sum = sum - 0.7;
                    } else {
                        System.out.printf("Sorry, not enough money");
                    }
                    break;
                case "Crisps":
                    if (sum >= 1.5) {
                        System.out.printf("Purchased %s", item);
                        System.out.println();
                        sum = sum - 1.5;
                    } else {
                        System.out.printf("Sorry, not enough money");
                        System.out.println();
                    }
                    break;
                case "Soda":
                    if (sum >= 0.8) {
                        System.out.printf("Purchased %s", item);
                        System.out.println();
                        sum = sum - 0.8;
                    } else {
                        System.out.printf("Sorry, not enough money");
                        System.out.println();
                    }
                    break;
                case "Coke":
                    if (sum >= 1.0) {
                        System.out.printf("Purchased %s", item);
                        System.out.println();
                        sum = sum - 1.0;
                    } else {
                        System.out.printf("Sorry, not enough money");
                        System.out.println();
                    }
                    break;
                default:
                    System.out.printf("Invalid product");
                    System.out.println();
                    break;
            }
            command = scanner.nextLine();
        }
        System.out.printf("Change: %.2f", sum);
        System.out.println();
    }
}

