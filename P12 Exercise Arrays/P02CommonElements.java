package P03ArraysExercise;

import java.util.Scanner;

public class P02CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] firstArray = scanner.nextLine().split(" ");
        String[] secondArray = scanner.nextLine().split(" ");
//        int maxLong = 0;
//        if (firstArray.length > secondArray.length) {
//            maxLong = firstArray.length;
//        } else maxLong = secondArray.length;
//        for (int i = 0; i < maxLong; i++) {
//            for (int j = 0; j < maxLong; j++)
//                if (secondArray[i].equals(firstArray[j])) {
//                    System.out.print(secondArray[i] + " ");
//                }
        for (String elementSecond:secondArray){
            for (String elementFirst:firstArray){
                if (elementSecond.equals(elementFirst)){
                    System.out.print(elementSecond+" ");
                }
            }
        }
    }
}
