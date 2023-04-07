package P04MethodsExercise;

import java.util.Scanner;

public class P02VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        System.out.println(numOfVowels(input));
    }
    public static int numOfVowels(String input){
        int count=0;
//        char currentSymbol=input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i)=='A'||input.charAt(i)=='a'||input.charAt(i)=='E'||input.charAt(i)=='e'
                    ||input.charAt(i)=='I'||input.charAt(i)=='i'||input.charAt(i)=='U'||input.charAt(i)=='u'
                    ||input.charAt(i)=='Y'||input.charAt(i)=='y'||input.charAt(i)=='O'||input.charAt(i)=='o'){
                count++;
            }
        }
        return count;
    }
}
