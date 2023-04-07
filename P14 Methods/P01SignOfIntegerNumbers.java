package P04MethodsLab;

import java.util.Scanner;

public class P01SignOfIntegerNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());

        printNum(num);
    }
    public static void printNum(int number){

            if (number>0){
                System.out.printf("The number %d is positive.", number);
            }
            else if (number<0){
                System.out.printf("The number %d is negative.", number);
            }
            else {
                System.out.printf("The number %d is zero.", number);
        }
    }
}
