package P06RetakeMidExam;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03PaintingSNumbersInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> paintingNumbersList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
//        List<String> paintingNumbersList = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("END")) {
            String[] tokens = inputLine.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Change":
                    int changePaintingNum = Integer.parseInt(tokens[1]);
                    int newNum = Integer.parseInt(tokens[2]);
                    if (paintingNumbersList.contains(changePaintingNum)) {
                        paintingNumbersList.set(paintingNumbersList.indexOf(changePaintingNum), newNum);
                    }
//                    for (int i = 0; i < paintingNumbersList.size(); i++) {
//                        if (paintingNumbersList.contains(changePaintingNum)) {
//                            paintingNumbersList.set(paintingNumbersList.indexOf(changePaintingNum), newNum);
//                        }
//                    }
                    break;

                case "Hide":
                    int hidePaintingNum = Integer.parseInt(tokens[1]);
                    if (paintingNumbersList.contains(hidePaintingNum)) {
                        paintingNumbersList.remove(paintingNumbersList.indexOf(hidePaintingNum));
                    }
                    break;

                case "Switch":
                    int switchPaintingNum1 = Integer.parseInt(tokens[1]);
                    int switchPaintingNum2 = Integer.parseInt(tokens[2]);
                    if (paintingNumbersList.contains(switchPaintingNum1) && paintingNumbersList.contains(switchPaintingNum2)) {
                        int firstSavedPN1 = paintingNumbersList.get(paintingNumbersList.indexOf(switchPaintingNum1));
                        paintingNumbersList.set(paintingNumbersList.indexOf(switchPaintingNum1), switchPaintingNum2);
                        paintingNumbersList.set(paintingNumbersList.indexOf(switchPaintingNum2), firstSavedPN1);
                    }
                    break;

                case "Insert":
                    int insertIndex = Integer.parseInt(tokens[1]);
                    String insertPaintingNum = tokens[2];
                    if (insertIndex >= 0 && insertIndex + 1 < paintingNumbersList.size()) {
                        paintingNumbersList.add(insertIndex + 1, Integer.parseInt(insertPaintingNum));
                    }
                    break;

                case "Reverse":
                    Collections.reverse(paintingNumbersList);
                    break;
            }


            inputLine = scanner.nextLine();
        }
//        for (int i = 0; i < paintingNumbersList.size(); i++) {
//            System.out.print(paintingNumbersList.get(i) + " ");
//        }
        paintingNumbersList.forEach(e->{
            if(paintingNumbersList.indexOf(e)== paintingNumbersList.size()-1){
                System.out.print(e);
            }else {
                System.out.print(e +" ");
            }
        });
    }
}
