package P13FinalExam2;

import java.util.*;

public class P03N02PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> rarityPlantMap = new LinkedHashMap<>();
        Map<String, Double> ratingPlantMap = new LinkedHashMap<>();

        for (int i = 1; i <= n; i++) {
            String[] tokenPlants = scanner.nextLine().split("<->");
            String plant = tokenPlants[0];
            int rarity = Integer.parseInt(tokenPlants[1]);

            if (rarityPlantMap.containsKey(plant)) {
                rarityPlantMap.replace(plant, rarityPlantMap.get(plant), rarity);
            } else {
                rarityPlantMap.put(plant, rarity);
                ratingPlantMap.put(plant, 0.0);
            }
        }


        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Exhibition")) {
            String[] tokens = inputLine.split("[: -]+");
            String command = tokens[0];
            String plant = tokens[1];

            switch (command) {
                case "Rate":
                    double rating = Double.parseDouble(tokens[2]);
                    if (ratingPlantMap.containsKey(plant)) {
                        if (ratingPlantMap.get(plant) == 0) {
                            ratingPlantMap.put(plant, rating);
                        } else {
                            double newRarity = (ratingPlantMap.get(plant) + rating) / 2;
                            ratingPlantMap.put(plant, newRarity);
                        }
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Update":
                    int newRarity = Integer.parseInt(tokens[2]);
                    if (rarityPlantMap.containsKey(plant)) {
                        rarityPlantMap.replace(plant, rarityPlantMap.get(plant), newRarity);
                    } else {
                        System.out.println("error");
                    }
                    break;

                case "Reset":
                    if (ratingPlantMap.containsKey(plant)) {
                        ratingPlantMap.replace(plant, ratingPlantMap.get(plant), 0.0);
                    } else {
                        System.out.println("error");
                    }
                    break;
            }


            inputLine = scanner.nextLine();
        }

        System.out.println("Plants for the exhibition:");

        rarityPlantMap.entrySet().stream().sorted((p1, p2) -> {
                    int result = p2.getValue() - p1.getValue();
                    if (result == 0) {
                        double rate = ratingPlantMap.get(p2.getValue()) - ratingPlantMap.get(p1.getValue());
                        return (int) rate;
                    } else return result;
                })
                .forEach(e -> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n", e.getKey(), e.getValue(), ratingPlantMap.get(e.getKey())));
    }
}
