package P04MethodsExercise;

import java.util.Scanner;

public class P06MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        You will receive a single string. Write a method that prints the middle character.
//        If the length of the string is even, there are two middle characters.
        String[] text=scanner.nextLine().split("");
        printMiddleCharacter(text);
    }

    private static void printMiddleCharacter(String[] text) {
//        for (int index = 0; index < text.length/2; index++) {
            if (text.length % 2 == 0) {
                System.out.print(text[text.length/2-1]+text[text.length/2]);
            }
            else System.out.println(text[text.length/2]);
//        }
    }
}
