package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P02SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int currentNum = number;
        while (currentNum > 0) {
            sum = sum + currentNum % 10;
            currentNum = currentNum / 10;
        }
        System.out.println(sum);
    }
}
