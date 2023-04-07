package P03ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P05TopIntegers {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
////        int currentNum = input[0];
//
//        for (int index = 0; index <= input.length-1; index++) {
//            int currentNum = input[index];
//            if (currentNum == input.length-1) {
//                System.out.print(currentNum + " ");
//                break;
//            }
//            boolean isBigger=false;
//            for (int i = index + 1; i <= input.length-1; i++) {
//                int nextNum=input[i];
//                if (currentNum > nextNum) {
//                    isBigger=true;
//                } else
//                {
//                isBigger=false;
//                break;
//            }
//            }
//            if (isBigger){
//                System.out.print(currentNum+" ");
//            }
//        }
//
//    }
//}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        //"1 4 3 2".split(" ") -> ["1", "4", "3", "2"].map -> [1, 4, 3, 2]

        //за всеки един елемент от масива -> проверка дали е топ
        for (int index = 0; index <= numbers.length - 1; index++) {
            int currentNumber = numbers[index];
            //винаги елементът на последния индекс ни е топ
            if (index == numbers.length - 1) {
                System.out.print(currentNumber + " ");
                break;
            }
            //обхождам всички индекси след моя
            //следващото число -> index + 1
            boolean isTop = false; //
            for (int i = index + 1; i <= numbers.length - 1; i++) { //обходя всички числа след моето
                int nextNumber = numbers[i];
                if (currentNumber > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            //проверка дали моето число е топ
            if (isTop) {
                System.out.print(currentNumber + " ");
            }
        }
    }
}
