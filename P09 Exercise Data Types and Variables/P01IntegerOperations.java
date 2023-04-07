package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P01IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Read four integer numbers.
//        Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number.
        int num1=Integer.parseInt(scanner.nextLine());
        int num2=Integer.parseInt(scanner.nextLine());
        int num3=Integer.parseInt(scanner.nextLine());
        int num4=Integer.parseInt(scanner.nextLine());
        int result=((num1+num2)/num3)*num4;
        System.out.println(result);
    }
}
