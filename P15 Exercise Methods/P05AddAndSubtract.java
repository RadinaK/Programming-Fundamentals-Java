package P04MethodsExercise;

import java.util.Scanner;

public class P05AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        You will receive 3 integers.
//        Write a method sum to get the sum of the first two integers
//        and subtract method that subtracts the third integer from the result from the sum method.
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int thirdNum=Integer.parseInt(scanner.nextLine());
        int sumOfTheFirstTwoNums= sumOfTheFirstTwoNums(firstNum, secondNum);
        System.out.println(subtract(sumOfTheFirstTwoNums,thirdNum));
    }

    private static int subtract(int sumOfTheFirstTwoNums,int thirdNum) {
        return sumOfTheFirstTwoNums-thirdNum;
    }

    private static int sumOfTheFirstTwoNums(int firstNum, int secondNum) {
        return firstNum+secondNum;
    }
}
