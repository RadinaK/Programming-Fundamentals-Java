package P04MethodsLab;

import java.util.Scanner;

public class P09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type = scanner.nextLine();
        switch (type) {
            case "int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondtNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondtNum));
                break;
            case "char":
                String firstSymbol = scanner.nextLine();
                String secondSymbol = scanner.nextLine();
                System.out.println(getMax(firstSymbol, secondSymbol));
                break;
            case "string":
                String firstText = scanner.nextLine();
                String secondText = scanner.nextLine();
                System.out.println(getMax(firstText, secondText));
                break;
        }
    }

    public static int getMax(int firstNum, int secondNum) {
        if (firstNum > secondNum) {
            return firstNum;
        } else return secondNum;
    }

    public static int getMax(char firstSymbol, char secondSymbol) {
        if (firstSymbol > secondSymbol) {
            return firstSymbol;
        } else return secondSymbol;
    }

    public static String getMax(String firstText, String secondText) {
        String maxText = "";
        if (firstText.compareTo(secondText) > 0) {
            maxText = firstText;
        } else maxText = secondText;
        return maxText;

    }
}
