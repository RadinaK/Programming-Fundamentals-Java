package P03ArraysLab;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class P03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine=scanner.nextLine();
        int evenSum=0;
        int[] numArr= Arrays.stream(inputLine.split(" ")).mapToInt(Integer::parseInt).toArray();
            for (int j = 0; j < numArr.length; j++) {
                if (numArr[j]%2==0){
                    evenSum+=numArr[j];
                }
            }
        System.out.println(evenSum);
    }
}
