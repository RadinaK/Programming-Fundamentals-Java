package P11FinalExamPreparationLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02FancyBarcodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        String regexValidate = "[@][#]+[A-Z][A-Z0-9a-z]{4,}[A-Z][@][#]+";
        Pattern pattern = Pattern.compile(regexValidate);
        Matcher matcherValidate = null;

        for (int i = 0; i < n; i++) {
            String barcode = scanner.nextLine();
            matcherValidate = pattern.matcher(barcode);

            StringBuilder codeBuilder = new StringBuilder();

            if (matcherValidate.find()) {
                for (int j = 0; j < barcode.length(); j++) {
                    char symbol=barcode.charAt(j);
                    if(Character.isDigit(symbol)){
                        codeBuilder.append(symbol);
                    }
                }
                if (codeBuilder.length()==0){
                    System.out.println("Product group: 00");
                }
                else {
                    System.out.println("Product group: "+codeBuilder);
                }
            }
            else{
                System.out.println("Invalid barcode");
            }
        }


    }
}

