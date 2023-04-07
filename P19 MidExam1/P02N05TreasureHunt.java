package P06MidExam1;

import java.util.*;
import java.util.stream.Collectors;

public class P02N05TreasureHunt {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> treasureChest = Arrays.stream(scanner.nextLine().split("\\|")).collect(Collectors.toList());
        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Yohoho!")) {
            String[] tokens = inputLine.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Loot":
                    for (int i = 1; i < tokens.length; i++) {
                        if (!treasureChest.contains(tokens[i])) {
                            treasureChest.add(0, tokens[i]);
                        }
                    }
                    break;

                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < treasureChest.size()) {
                        String removedItem = treasureChest.get(index);
                        treasureChest.remove(index);
                        treasureChest.add(treasureChest.size(), removedItem);
                    }
                    break;

                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    if (count > treasureChest.size()) {
                        treasureChest.forEach(item -> {
                            if (treasureChest.indexOf(item) == 0) {
                                System.out.print(item);
                            } else {
                                System.out.print(", " + item);
                            }
                        });
                        treasureChest.removeAll(treasureChest);
                    } else {
                        int countRemovedItems = 0;
                        List<String> removedItems=new ArrayList<>();
                        for (int i = treasureChest.size() - 1; i >= 0; i--) {
                            if (countRemovedItems == count) {
                                break;
                            }


//                            if (treasureChest.indexOf(treasureChest.get(i)) == treasureChest.size()-1) {
//                                System.out.print(treasureChest.get(i));
//                            } else {
//                                System.out.print(", " + treasureChest.get(i));
//                            }

                            removedItems.add(treasureChest.get(i));
                            treasureChest.remove(i);
                            countRemovedItems++;
                        }
                        Collections.reverse(removedItems);
                        removedItems.forEach(item -> {
                            if (removedItems.indexOf(item) == 0) {
                                System.out.print(item);
                            } else {
                                System.out.print(", " + item);
                            }
                        });
                    }
                    break;
            }

            inputLine = scanner.nextLine();
        }
        int sumOfLengths = 0;
        for (int i = 0; i < treasureChest.size(); i++) {
            String item = treasureChest.get(i);
            for (char countSymbol : item.toCharArray()) {
                sumOfLengths++;
            }
        }

        double averageTreasureGain = sumOfLengths * 1.0 / treasureChest.size();
        if (treasureChest.size() == 0) {
            System.out.println();
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.println();
            System.out.printf("Average treasure gain: %.2f pirate credits.", averageTreasureGain);
        }

    }
}
