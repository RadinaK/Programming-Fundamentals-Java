package P06RetakeMidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03PaintingSNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        List<Integer> paintingNumbersList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<String> paintingNumbersList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("END")) {
            String[] tokens = inputLine.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Change":
                    String changePaintingNum = tokens[1];
                    String newNum = tokens[2];
                    for (int i = 0; i < paintingNumbersList.size(); i++) {
                        if (paintingNumbersList.get(i).contains(changePaintingNum)) {
                            paintingNumbersList.set(paintingNumbersList.indexOf(changePaintingNum), newNum);
                        }
                    }

                    break;

                case "Hide":
                    String hidePaintingNum = tokens[1];
                    for (int i = 0; i < paintingNumbersList.size(); i++) {

                        if (paintingNumbersList.get(i).contains(hidePaintingNum)) {
                            paintingNumbersList.remove(hidePaintingNum);
                        }
                    }
                    break;

                case "Switch":
                    String switchPaintingNum1 = tokens[1];
                    String switchPaintingNum2 = tokens[2];
//                    if (paintingNumbersList.contains(switchPaintingNum1) && paintingNumbersList.contains(switchPaintingNum2)) {
//                        String firstSavedPN1 = paintingNumbersList.get(paintingNumbersList.indexOf(switchPaintingNum1));
//                        paintingNumbersList.set(paintingNumbersList.indexOf(switchPaintingNum1), switchPaintingNum2);
//                        paintingNumbersList.set(paintingNumbersList.indexOf(switchPaintingNum2), firstSavedPN1);
//                    }


                    if (paintingNumbersList.contains(switchPaintingNum1) && paintingNumbersList.contains(switchPaintingNum2)) {
                        String firstSavedPN1 = paintingNumbersList.get(paintingNumbersList.indexOf(switchPaintingNum1));
                        String secondSavedPN2 = paintingNumbersList.get(paintingNumbersList.indexOf(switchPaintingNum2));
                        for (int i = 0; i < paintingNumbersList.size(); i++) {
                            if (paintingNumbersList.get(i).contains(firstSavedPN1)) {

//                                String firstSavedPN1 = paintingNumbersList.get(paintingNumbersList.indexOf(switchPaintingNum1));
                                paintingNumbersList.set(paintingNumbersList.indexOf(firstSavedPN1), secondSavedPN2);
                            }
                            if (paintingNumbersList.get(i).contains(secondSavedPN2)) {

//                                String firstSavedPN1 = paintingNumbersList.get(paintingNumbersList.indexOf(switchPaintingNum1));

                                paintingNumbersList.set(paintingNumbersList.indexOf(secondSavedPN2), firstSavedPN1);
                            }

                             firstSavedPN1 = firstSavedPN1;
                             secondSavedPN2 = secondSavedPN2;
                        }
                    }

                    break;

                case "Insert":
                    int insertIndex = Integer.parseInt(tokens[1]);
                    String insertPaintingNum = tokens[2];
                    if (insertIndex >= -1 && insertIndex + 1 <= paintingNumbersList.size()) {
                        paintingNumbersList.add(insertIndex+1, insertPaintingNum);
                    }
                    break;

                case "Reverse":
                    Collections.reverse(paintingNumbersList);
                    break;
            }


            inputLine = scanner.nextLine();
        }
        for (int i = 0; i < paintingNumbersList.size(); i++) {
            System.out.print(paintingNumbersList.get(i) + " ");
        }
    }
}
