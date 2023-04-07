package P08MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P09ForceBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        Map<String, List<String>> forceBookMap=new LinkedHashMap<>();

        while (!input.equals("Lumpawaroo")){

            if (input.contains("|")){
                //Команда 1: input = "{forceSide} | {forceUser}" -> split(" | ") -> ["forceSide", "forceUser"]
                String forceSide=input.split("\\s+\\|\\s+")[0];
                String forceUser=input.split("\\s+\\|\\s+")[1];

                //проверка дали я има страната
                //ако я няма -> създаваме
                forceBookMap.putIfAbsent(forceSide, new ArrayList<>());

//                if (!forceSideMap.containsKey(forceSide)){
//                    forceSideMap.put(forceSide, new ArrayList<>());
//                }
//                forceSideMap.get(forceSide).add(forceUser);

                //проверяваме дали User-a го има
                //ако го няма -> добавяме към новата страна
                boolean isExist=false;
                for (List<String> list:forceBookMap.values()) {
                    if (list.contains(forceUser)){
                        isExist=true;
                    }
                }
                if (!isExist){
                    //добавяме forceUser във forceSide, защото го няма
                    forceBookMap.get(forceSide).add(forceUser);
                }
            }
            else if(input.contains("->")){
                //Команда 2: "{forceUser} -> {forceSide}" -> split(" -> ") -> ["forceUser","forceSide"]
                String forceUser=input.split("\\s+\\->\\s+")[0];
                String forceSide=input.split("\\s+\\->\\s+")[1];

                //Премахваме User-a от предишната му страна
                forceBookMap.entrySet().forEach(entry->entry.getValue().remove(forceUser));
                //проверяваме дали тази страна я има
                //ако я няма -> създаваме Side
                forceBookMap.putIfAbsent(forceSide, new ArrayList<>());
                //ако да -> добавяме user-a към списъка
                forceBookMap.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);

            }
            input= scanner.nextLine();
        }
        //key(side) -> value(list of people)
        forceBookMap.entrySet().stream().filter(entry -> entry.getValue().size()>0)
                .sorted((e1, e2)->{
                    //по големина на броя на хората -> descending order -> низходящ ред
                    //3
                    //2
                    //1
                    int sortedResult = Integer.compare(e2.getValue().size(), e1.getValue().size());
                    //1 -> втория размер > първия -> разменя ги
                    //0 -> размерите на двата списъка са еднакви
                    //-1 -> втория размер < първия -> НЕ ги разменя
                    if (sortedResult==0){
                        //ако броят на хората в двете страни е еднакъв -> сортираме по име на страната
                        sortedResult=e1.getKey().compareTo(e2.getKey());
                        //e1 < e2 -> -1
                        //e1 == e2 -> 0
                        //e1 > e2 -> 1
                    }
                    return sortedResult;
                }).forEach(entry->{
                    //Side: {forceSide}, Members: {forceUser.Count}
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(user-> System.out.printf("! %s%n", user));
                });
    }
}
