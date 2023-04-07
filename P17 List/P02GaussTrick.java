package P05ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList= Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());

        int size=intList.size();
        for (int i = 0; i < size/2; i++) {
            intList.set(i, intList.get(i)+intList.get(intList.size()-1));
            intList.remove(intList.size()-1);

        }

        for (int item:intList){
            System.out.print(item+" ");
        }
    }


}
