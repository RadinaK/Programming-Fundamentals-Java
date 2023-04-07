package P13FinalExam2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02N03MirrorWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

//        String regex="([@#])(?<word>[A-Za-z]{3,})(\\1)";
        String regex = "([@#])(?<word>[A-Za-z]{3,})(\\1)(\\1)(?<reversed>[A-Za-z]{3,})(\\1)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcherCountWords = pattern.matcher(input);
        Matcher matcher = pattern.matcher(input);

//        Map<String, String> mirrorWordsMap = new LinkedHashMap<>();

        int countMirrorWords = 0;
        int countPairs = 0;
        while (matcherCountWords.find()) {
            countPairs++;
        }
        if (countPairs == 0) {
            System.out.println("No word pairs found!");
            System.out.println("No mirror words!");
        } else {
            System.out.printf("%d word pairs found!%n", countPairs);

            while (matcher.find()) {

                String word = matcher.group("word");
                String reversedWord = matcher.group("reversed");

                StringBuilder reversedSB = new StringBuilder(reversedWord);
//                for (int i = reversedWord.length() - 1; i >= 0; i--) {
//                    reversedSB=new StringBuilder(reversedSB.append(reversedWord.charAt(i)));
//                }
                reversedSB=new StringBuilder(reversedSB.reverse().toString());

                if (word.equals(reversedSB.toString())) {
                    countMirrorWords++;
//                    mirrorWordsMap.put(word, reversedWord);
                }

                if (countMirrorWords == 1) {
                    System.out.println("The mirror words are:");
                    System.out.print(word + " <=> " + reversedWord );

                } else if (countMirrorWords > 1) {
                    System.out.print(", "+word + " <=> " + reversedWord );
                }


            }
            if (countMirrorWords == 0) {
                System.out.println("No mirror words!");
            }
//            if (countMirrorWords == 0) {
//                System.out.println("No mirror words!");
//            } else {
//                System.out.println("The mirror words are:");
//                mirrorWordsMap.entrySet().stream()
//                        .forEach(word -> {
//                            int count=0;
//                                if(count==0) {
//                                    count++;
//                                    System.out.printf("%s <=> %s ", word.getKey(), word.getValue());
//                                }else {
//                                    System.out.printf(", %s <=> %s", word.getKey(), word.getValue());
//                                }
//                        });
//            }
        }
    }
}
