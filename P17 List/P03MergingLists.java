package P05ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        3    5   2    43   12   3    54 10 23
//          76   5   34    2    4   12
//        3 76 5 5 2 34 43 2 12 4 3 12 54 10 23
        List<Integer> firstList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> secondList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> newList = new ArrayList<>();
        int minSize =Math.min(firstList.size() , secondList.size()) ;

        for (int i = 0; i < minSize; i++) {
            int firstItem = firstList.get(i);
            int secondItem = secondList.get(i);

            newList.add(firstItem);
            newList.add(secondItem);

        }
        if (firstList.size()>secondList.size()){
            newList.addAll(firstList.subList(secondList.size(), firstList.size()));
        }else newList.addAll(secondList.subList(firstList.size(),  secondList.size()));


        for (int item:newList){
            System.out.print(item+" ");
        }
    }
}
