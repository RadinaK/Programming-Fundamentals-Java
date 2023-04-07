package P09TextProcesingLab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P01ReverseStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        Map<String, String> reversedStringMap=new LinkedHashMap<>();
        while (!input.equals("end")){
            String reversedWord ="";
            for (int i = input.length()-1; i >= 0 ; i--) {
                        reversedWord=reversedWord + input.charAt(i);
            }
            reversedStringMap.put(input,reversedWord);
            input= scanner.nextLine();
        }
        reversedStringMap.entrySet().stream()
                .forEach(e-> System.out.printf("%s = %s%n", e.getKey(), e.getValue()));
    }
}
