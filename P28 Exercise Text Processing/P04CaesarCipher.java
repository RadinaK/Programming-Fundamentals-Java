package P09TextProcesingExercise;

import java.util.Scanner;

public class P04CaesarCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();
        StringBuilder sb=new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char newSymbol =(char)(text.charAt(i)+3);
            sb.append(newSymbol);
        }
        System.out.println(sb);
    }
}
