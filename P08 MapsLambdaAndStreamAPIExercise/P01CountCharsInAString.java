package P08MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P01CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text= scanner.nextLine();

        Map<Character, Integer> charsCountMap=new LinkedHashMap<>();

        for (char symbol:text.toCharArray()) {
            if (symbol==' '){
                continue;
            }
            if (!charsCountMap.containsKey(symbol)){
                charsCountMap.put(symbol, 1);
            }
            else {
                int currentCount=charsCountMap.get(symbol);
                charsCountMap.put(symbol, currentCount+1);
            }
        }

//        charsCountMap.entrySet().forEach(entry -> System.out.println(entry.getKey() +" -> "+entry.getValue()));

        for (Map.Entry<Character, Integer> entry:charsCountMap.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
