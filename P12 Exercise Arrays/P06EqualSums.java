package P03ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P06EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int index = 0;
        int leftSum = 0;
        int rightSum = 0;
        boolean isEqual = false;
        for (int i = 0; i < array.length; i++) {

            for (int r = i + 1; r < array.length; r++) {
                rightSum = rightSum + array[r];
            }
            for (int l = 0; l <i; l++) {
                leftSum = leftSum + array[l];
            }
if(rightSum==leftSum){
    isEqual=true;
    index=i;
}
            rightSum = 0;
            leftSum = 0;
        }
        if (isEqual){
            System.out.println(index);
        }else System.out.println("no");
    }
}
