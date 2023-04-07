package P04MethodsExercise;

import java.util.Scanner;

public class P07NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Write a method that receives a single integer n and prints nxn matrix with that number.
        int num=Integer.parseInt(scanner.nextLine());
        printNxNMatrix(num);
    }

    private static void printNxNMatrix(int num) {
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <=num -1; j++) {
                System.out.print(num+" ");
            }
            System.out.println(num+" ");
        }
    }
}
