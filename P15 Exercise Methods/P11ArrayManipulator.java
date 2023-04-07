package P04MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P11ArrayManipulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] commands = input.split(" ");
            String typeCommand = commands[0];

            switch (typeCommand) {
                case "exchange":
                    int exchangeIndex = Integer.parseInt(commands[1]);
                    if (isValidIndex(exchangeIndex, numbers.length)) {
                        numbers = exchange(numbers, exchangeIndex);
                    } else System.out.println("Invalid index");
                    break;
                case "max":
                    String evenOrOdd = commands[1];
                    if (evenOrOdd.equals("even")) {
                        printMaxEvenIndex(numbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printMaxOddIndex(numbers);
                    }
                    break;
                case "min":
                    evenOrOdd = commands[1];
                    if (evenOrOdd.equals("even")) {
                        printMinEvenIndex(numbers);
                    } else if (evenOrOdd.equals("odd")) {
                        printMinOddIndex(numbers);
                    }
                    break;
                case "first":
                    evenOrOdd = commands[2];
                    int count = Integer.parseInt(commands[1]);
                    if (evenOrOdd.equals("even")) {
                        printFirstEvenNums(numbers, count);
                    } else if (evenOrOdd.equals("odd")) {
                        printFirstOddNums(numbers, count);
                    }
                    break;
                case "last":
                    evenOrOdd = commands[2];
                    count = Integer.parseInt(commands[1]);
                    if (evenOrOdd.equals("even")) {
                        printLastEvenNums(numbers, count);
                    } else if (evenOrOdd.equals("odd")) {
                        printLastOddNums(numbers, count);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        System.out.print("[");
        for (int index = 0; index < numbers.length; index++) {
            if (index == numbers.length - 1) {
                System.out.print(numbers[index]);
            } else {
                System.out.print(numbers[index] + ", ");
            }
        }
        System.out.print("]");
    }

    private static void printLastOddNums(int[] numbers, int count) {
        String lastOddNums = "";
        int lastCount = count;
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            for (int index = numbers.length - 1; index >= 0; index--) {
                if (numbers[index] % 2 == 1) {
                    lastOddNums += numbers[index];
                    count--;
                    if (count == 0) {
                        break;
                    }
//                    if (!(count ==1)){
//                        System.out.print(firstOddNums.charAt(index)+", ");
//                    }else {
//
//                        System.out.print(firstOddNums.charAt(index));
//                    }
                }}
                for (int index = numbers.length-1; index >=0; index++) {
lastOddNums ="[";

                    if (index == 0) {
                        System.out.print(lastOddNums.charAt(index));
                    } else {

                        System.out.print(lastOddNums.charAt(index) + ", ");
                    }

//            if (count == lastCount) {
//                lastOddNums = "[]";
//            }
            lastOddNums = "]";
            System.out.println(lastOddNums);
        }
    }}



    private static void printLastEvenNums(int[] numbers, int count) {
        String lastEvenNums = "";
        int lastCount = count;
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            lastEvenNums = "[";
            for (int index = numbers.length - 1; index >= 0; index--) {
                if (numbers[index] % 2 == 0) {
                    lastEvenNums += numbers[index];
                    count--;
                    if (count == 0) {
                        break;
                    }
//                    if (!(count ==1)){
//                        System.out.print(firstOddNums.charAt(index)+", ");
//                    }else {
//
//                        System.out.print(firstOddNums.charAt(index));
//                    }
                    if (index == 0) {
                        System.out.print(lastEvenNums.charAt(index));
                    } else {

                        System.out.print(lastEvenNums.charAt(index) + ", ");
                    }
                }

            }
            if (count == lastCount) {
                lastEvenNums = "[]";
            }
            lastEvenNums = "]";
            System.out.println(lastEvenNums);
        }

    }

    private static void printFirstOddNums(int[] numbers, int count) {
        String firstOddNums = "";
        int firstCount = count;
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            firstOddNums = "[";
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] % 2 == 1) {
                    firstOddNums += numbers[index];
                    count--;
                    if (count == 0) {
                        break;
                    }
//                    if (!(count ==1)){
//                        System.out.print(firstOddNums.charAt(index)+", ");
//                    }else {
//
//                        System.out.print(firstOddNums.charAt(index));
//                    }
                    if (index == 0) {
                        System.out.print(firstOddNums.charAt(index));
                    } else {

                        System.out.print(firstOddNums.charAt(index) + ", ");
                    }
                }

            }
            if (count == firstCount) {
                firstOddNums = "[]";
            }
            firstOddNums = "]";
            System.out.println(firstOddNums);
        }
    }

    private static void printFirstEvenNums(int[] numbers, int count) {
        String firstEvenNums = "";
        int firstCount = count;
        if (count > numbers.length) {
            System.out.println("Invalid count");
        } else {
            firstEvenNums = "[";
            for (int index = 0; index < numbers.length; index++) {
                if (numbers[index] % 2 == 0) {
                    firstEvenNums += numbers[index];
                    count--;
                    if (count == 0) {
                        break;
                    }
//                    if (!(count ==1)){
//                        System.out.print(firstOddNums.charAt(index)+", ");
//                    }else {
//
//                        System.out.print(firstOddNums.charAt(index));
//                    }
                    if (index == 0) {
                        System.out.print(firstEvenNums.charAt(index));
                    } else {

                        System.out.print(firstEvenNums.charAt(index) + ", ");
                    }
                }

            }
            if (count == firstCount) {
                firstEvenNums = "[]";
            }
            firstEvenNums = "]";
            System.out.println(firstEvenNums);
        }

    }

    private static void printMinOddIndex(int[] numbers) {
        int minOddIndex = -1;
        int minOdd = Integer.MAX_VALUE;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 1 && numbers[index] <= minOdd) {
                minOdd = numbers[index];
                minOddIndex = index;
            }
        }
        if (minOddIndex == -1) {
            System.out.println("No matches");
        } else System.out.println(minOddIndex);
    }

    private static void printMinEvenIndex(int[] numbers) {
        int minEvenIndex = -1;
        int minEven = Integer.MAX_VALUE;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0 && numbers[index] <= minEven) {
                minEven = numbers[index];
                minEvenIndex = index;
            }
        }
        if (minEvenIndex == -1) {
            System.out.println("No matches");
        } else System.out.println(minEvenIndex);
    }

    private static void printMaxOddIndex(int[] numbers) {
        int maxOdd = Integer.MIN_VALUE;
        int maxOddIndex = -1;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 1 && numbers[index] >= maxOdd) {
                maxOdd = numbers[index];
                maxOddIndex = index;
            }
        }
        if (maxOddIndex == -1) {
            System.out.println("No matches");
        } else System.out.println(maxOddIndex);
    }

    private static void printMaxEvenIndex(int[] numbers) {
        int maxEven = Integer.MIN_VALUE;
        int maxEvenIndex = -1;
        for (int index = 0; index < numbers.length; index++) {
            if (numbers[index] % 2 == 0 && numbers[index] >= maxEven) {
                maxEven = numbers[index];
                maxEvenIndex = index;
            }
        }
        if (maxEvenIndex == -1) {
            System.out.println("No matches");
        } else System.out.println(maxEvenIndex);
    }

    private static int[] exchange(int[] numbers, int exchangeIndex) {
        int numbersToExchangeIndex[] = new int[exchangeIndex + 1];
        int[] numbersAfterExchangedIndex = new int[numbers.length - exchangeIndex - 1];

        for (int index = 0; index < exchangeIndex + 1; index++) {
            numbersToExchangeIndex[index] = numbers[index];
        }

        for (int index = exchangeIndex + 1; index < numbers.length; index++) {
            numbersAfterExchangedIndex[index - exchangeIndex - 1] = numbers[index];
        }

        int exchangedArray[] = new int[numbers.length];
        for (int index = 0; index < numbersAfterExchangedIndex.length; index++) {
            exchangedArray[index] = numbersAfterExchangedIndex[index];
        }

        for (int index = numbersAfterExchangedIndex.length; index < exchangedArray.length; index++) {
            exchangedArray[index] = numbersToExchangeIndex[index - numbersAfterExchangedIndex.length];
        }
        return exchangedArray;
    }

    private static boolean isValidIndex(int exchangeIndex, int numbers) {
        if (exchangeIndex <= numbers) {
            return true;
        } else return false;
    }
}
