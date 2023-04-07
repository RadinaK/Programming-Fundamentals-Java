package P05ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Add {number}: add a number to the end of the list
//        Remove {number}: remove a number from the list
//        RemoveAt {index}: remove a number at a given index
//        Insert {number} {index}: insert a number at a given index
        List<Integer> firstList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input=scanner.nextLine();
        
        while (!input.equals("end")){
            
            String[] command=input.split(" ");
            String typeCommand=command[0];
            int num=Integer.parseInt(command[1]);
            
            switch (typeCommand){
                case "Add":
                    add(firstList,num);
                    break;
                case "Remove":
                    remove(firstList, num);
                    break;

                case "RemoveAt":
                    removeAt(firstList, num);
                    break;

                case "Insert":
                    int index=Integer.parseInt(command[2]);
                    insert(firstList, num, index);
                    break;
            }
            input=scanner.nextLine();
        }
        for (int elements:firstList){
            System.out.print(elements+" ");
        }

    }

    private static void insert(List<Integer> firstList, int num, int index) {
        firstList.add(index, num);
    }

    private static void removeAt(List<Integer> firstList, int num) {
        firstList.remove(num);
    }

    private static void remove(List<Integer> firstList, int num) {
        firstList.remove(Integer.valueOf(num));
    }

    private static void add(List<Integer> firstList, int num) {
        firstList.add(num);
    }
}
