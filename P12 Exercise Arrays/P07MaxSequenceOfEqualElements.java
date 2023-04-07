package P03ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P07MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 1;
        int index = 0;
        int firstIndex = 0;
        int maxCount = 0;
        for (int i = 1; i < array.length ; i++) {
            if (array[i] == array[i - 1]) {
                count++;

            } else {
                count=1;
                index = i;
            }
            if (count > maxCount) {
                maxCount = count;
                firstIndex = index;
            }
        }
        for (int i = firstIndex; i < firstIndex+maxCount; i++) {
            System.out.print(array[i]+" ");
        }
    }
}


//        int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt( Integer::parseInt).toArray();
//        int maxLength = 0;
//        int length = 1;
//
//        int startIndex = 0;
//        int bestStart = 0;
//
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] == array[i - 1]) {
//                length++;
//            } else {
//                length = 1;
//                startIndex = i;
//            }
//
//            if(length > maxLength) {
//                maxLength = length;
//                bestStart = startIndex;
//            }
//        }
//
//        for (int i = bestStart; i < bestStart + maxLength; i++) {
//            System.out.print(array[i] + " ");
//        }
//
//    }
//}
