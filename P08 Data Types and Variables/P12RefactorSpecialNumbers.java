package P02DataTypesAndVariablesLab;

import java.util.Scanner;

public class P12RefactorSpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        boolean isTrue = false;
        for (int number = 1; number <= num; number++) {
            int sum = 0;
            int current = 0;
            current = number;
            while (number > 0) {
                sum += number % 10;
                number = number / 10;
            }
            isTrue = (sum == 5) || (sum == 7) || (sum == 11);
            if (isTrue){

                System.out.printf("%d -> True%n", current);
            }
            else {
                System.out.printf("%d -> False%n", current);
            }
            sum = 0;
            number = current;
        }

    }
}
