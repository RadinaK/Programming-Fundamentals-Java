package P04MethodsExercise;

import java.util.Scanner;

public class P08FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Read two integer numbers. Calculate factorial of each number.
//        Divide the first result by the second and print the division formatted to the second decimal point.
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        long firstFactorial=factorial(firstNum);
        long secondFactorial=factorial(secondNum);
        division(firstFactorial,secondFactorial);
    }

    private static void division(long firstFactorial,long secondFactorial) {
        double division=firstFactorial*1.0/secondFactorial;
        System.out.printf("%.2f", division);
    }

    private static long factorial(int num) {
        long factorial=1;
        for (int i = num; i >=2 ; i--) {
            factorial=factorial*i;
        }
        return factorial;
    }
}
