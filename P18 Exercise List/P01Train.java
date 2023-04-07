package P05ListsExercise;

import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        32 54 21 12 4 0 23
//        75
//        Add 10
//        Add 0
//        30
//        10
//        75
//        end
        List<Integer> wagon= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int capacity=Integer.parseInt(scanner.nextLine());
        String input= scanner.nextLine();
        while (!input.equals("end")){
            String[]command=input.split(" ");
            if (command.length==2){
                int newPassengers=Integer.parseInt(command[1]);
                wagon.add(newPassengers);
            }
            else {
                int newPassengers=Integer.parseInt(command[0]);
                for (int i = 0; i < wagon.size(); i++) {
                    if (wagon.get(i)+newPassengers<=capacity){
                        wagon.set(i, wagon.get(i)+newPassengers);
                        break;
                    }
                }
            }
            input= scanner.nextLine();
        }
        for (int passengers:wagon){
            System.out.print(passengers+" ");
        }

    }
}
