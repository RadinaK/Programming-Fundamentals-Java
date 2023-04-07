package P08MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P10SoftUniExamResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        Map<String, Integer> usernamePointsMap=new LinkedHashMap<>();
        Map<String, Integer> languageCountMap=new TreeMap<>();

        while (!input.equals("exam finished")){
            String[] data=input.split("-");
            //1. "{username}-{language}-{points}" -> ["{username}", "{language}", "{points}"]
            String username=data[0];
            if(data.length==3){
                String language=data[1];
                int points=Integer.parseInt(data[2]);

                usernamePointsMap.putIfAbsent(username, points);
                int currentPoints=usernamePointsMap.get(points);
                if (usernamePointsMap.containsKey(username)&&currentPoints>points){
                    usernamePointsMap.put(username, currentPoints);
                }

                languageCountMap.putIfAbsent(language, 1);
                int currentLanguageCount=languageCountMap.get(language);
                if (languageCountMap.containsKey(language)){
                    languageCountMap.put(language, currentLanguageCount+1);
                }
            }
            else {
                //2. "{username}-banned" -> ["{username}", "banned"]
                //remove user from contest, but preserve his submissions in the total count of submissions for each language
                //Kiril-banned
                if(usernamePointsMap.containsKey(username)){
                    usernamePointsMap.remove(username);
                }
            }

            input= scanner.nextLine();
        }
////        print each of the participants, ordered descending by their max points,
////        then by username, in the following format:
////        Results:
////        {username} | {points}
//        System.out.println("Results:");
//        usernamePointsMap.entrySet().stream().sorted((e1, e2)->e2.getValue().compareTo(e1.getValue()))
//                .forEach(entry-> System.out.printf("%s | %d%n", entry.getKey(), entry.getValue()));
////…
////        After that print each language, used in the exam,
////        ordered descending by total submission count and then by language name,
////        in the following format:
////        Submissions:
////        {language} - {submissionsCount}
//        System.out.println("Submissions:");
//        languageCountMap.entrySet().stream().sorted((e1, e2)->e2.getValue().compareTo(e1.getValue()));

        System.out.println();

    }
}
