package P05ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListOperations {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
////•	Add {number} - add number at the end
////•	Insert {number} {index} - insert number at given index
////•	Remove {index} - remove that index
////•	Shift left {count} - first number becomes last 'count' times
////•	Shift right {count} - last number becomes first 'count' times
//        List<Integer> listOperations= Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());
//        String input= scanner.nextLine();
//        while (!input.equals("End")){
//            String[] command= input.split("\\s+");
//
//            String typeCommand=command[0];
//            switch (typeCommand){
//                case "Add":
//                    int addNumber= Integer.parseInt(command[1]);
//                    listOperations.add(addNumber);
//                    break;
//                case "Insert":
//                    int insertNumber= Integer.parseInt(command[1]);
//                    int insertIndex= Integer.parseInt(command[2]);
//                    if(isValidIndex(insertIndex,listOperations.size())){
//                        listOperations.add(insertIndex, insertNumber);
//                    }
//                    else System.out.println("Invalid index");
//                    break;
//                case "Remove":
//                    int removeIndex= Integer.parseInt(command[1]);
//                    if(isValidIndex(removeIndex,listOperations.size()-1)){
//
//                        listOperations.remove(removeIndex);
//                    }
//                    else System.out.println("Invalid index");
//                    break;
//                case "Shift":
//                    int count= Integer.parseInt(command[2]);
//                    String position=command[1];
//                    if(position.equals("left")){
//                        for (int i = 0; i < count; i++) {
//                            listOperations.add(listOperations.size(), listOperations.get(0));
//                            listOperations.remove(listOperations.get(0));
//
//                        }
//                    }
//                    else if(position.equals("right")){
//                        for (int i = 0; i < count; i++) {
//
//                            listOperations.add(listOperations.indexOf(listOperations.get(0)), listOperations.get(listOperations.size()-1) );
//                            listOperations.remove(listOperations.size()-1);
//                        }
//                    }
//                    break;
//            }
//            input=scanner.nextLine();
//
//        }
//        for (int num:listOperations){
//            System.out.print(num +" ");
//        }
//    }
//    public static boolean isValidIndex(int index, int size) {
//        //true -> е валиден
//        //false -> е невалиден
//        return index >= 0 && index <= size - 1;
//    }
//}




//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Scanner;
//import java.util.stream.Collectors;
//
//public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"32 54 21 12 4 0 23" -> split(" ") -> ["32", "54", "21", "12", "4", "0", "23"]
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String command = scanner.nextLine();
        while(!command.equals("End")){
            //•	"Add {number}" - add number at the end
            //•	"Insert {number} {index}" - insert number at given index
            //•	Remove {index} - remove that index
            //•	Shift left {count} - first number becomes last 'count' times
            //•	Shift right {count} - last number becomes first 'count' times
            String[] commandData = command.split("\\s+");
            String commandName = commandData[0];
            switch(commandName) {
                case "Add":
                    int numberToAdd = Integer.parseInt(commandData[1]);
                    numbers.add(numberToAdd);
                    break;
                case "Insert":
                    int numberToInsert = Integer.parseInt(commandData[1]);
                    int insertIndex = Integer.parseInt(commandData[2]);
                    if(isValidIndex(insertIndex, numbers.size())) {
                        numbers.add(insertIndex, numberToInsert);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Remove":
                    int removedIndex = Integer.parseInt(commandData[1]);
                    if(isValidIndex(removedIndex, numbers.size())){
                        numbers.remove(removedIndex);
                    } else {
                        System.out.println("Invalid index");
                    }
                    break;
                case "Shift":
                    String shiftType = commandData[1]; //left or right
                    int count = Integer.parseInt(commandData[2]);
                    if (shiftType.equals("left")) {
                        shiftLeft(numbers, count);
                    } else if (shiftType.equals("right")) {
                        shiftRight(numbers, count);
                    }
                    break;
            }


            command = scanner.nextLine();
        }

        for (int number : numbers) {
            System.out.print(number + " ");
        }

    }

    private static void shiftRight(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            //взимаме последния елемент -> слагам го на първо място (индекс = 0) -> премахвам от последното място
            int lastElement = numbers.get(numbers.size() - 1);
            numbers.add(0, lastElement);
            numbers.remove(numbers.size() - 1);
        }
    }

    private static void shiftLeft(List<Integer> numbers, int count) {
        for (int i = 0; i < count; i++) {
            //взимам първия елемент -> слагам накрая -> премахвам от първото място
            int firstNumber = numbers.get(0);
            numbers.add(firstNumber);
            numbers.remove(0);
        }

    }

    public static boolean isValidIndex(int index, int size) {
        //true -> е валиден
        //false -> е невалиден
        return index >= 0 && index <= size - 1;
    }
}
