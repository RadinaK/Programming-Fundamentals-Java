package P08MapsLambdaAndStreamAPILab;

import java.util.*;

public class P03OddOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] wordsList= scanner.nextLine().split(" ");
        LinkedHashMap<String, Integer> countsMap=new LinkedHashMap<>();

        for (String word:wordsList){
            String wordsInLowerCase=word.toLowerCase();
            if (countsMap.containsKey(wordsInLowerCase)){
                countsMap.put(wordsInLowerCase, countsMap.get(wordsInLowerCase)+1);
            }
            else {
                countsMap.put(wordsInLowerCase, 1);
            }
        }
        ArrayList<String> odds=new ArrayList<>();

        for (var entry:countsMap.entrySet()){
            if (entry.getValue()%2!=0){
                odds.add(entry.getKey());
            }
        }

        for (int i = 0; i < odds.size(); i++) {
            System.out.print(odds.get(i));
            if (i< odds.size()-1){
                System.out.print(", ");
            }
        }
    }
}
