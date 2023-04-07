package P05ListsExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        1 2 3 4 5 5 5 6
//        Delete 5
//        Insert 10 1
//        Delete 5
//        end
        List<Integer> intList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input= scanner.nextLine();
        while (!input.equals("end")) {
            String[] command = input.split(" ");
            String typeCommand=command[0];
            switch (typeCommand){
                case "Delete":
                    int element=Integer.parseInt(command[1]);
                    intList.removeAll(Arrays.asList(element));
                    break;
                case "Insert":
                    element=Integer.parseInt(command[1]);
                    int index=Integer.parseInt(command[2]);
                    intList.add(index, element);
                    break;
            }
            input= scanner.nextLine();
        }
        for (int element:intList){
            System.out.print(element+" ");
        }

    }
}
