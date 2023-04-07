package P06MidExam1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class P03MemoryGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> sequenceOfElements = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());

        String inputLine = scanner.nextLine();


        int countMoves = 0;


        // if(el1 == el2)  -> remove them

        //if(fIn == sIn) ||
        //[if(fIn || sIn)>=sequenceOfElements.size()  ||  (fIn || sIn)<sequenceOfElements.get(0)]
        // -> add two matching elements at the middle of the sequence
        // in the following format: -{number of moves until now}a

        //match

        while (!inputLine.equals("end")) {
            String[] pairs = inputLine.split(" ");
            int firstIndex = Integer.parseInt(pairs[0]);
            int secondIndex = Integer.parseInt(pairs[1]);

//        for (int i = 0; i < sequenceOfElements.size(); i++) {


            countMoves++;


            if (isValidIndex(firstIndex, sequenceOfElements) && isValidIndex(secondIndex, sequenceOfElements)) {
                String firstElement = sequenceOfElements.get(firstIndex);
                String secondElement = sequenceOfElements.get(secondIndex);

                if (firstElement.equals(secondElement)) {
                    if (firstIndex -1 == secondIndex) {
                        sequenceOfElements.remove(firstIndex);
                        sequenceOfElements.remove(secondIndex);
                        System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
                    } else {
                        sequenceOfElements.remove(firstIndex);
                        sequenceOfElements.remove(secondIndex - 1);
                        System.out.printf("Congrats! You have found matching elements - %s!%n", firstElement);
                    }
                }
                    if (!firstElement.equals(secondElement)) {
                        System.out.println("Try again!");
                    }
                    if (sequenceOfElements.size() == 0) {
                        System.out.printf("You have won in %d turns!%n", countMoves);
                        break;
                    }


                } else if (firstIndex == secondIndex || !isValidIndex(firstIndex, sequenceOfElements) || !isValidIndex(secondIndex, sequenceOfElements)) {
                    String newElement1 = "-" + countMoves + "a";
                    sequenceOfElements.add(sequenceOfElements.size() / 2, newElement1);
                    sequenceOfElements.add(sequenceOfElements.size() / 2, newElement1);
                    System.out.println("Invalid input! Adding additional elements to the board");
                }
//            }
                inputLine = scanner.nextLine();

            }
            if (sequenceOfElements.size() > 0) {
                System.out.println("Sorry you lose :(");
            }

            sequenceOfElements.forEach(e -> System.out.print(e + " "));
        }


    private static boolean isValidIndex(int index, List<String> sequenceOfElements) {
        boolean isValid = false;
        if (index >= 0 && index < sequenceOfElements.size()) {
            isValid = true;
        }

        return isValid;
    }
}
