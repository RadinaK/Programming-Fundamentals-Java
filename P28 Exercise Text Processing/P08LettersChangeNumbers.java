package P09TextProcesingExercise;

import java.util.Scanner;

public class P08LettersChangeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        "A12b s17G"
//  First you start with the letter before the number.
//        A -> 12/1=12
//•	If it's uppercase you divide the number by the letter's position in the alphabet.
//
//•	If it's lowercase you multiply the number with the letter's position in the alphabet.
//         s -> 17*19=323
//
//  Then you move to the letter after the number.
//•	If it's uppercase you subtract its position from the resulted number.
//        G -> 323-7=316
//•	If it's lowercase you add its position to the resulted number.
//        b -> 12+2=14
//        you to write a program that calculates the sum of all numbers
//        after the operations on each number have been done
//        316+4=330

//        String[] input= scanner.nextLine().split("\\s+");
//        for (int i = 0; i < input.length; i++) {
//            String currentPair=input[i];
//            for (int j = 0; j < currentPair.length(); j++) {
//                char currentSymbol=currentPair.charAt(j);
//                char firstLetter=currentPair.charAt(0);
//
//            }
//        }


        String input = scanner.nextLine();
        String[] text = input.split("\\s+");
        double totalSum = 0;
        for (String password : text) {
            double number = doModifiedNumber(password);

            totalSum += number;

        }

        System.out.printf("%.2f", totalSum);

    }

    private static double doModifiedNumber(String password) {
        char firstLetter = password.charAt(0);
        char lastLetter = password.charAt(password.length() - 1);


        //1.Way
        StringBuilder numberBuilder = new StringBuilder(password);
        double number = Double.parseDouble(numberBuilder.deleteCharAt(0).deleteCharAt(numberBuilder.length() - 1).toString());

        //2.Way
//        double number=Double.parseDouble(password.replace(firstLetter, ' ').replace(lastLetter, ' ').trim());

        //3.Way
//        double number=Double.parseDouble(password.substring(0, password.length()-1));

        //1)UpperCase -> firstLetter
        if (firstLetter >= 65 && firstLetter <= 90) {
            int positionLetter = (int) firstLetter - 64;
            number /= positionLetter;
        }
        //3)LowerCase -> firstLetter
        else {
            int positionLetter = (int) firstLetter - 96;
            number *= positionLetter;
        }
        //2)UpperCase -> lastLetter
        if (Character.isUpperCase(lastLetter)) {
            int positionLetter = (int) lastLetter - 64;
            number -= positionLetter;
        }

        //4)LowerCase -> lastLetter
        else {
            int positionLetter = (int) lastLetter - 96;
            number += positionLetter;
        }
        return number;
    }
}
