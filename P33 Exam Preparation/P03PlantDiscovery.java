package P11FinalExamPreparationLab;

import java.util.*;

public class P03PlantDiscovery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int plantNum = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> plantRarityMap = new LinkedHashMap<>();
        Map<String, Double> ratingMap = new HashMap<>();

        for (int i = 1; i <= plantNum; i++) {
            String[] information = scanner.nextLine().split("<->");
            String plant = information[0];
            int rarity = Integer.parseInt(information[1]);

            plantRarityMap.putIfAbsent(plant, 0);
            ratingMap.put(plant, 0.0);

            plantRarityMap.put(plant, rarity);

        }

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Exhibition")) {
            String[] inputLineData = inputLine.split("[: -]+");
            String command = inputLineData[0];
            String plantName = inputLineData[1];

            if (!ratingMap.containsKey(plantName)) {
                System.out.println("error");
            } else {

                switch (command) {
                    case "Rate":
                        double newRating = Double.parseDouble(inputLineData[2]);

                        if (ratingMap.get(plantName) == 0.0) {
                            ratingMap.put(plantName, newRating);
                        } else {
                            double currentRating = ratingMap.get(plantName);
                            ratingMap.put(plantName, (currentRating + newRating) / 2);
                        }
                        break;

                    case "Update":
                        int newRarity = Integer.parseInt(inputLineData[2]);
                        plantRarityMap.put(plantName, newRarity);

                        break;

                    case "Reset":
                        ratingMap.put(plantName, 0.0);

                        break;

                    default:
                        System.out.println("error");
                        break;
                }
            }

            inputLine = scanner.nextLine();
        }
        System.out.println("Plants for the exhibition:");
        plantRarityMap.entrySet().stream()
                .sorted((p1, p2)-> {
                    int result = p2.getValue() - p1.getValue();
                    if (result == 0) {
                        double rate = ratingMap.get(p2.getKey()) - ratingMap.get(p1.getKey());
                        return (int) rate;
                    }
                    return result;
                })
                .forEach(entry-> System.out.printf("- %s; Rarity: %d; Rating: %.2f%n",
                        entry.getKey(), entry.getValue(), ratingMap.get(entry.getKey())));

    }
}
