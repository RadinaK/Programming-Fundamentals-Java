package P04MethodsExercise;

import java.util.Scanner;

public class P09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        while (!input.equals("END")){
            isPalindrome(input);
            input= scanner.nextLine();
        }

    }

    private static void isPalindrome(String input) {
        String reversedNum=calculatePalindrome(input);
        if (input.equals(reversedNum)){
            System.out.println("true");
        }
        else System.out.println("false");
    }

    private static String calculatePalindrome(String input) {
        String reversedNum= "";


            for (int i = input.length()-1; i >=0 ; i--) {
                char reversed=input.charAt(i);
                reversedNum+=reversed;
            }


        return reversedNum;
    }
}
