package P13FinalExam2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P03N04HeroesOfCodeAndLogicVII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> hitPointsMap = new LinkedHashMap<>();
        Map<String, Integer> manaPointsMap = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] heroesParameters = scanner.nextLine().split(" ");
            String hero = heroesParameters[0];

            int hitPoints = Integer.parseInt(heroesParameters[1]);
            int manaPoints = Integer.parseInt(heroesParameters[2]);

            if (hitPoints > 100) {
                hitPointsMap.put(hero, 100);
            } else {
                hitPointsMap.put(hero, hitPoints);
            }

            if (manaPoints>200){
                manaPointsMap.put(hero, 200);
            }else {
                manaPointsMap.put(hero, manaPoints);
            }
        }

        String inputLine= scanner.nextLine();
        while (!inputLine.equals("End")){
            String[]tokens=inputLine.split(" - ");
            String command=tokens[0];
            String heroName=tokens[1];
            switch (command){
                case "CastSpell":
                    int neededMP=Integer.parseInt(tokens[2]);
                    String spellName=tokens[3];
                    if (neededMP<=manaPointsMap.get(heroName)){
                        manaPointsMap.put(heroName, manaPointsMap.get(heroName)-neededMP);
                        System.out.printf("%s has successfully cast %s and now has %d MP!%n", heroName, spellName, manaPointsMap.get(heroName));
                    }else {
                        System.out.printf("%s does not have enough MP to cast %s!%n", heroName, spellName);
                    }
                    break;

                case "TakeDamage":
                    int damage=Integer.parseInt(tokens[2]);
                    String attacker=tokens[3];
                    if (hitPointsMap.get(heroName)<=damage){
                        System.out.printf("%s has been killed by %s!%n", heroName, attacker);
                        hitPointsMap.remove(heroName);
                    }else {
                        hitPointsMap.put(heroName, hitPointsMap.get(heroName)-damage);
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", heroName, damage, attacker, hitPointsMap.get(heroName));
                    }
                    break;

                case "Recharge":
                    int rechargeAmount=Integer.parseInt(tokens[2]);
                    if ((manaPointsMap.get(heroName)+rechargeAmount)>200){
                        int neededMana=200-manaPointsMap.get(heroName);
                        manaPointsMap.put(heroName, 200);
                        System.out.printf("%s recharged for %d MP!%n", heroName, neededMana);
                    }else {
                        manaPointsMap.put(heroName, manaPointsMap.get(heroName)+rechargeAmount);
                        System.out.printf("%s recharged for %d MP!%n",heroName ,rechargeAmount);
                    }
                    break;

                case "Heal":
                    int healAmount=Integer.parseInt(tokens[2]);
                    if ((hitPointsMap.get(heroName)+healAmount)>100){
                        int neededHit=100-hitPointsMap.get(heroName);
                        hitPointsMap.put(heroName, 100);
                        System.out.printf("%s healed for %d HP!%n", heroName, neededHit);
                    }else {
                        hitPointsMap.put(heroName, hitPointsMap.get(heroName)+healAmount);
                        System.out.printf("%s healed for %d HP!%n",heroName ,healAmount);
                    }
                    break;
            }

            inputLine= scanner.nextLine();
        }
        hitPointsMap.entrySet().stream()
                .sorted((h1, h2)-> h2.getValue().compareTo(h1.getValue()))
                .forEach(entry-> System.out.printf("%s%n  HP: %d%n  MP: %d%n", entry.getKey(),entry.getValue(),manaPointsMap.get(entry.getKey())));
    }
}
