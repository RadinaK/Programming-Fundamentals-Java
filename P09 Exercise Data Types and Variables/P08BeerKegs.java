package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P08BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
//        π * r^2 * h
        double volume=0;
        double biggestKeg=Double.MIN_VALUE;
        String biggestModel="";

        for (int i = 1; i <= num; i++) {
//            •	First – model – string.
//            •	Second –radius – floating-point number
//            •	Third – height – integer number
            String model= scanner.nextLine();
            double radius=Double.parseDouble(scanner.nextLine());
            int height=Integer.parseInt(scanner.nextLine());
            volume=Math.PI*radius*radius*height;
            if (volume>biggestKeg){
                biggestKeg=volume;
                biggestModel=model;
            }
        }
        System.out.print(biggestModel);

    }
}
