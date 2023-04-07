package P05ListsLab;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P07RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        10 -5 7 9 -33 50   ->  	50 9 7 10
//        -1 -2 -3	         ->     empty
        List<Integer> intList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        intList.removeIf(n->n<0);

        if (intList.isEmpty()){
            System.out.println("empty");
        }
        else {
            Collections.reverse(intList);
            for (int num:intList){
                System.out.print(num+" ");
            }
        }
    }
}
