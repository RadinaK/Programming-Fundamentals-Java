package P08MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class PP03LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materialMap = new TreeMap<>();
        Map<String, Integer> junkMap = new TreeMap<>();

        materialMap.put("shards", 0);
        materialMap.put("fragments", 0);
        materialMap.put("motes", 0);

        boolean isOver = false;

        while (!isOver) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length; i += 2) {
                int quantity = Integer.parseInt(input[i]);
                String material = input[i + 1].toLowerCase();

                if (material.equals("shards") || material.equals("fragments") || material.equals("motes")) {
                    int currentMaterialQuantity = materialMap.get(material);
                    materialMap.put(material, currentMaterialQuantity + quantity);


                    if (materialMap.get(material) >= 250) {
                        if (material.equals("shards")) {
                            System.out.println("Shadowmourne obtained!");
                        } else if (material.equals("fragments")) {
                            System.out.println("Valanyr obtained!");
                        } else {
                            System.out.println("Dragonwrath obtained!");
                        }
                        materialMap.put(material, materialMap.get(material) - 250);
                        isOver = true;
                        break;
                    }
                } else {
                    if (!junkMap.containsKey(material)) {
                        junkMap.put(material, quantity);
                    } else {
                        int currentJunkQuantity = junkMap.get(material);
                        junkMap.put(material, currentJunkQuantity + quantity);
                    }
                }
            }
        }
            materialMap.entrySet().stream().sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                    .forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));
            junkMap.entrySet().forEach(entry -> System.out.printf("%s: %d%n", entry.getKey(), entry.getValue()));

    }
}
