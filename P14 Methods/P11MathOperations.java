package P04MethodsLab;

import java.text.DecimalFormat;
import java.util.Scanner;

public class P11MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum = Integer.parseInt(scanner.nextLine());
        String symbol = scanner.nextLine();
        int secondNum = Integer.parseInt(scanner.nextLine());

        DecimalFormat df = new DecimalFormat("##.##");



        switch (symbol) {
            case "+":
                System.out.println(df.format(add(firstNum, secondNum)));
                break;
            case "*":
                System.out.println(df.format(multiply(firstNum, secondNum)));
                break;
            case "-":
                System.out.println(df.format(subtract(firstNum, secondNum)));
                break;
            case "/":
                System.out.println(df.format(divide(firstNum, secondNum)));
                break;
        }


    }

    public static int add(int firstNum, int secondNum) {
        return firstNum + secondNum;

    }

    public static int multiply(int firstNum, int secondNum) {
        return firstNum * secondNum;
    }

    public static int subtract(int firstNum, int secondNum) {
        return firstNum - secondNum;
    }

    public static double divide(int firstNum, int secondNum) {
        return firstNum * 1.0 / secondNum;
    }
}
