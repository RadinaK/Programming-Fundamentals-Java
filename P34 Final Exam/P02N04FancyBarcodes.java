package P13FinalExam2;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02N04FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regex = "([@][#]+)(?<nums>[A-Z][A-Za-z0-9]{4,}[A-Z])(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = null;
        for (int i = 0; i < n; i++) {
            String input = scanner.nextLine();
            matcher = pattern.matcher(input);
            StringBuilder sb = new StringBuilder();

            if (matcher.find()) {
                String word = matcher.group("nums");
                for (int j = 0; j < word.length(); j++) {
                    char symbol=word.charAt(j);
                    if (Character.isDigit(symbol)) {
                        sb.append(word.charAt(j));
                    }
                }

                if (sb.length() == 0) {
                    System.out.println("Product group: 00");
                } else {
                    System.out.println("Product group: " + sb);
                }

            } else {
                System.out.println("Invalid barcode");
            }
        }

    }
}
