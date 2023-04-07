package P04MethodsLab;

import java.util.Scanner;

public class P07RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int num = Integer.parseInt(scanner.nextLine());
        System.out.println(printString(command, num));


    }

    public static String printString(String textToRepeat, int n) {
        String output = "";
        for (int i = 0; i < n; i++) {
            output += textToRepeat;
        }
        return output;
    }
}
