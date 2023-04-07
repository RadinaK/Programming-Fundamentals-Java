package P04MethodsLab;

import java.util.Scanner;

public class P05Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	coffee – 1.50
//•	water – 1.00
//•	coke – 1.40
//•	snacks – 2.00
        String item = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        switch (item) {
            case "coffee":
                coffee(num);
                break;
            case "water":
                water(num);
                break;
            case "coke":
                coke(num);
                break;
            case "snacks":
                snacks(num);
                break;
        }

    }

    public static void coffee(int num) {
        double price=num*1.50;
        System.out.printf("%.2f", price);
    }

    public static void water(int num) {
        double price=num*1.00;
        System.out.printf("%.2f", price);
    }

    public static void coke(int num) {
        double price=num*1.40;
        System.out.printf("%.2f", price);
    }

    public static void snacks(int num) {
        double price=num*2.00;
        System.out.printf("%.2f", price);
    }
}
