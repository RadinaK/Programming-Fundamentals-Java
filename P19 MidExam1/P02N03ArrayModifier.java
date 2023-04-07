package P06MidExam1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02N03ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> elementsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("end")) {
            String[] tokens = inputLine.split(" ");
            String command = tokens[0];
            switch (command) {
                case "swap":
                    int swapIndex1 = Integer.parseInt(tokens[1]);
                    int swapIndex2 = Integer.parseInt(tokens[2]);
                    int swapNum1 = elementsList.get(swapIndex1);

                    elementsList.set(swapIndex1, elementsList.get(swapIndex2));
                    elementsList.set(swapIndex2, swapNum1);
//                    bigIntegerList.set(swapIndex1, bigIntegerList.get(swapIndex2));
                    break;
                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(tokens[1]);
                    int multiplyIndex2 = Integer.parseInt(tokens[2]);
                    int newNum = (elementsList.get(multiplyIndex1)) * (elementsList.get(multiplyIndex2));
                    elementsList.set(multiplyIndex1, newNum);
                    break;
                case "decrease":
                    for (int i = 0; i < elementsList.size(); i++) {
                        int currentElement=elementsList.get(i);
                        currentElement=currentElement-1;
                        elementsList.set(i, currentElement);
                    }

                    break;
            }
            inputLine = scanner.nextLine();
        }
        elementsList.forEach(element -> {
//            if (elementsList.indexOf(element) == elementsList.size() -1 ) {
//                System.out.println(element);
//            } else {
//                System.out.print(element + ", ");
//            }

            if(elementsList.indexOf(element)==0){
                System.out.print(element);
            }else{
                System.out.print(", "+element);
            }
        });
    }
}
