package P08MapsLambdaAndStreamAPILab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05Largest3Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbersList= Arrays
                .stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((num1, num2)->num2.compareTo(num1))
                .limit(3)
                .collect(Collectors.toList());


        for (int num:numbersList){
            System.out.print(num+" ");
        }


    }
}
