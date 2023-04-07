package P03ArraysLab;

import java.util.Scanner;

public class P02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] num=new int[n];
        for (int i = 0; i < n; i++) {
            int number=Integer.parseInt(scanner.nextLine());
            num[i]=number;
        }
        for (int i = num.length-1; i >=0 ; i--) {
            System.out.printf("%d ",num[i]);
        }
    }
}
