package P04MethodsLab;

import java.util.Arrays;
import java.util.Scanner;

public class P10MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Math.abs(Integer.parseInt(scanner.nextLine()));
        int multiply=evenSum(num)*oddSum(num);
        System.out.println(multiply);
    }
    public static int evenSum(int num){
        String intToString=Integer.toString(num);
        int[]arr= Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int evenSum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2==0){
                evenSum+=arr[i];
            }
        }
        return evenSum;
    }
    public static int oddSum(int num){
        String intToString=Integer.toString(num);
        int[]arr= Arrays.stream(intToString.split("")).mapToInt(Integer::parseInt).toArray();
        int oddSum=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                oddSum+=arr[i];
            }
        }
        return oddSum;
    }
}
