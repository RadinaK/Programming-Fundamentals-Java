package P12FinalExam;

import java.util.*;

public class P03DegustationParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, List<String>> mealsMap = new TreeMap<>();
        int countDislikes = 0;

        while (!input.equals("Stop")) {
            String[] tokens = input.split("-");
            String command = tokens[0];
            String guest = tokens[1];
            String meal = tokens[2];


            switch (command) {
                case "Like":
                    if (!mealsMap.containsKey(guest)) {
                        mealsMap.put(guest, new ArrayList<>());
                        mealsMap.get(guest).add(meal);
                    } else if (mealsMap.containsKey(guest) && mealsMap.get(guest).size() == 0) {
                        mealsMap.get(guest).add(meal);
                    }
                    break;

                case "Dislike":
                    if (!mealsMap.containsKey(guest)) {
                        System.out.printf("%s is not at the party.%n", guest);
                    } else if (mealsMap.containsKey(guest) && !mealsMap.get(guest).contains(meal)) {
                        System.out.printf("%s doesn't have the %s in his/her collection.%n", guest, meal);
                    } else if (mealsMap.containsKey(guest) && mealsMap.get(guest).size() > 0) {
                        mealsMap.get(guest).remove(meal);
                        System.out.printf("%s doesn't like the %s.%n", guest, meal);
                        countDislikes++;
                    }
                    break;
            }


            input = scanner.nextLine();
        }



//        mealsMap
//                .entrySet()
//                .stream()
//                .sorted((a, b) -> b.getValue().size() - a.getValue().size())
//                .forEach(pair -> {
//                    if(pair.getValue().size()==0){
//                        System.out.println(pair.getKey() + ":");
//                    }else {
//                        System.out.printf("%s: ", pair.getKey());
//                        pair.getValue().forEach(el ->
//                                System.out.printf("%s%n", el));
//
//                    }
//
//
////                    System.out.println(pair.getKey()+": "+pair.getValue().forEach(el-> ););
//                });



        mealsMap.entrySet().stream().sorted(Map.Entry.comparingByKey())
                .forEach(guest -> {
                    System.out.print(guest.getKey()+": ");
                    guest.getValue().forEach(meal -> System.out.print(meal + ", "));
                    System.out.println();
                });


//        mealsMap.entrySet().stream()
//                .sorted(Map.Entry.<String, List<String>>comparingByValue().reversed()
//                        .thenComparing(Map.Entry.comparingByKey()))
//                .forEach(e-> System.out.printf("%s | %d%n", e.getKey(), e.getValue()));

//        mealsMap.entrySet().stream().sorted((entry1, entry2) -> {
//            boolean result=entry2.getValue().size()>entry1.getValue().size();
//                     }).
//                .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
////        junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
//
//


        System.out.printf("Unliked meals: %d", countDislikes);



    }
}