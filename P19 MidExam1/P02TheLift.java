package P06MidExam1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // wagon -> max 4 people
        //if wagon=4 -> next wagon with space available
        int people = Integer.parseInt(scanner.nextLine());
        List<Integer> wagons = Arrays.stream(scanner.nextLine()
                        .split(" ")).map(Integer::parseInt)
                .collect(Collectors.toList());
//        String[] wagonsSpace=scanner.nextLine().split(" ");
//        List<Integer>wagons=new ArrayList<>();
        int capacity = 4;

        for (int i = 0; i < wagons.size(); i++) {
            if(people==0){
                break;
            }
            int currentWagonSpace = wagons.get(i);
            int peopleToAdd = capacity - currentWagonSpace;
            if (people < peopleToAdd) {
                peopleToAdd = people;
                people = 0;
                wagons.set(i, peopleToAdd + currentWagonSpace);
            } else {
                people -= peopleToAdd;
                wagons.set(i, currentWagonSpace + peopleToAdd);
            }
//            if (people == 0 && wagons.get(i) == 4) {
//            }else
                if (people == 0 && wagons.get(wagons.size()-1) < 4){
                System.out.println("The lift has empty spots!");
            }

        }
        if (people > 0) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", people);
        }
        wagons.forEach(entry -> System.out.print(entry + " "));

    }
}


