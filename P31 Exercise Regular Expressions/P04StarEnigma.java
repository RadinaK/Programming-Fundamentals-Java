package P10RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class P04StarEnigma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numMessages = Integer.parseInt(scanner.nextLine());

        String regex = "[STARstar]";
        Pattern pattern = Pattern.compile(regex);
        StringBuilder decryptionMassage = new StringBuilder();

//        Map<String, List<String>> attackedPlanetsNameMap=new TreeMap<>();
//        Map<String, List<String>> destroyedPlanetsNameMap=new TreeMap<>();

        List<String>attackedPlanetsNameList=new ArrayList<>();
        List<String>destroyedPlanetsNameList=new ArrayList<>();

        for (int i = 0; i < numMessages; i++) {
            String message = scanner.nextLine();

            int key = 0;

            Matcher matcher = pattern.matcher(message);

            while (matcher.find()) {
                key++;
            }

            for (char symbol : message.toCharArray()) {
                int currentPosition=symbol;
                char decryptedSymbol= (char) (currentPosition-key);
                decryptionMassage.append(decryptedSymbol);
            }

            Pattern patternTypes=Pattern.compile("@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<planetPopulation>\\d+)[^@!:>-]*!(?<typeAttack>[AD])![^@:>!-]*->(?<soldiersCount>\\d+)");
            Matcher matcherTypes=patternTypes.matcher(decryptionMassage);

            while (matcherTypes.find()){
                String planetName=matcherTypes.group("planetName");
                int planetPopulation=Integer.parseInt(matcherTypes.group("planetPopulation"));
                String attack=matcherTypes.group("typeAttack");
                int soldiersCount=Integer.parseInt(matcherTypes.group("soldiersCount"));


//                if(attack.equals("A")){
////                    System.out.printf("Attacked planets: %d%n", countAttackedPlanets);
//                    if(!attackedPlanetsNameMap.containsKey(attack)){
//                        attackedPlanetsNameMap.put(attack, new ArrayList<>());
//                    }
//                    attackedPlanetsNameMap.get(attack).add(planetName);
//                }else {
////                    System.out.printf("Destroyed planets: %d%n", countDestroyedPlanets);
//                    if(!destroyedPlanetsNameMap.containsKey(attack)){
//                        destroyedPlanetsNameMap.put(attack, new ArrayList<>());
//                    }
//                    destroyedPlanetsNameMap.get(attack).add(planetName);
//                }

                if(attack.equals("A")){
                    attackedPlanetsNameList.add(planetName);
                }else {
                    destroyedPlanetsNameList.add(planetName);
                }

            }



                decryptionMassage= new StringBuilder("");

        }

        //with Lists
        System.out.printf("Attacked planets: %d%n", attackedPlanetsNameList.size());
        Collections.sort(attackedPlanetsNameList);
        attackedPlanetsNameList.forEach(e->System.out.println("-> "+ e));

        System.out.printf("Destroyed planets: %d%n", destroyedPlanetsNameList.size());
        Collections.sort(destroyedPlanetsNameList);
        destroyedPlanetsNameList.forEach(planet-> System.out.println("-> "+planet));



        //with Maps

//        if(attackedPlanetsNameMap.isEmpty()){
//            System.out.println("Attacked planets: 0");
//        }else {
//            attackedPlanetsNameMap.entrySet()
//                    .forEach(entry->{
//                        System.out.printf("Attacked planets: %d%n", entry.getValue().size());
//                        entry.getValue().stream().sorted().forEach(e->System.out.println("-> "+ e));
//                        //ascending order / нарастващ ред
//                    });
//        }
//        if(destroyedPlanetsNameMap.isEmpty()){
//            System.out.println("Destroyed planets: 0%");
//        }else {
//            destroyedPlanetsNameMap.entrySet().stream()
//                    .forEach(entry->{
//                        System.out.printf("Destroyed planets: %d%n", entry.getValue().size());
//                        entry.getValue().stream().sorted().forEach(e->System.out.println("-> "+ e));
//                        //ascending order / нарастващ ред
//                    });
//        }




    }
}



//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int countMessages = Integer.parseInt(scanner.nextLine());
//        String regex = "@(?<planetName>[A-Za-z]+)[^@!:>-]*:(?<population>[0-9]+)[^@!:>-]*!(?<attack>[AD])![^@!:>-]*->(?<soldierCount>[0-9]+)";
//        Pattern pattern = Pattern.compile(regex);
//
//        List<String> attackersPlanets = new ArrayList<>(); //списък с планетите с тип на атака A
//        List<String> destroyedPlanets = new ArrayList<>(); //списък с планетите с тип на атака D
//        for (int messageCount = 1; messageCount <= countMessages; messageCount++) {
//            String encryptedMessage = scanner.nextLine(); //криптирано съобщение
//            String decryptedMessage = getDecryptedMessage(encryptedMessage); //декриптирано
//            //декриптирано: PQ@Alderaa1:30000!A!->20000
//            Matcher matcher = pattern.matcher(decryptedMessage);
//            if (matcher.find()) {
//                String planetName = matcher.group("planetName");
//                //int population = Integer.parseInt(matcher.group("population"));
//                String attackType = matcher.group("attack");  ; //A -> attacker; D - > destroyed
//                //int soldierCount = Integer.parseInt(matcher.group("soldierCount"));
//                if (attackType.equals("A")) {
//                    attackersPlanets.add(planetName);
//                } else if (attackType.equals("D")) {
//                    destroyedPlanets.add(planetName);
//                }
//            }
//        }
//
//        System.out.println("Attacked planets: " + attackersPlanets.size());
//        Collections.sort(attackersPlanets);
//        attackersPlanets.forEach(planet -> System.out.println("-> " + planet));
//
//        System.out.println("Destroyed planets: " + destroyedPlanets.size());
//        Collections.sort(destroyedPlanets);
//        destroyedPlanets.forEach(planet -> System.out.println("-> " + planet));
//    }
//
//    private static String getDecryptedMessage(String encryptedMessage) {
//        //криптирано съобщение: STCDoghudd4=63333$D$0A53333
//        //брой на спец. букви: 3
//        //декриптирано съобщение:
//        //1. броя на [s, S, T, t, A, a, R, r] в криптираното съобщение
//        int countLetters = getSpecialLettersCount(encryptedMessage);
//        StringBuilder decryptedMessage = new StringBuilder();
//        //взимаме всяка буква от криптираното съобщение -> ascii
//        //ascii - countLetters -> ascii кода на нова буква
//        //нова буква -> добавяме към декриптираното съобщение
//        for (char symbol : encryptedMessage.toCharArray()) {
//            char newSymbol = (char)(symbol - countLetters);
//            decryptedMessage.append(newSymbol);
//        }
//        return decryptedMessage.toString();
//    }
//
//    private static int getSpecialLettersCount(String encryptedMessage) {
//        int counter = 0;
//        for (char symbol : encryptedMessage.toLowerCase().toCharArray()) {
//            if (symbol == 's' || symbol == 'a' || symbol == 't' || symbol == 'r') {
//                counter++;
//            }
//        }
//        return counter;
//    }
//}