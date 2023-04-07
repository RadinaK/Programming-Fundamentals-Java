package P09TextProcesingExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05MultiplyWithoutBigInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bigNumber = scanner.nextLine();
        int secondNumber = Integer.parseInt(scanner.nextLine());

        if (secondNumber == 0) {
            System.out.println(0);
            return;
        }

        while (bigNumber.charAt(0) == '0') {
            bigNumber = bigNumber.substring(1);
        }

        StringBuilder stringBuilder = new StringBuilder();
        int result = 0;
        int rest = 0;

        for (int i = bigNumber.length() - 1; i >= 0; i--) {
            int currentDigit = Integer.parseInt(String.valueOf(bigNumber.charAt(i)));
            result = currentDigit * secondNumber + rest;
            rest = 0;

            if (result > 9) {
                rest = result / 10;
                result = result % 10;
            }
            stringBuilder.append(result);
        }
        if (rest != 0) {
            stringBuilder.append(rest);
        }
        System.out.println(stringBuilder.reverse());
    }
}
