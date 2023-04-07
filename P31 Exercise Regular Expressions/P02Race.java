package P10RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P02Race {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"George, Peter, Bill, Tom".split(", ") -> ["George", "Peter", "Bill", "Tom"]
        List<String> racersList= Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());

        String input= scanner.nextLine();

        //име на състезателя -> дистанция
        Map<String, Integer>racersDistanceMap=new LinkedHashMap<>();
        racersList.forEach(racer -> racersDistanceMap.put(racer, 0));

        //Регекси
        String regexLetters="[A-Za-z]+";
        Pattern patternLetter=Pattern.compile(regexLetters);

        String regexDigits="[\\d]";
        Pattern patternDigit=Pattern.compile(regexDigits);

        while (!input.equals("end of race")){
            //input = "G!32e%o7r#32g$235@!2e"
            //1. игнорирам специални символи различни от буква и цифра
            //2. буквите -> име на състезателя

            //всички букви -> ["G", "e", "o", "r", "g", "e"]
            Matcher matcherName= patternLetter.matcher(input);

            StringBuilder nameBuilder = new StringBuilder(); // конструирам името на състезателя
            while (matcherName.find()){
                nameBuilder.append(matcherName.group());
            }

            //всички цифри -> ["3", "2", "7", "3", "2"]
            Matcher matcherDigits=patternDigit.matcher(input);

            int distance=0;
            while (matcherDigits.find()){
                distance+=Integer.parseInt(matcherDigits.group());
            }

            //име на човек + дистанция
            String racerName=nameBuilder.toString();

            if(racersDistanceMap.containsKey(racerName)){
                int currentDistance=racersDistanceMap.get(racerName);
                racersDistanceMap.put(racerName, distance+currentDistance);
            }


            input= scanner.nextLine();
        }
        //начин 1:
        //връщаме мап с първите три елемента след сортирането
        /*Map<String,Integer> firstThreeRacers = racersDistances.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))//descending order (намаляващ ред)
                .limit(3)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a1, a2) -> a1, LinkedHashMap::new));*/


        //състезател -> избягана дистанция
        //1. сортираме по value (дистанция) в descending order
        //racersDistances.entrySet().stream().sorted(Map.Entry.comparingByValue()) -> ascending order (нарастващ ред)
        //начин 2:
        //списък с имената на първите трима
        List<String>firstTreeRacers = racersDistanceMap.entrySet().stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .map(entry -> entry.getKey())
                .collect(Collectors.toList());

        System.out.printf("1st place: %s%n", firstTreeRacers.get(0));
        System.out.printf("2nd place: %s%n", firstTreeRacers.get(1));
        System.out.printf("3rd place: %s%n", firstTreeRacers.get(2));

    }
}
