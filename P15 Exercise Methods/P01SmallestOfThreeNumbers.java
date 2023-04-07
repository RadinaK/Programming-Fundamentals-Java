package P04MethodsExercise;

import java.util.Scanner;

public class P01SmallestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNum=Integer.parseInt(scanner.nextLine());
        int secondNum=Integer.parseInt(scanner.nextLine());
        int thirdNum=Integer.parseInt(scanner.nextLine());
        printSmallestNum(firstNum,secondNum,thirdNum);
    }
    public static void printSmallestNum(int a, int b, int c){


        if(a<=b&&a<=c){
            System.out.println(a);;
        }
        else if(c<=b&&c<=a){
            System.out.println(c);
        }
        else {
            System.out.println(b);
        }

    }
}
