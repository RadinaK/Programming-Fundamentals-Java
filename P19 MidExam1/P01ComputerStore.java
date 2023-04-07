package P06MidExam1;

import java.util.Scanner;

public class P01ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        double totalSum = 0;

        while (!input.equals("special") && !input.equals("regular")) {
            double partsPrice = Double.parseDouble(input);
            if (partsPrice < 0) {
                System.out.println("Invalid price!");
            } else {
                totalSum+=partsPrice;
            }

            input = scanner.nextLine();
        }
        double sumWithoutTaxes=totalSum;

        double taxes = totalSum * 20 / 100;
        totalSum+=taxes;

        if (input.equals("special")) {
            totalSum -= totalSum * 10 / 100;
        }
        if (totalSum == 0) {
            System.out.println("Invalid order!");
        } else {

            System.out.printf("Congratulations you've just bought a new computer!%nPrice without taxes: %.2f$%nTaxes: %.2f$%n-----------%nTotal price: %.2f$", sumWithoutTaxes,taxes,totalSum);

        }
    }
}
