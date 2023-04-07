package P03ArraysExercise;

import java.util.Scanner;

public class P03ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] firstArray = new String[n];
        String[] secondArray = new String[n];
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            String firstNum = input.split(" ")[0];
            String secondNum = input.split(" ")[1];

            if ((i+1) % 2 == 0) {
                firstArray[i]=secondNum;
                secondArray[i]=firstNum;
            } else {
                firstArray[i]=firstNum;
                secondArray[i]=secondNum;
            }
        }
        for (String element:firstArray){
            System.out.print(element+" ");
        }
        System.out.println();
        for (String el2:secondArray){
            System.out.print(el2+" ");
        }
    }
}
