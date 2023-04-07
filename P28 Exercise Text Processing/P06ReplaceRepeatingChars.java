package P09TextProcesingExercise;

import java.util.Scanner;

public class P06ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
//        StringBuilder sb=new StringBuilder();
//        //aaaaabbbbbcdddeeeedssaa ->
//        //aaaaa bbbbb c ddd eeee d ss aa ->
//        //abcdedsa
//        for (int i = 0; i < text.length()-1; i++) {
//            if(i==0){
//                sb.append(text.charAt(0));
//            }
//            if (i==text.length()-1){
//                if(text.charAt(i-1)!=text.charAt(i)){
//                    sb.append(i);
//                }
//                break;
//            }
//            if (text.charAt(i)!=text.charAt(i+1)){
//                sb.append(text.charAt(i+1));
//            }
//        }
//        System.out.println(sb);






        String input = scanner.nextLine().trim();

        StringBuilder sb = new StringBuilder();

        if (input == null || input.length() == 0) {
            return;
        }

        char previousChar = input.charAt(0);
        sb.append(previousChar);

        for (int i = 1; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch != previousChar) {
                sb.append(ch);
                previousChar = ch;
            }
        }

        System.out.println(sb);
    }
}
