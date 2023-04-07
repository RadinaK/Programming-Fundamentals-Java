package P08MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PP01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input=scanner.nextLine();
        Map<Character, Integer> charCountMap=new LinkedHashMap<>();

        for (char symbol:input.toCharArray()) {
            if (symbol==' '){
                continue;
            }
            if(!charCountMap.containsKey(symbol)){
                charCountMap.put(symbol, 1);
            }
            else {
                int count=charCountMap.get(symbol);
                charCountMap.put(symbol, count+1);
            }
        }
        charCountMap.entrySet().forEach(entry->System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));

    }
}
