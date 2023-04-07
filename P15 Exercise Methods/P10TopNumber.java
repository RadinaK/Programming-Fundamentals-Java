package P04MethodsExercise;

import java.util.Scanner;

public class P10TopNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	Its sum of digits is divisible by 8, e.g. 8, 16, 88.
//•	Holds at least one odd digit, e.g. 232, 707, 87578.
        int num=Integer.parseInt(scanner.nextLine());
        for (int number = 1; number <= num;number ++) {

            boolean isSumOfDigitsDivisibleBy8= isSumOfDigitsDivisibleBy8(number);
            boolean numHoldsAtLeastOneOddDigit= numHoldsAtLeastOneOddDigit(number);
            if (isSumOfDigitsDivisibleBy8&&numHoldsAtLeastOneOddDigit){
                System.out.println(number);
            }
        }

    }

    private static boolean numHoldsAtLeastOneOddDigit(int number) {
        while (number>0){
            int lastDigit=number%10;
            if (lastDigit%2==1){
                return true;
            }
            number/=10;
        }
        return false;

    }

    private static boolean isSumOfDigitsDivisibleBy8(int number) {
        int sum=0;
        while (number>0){
            int lastDigit=number%10;
            sum+=lastDigit;
            number=number/10;
        }
        return sum%8==0;
    }
}
