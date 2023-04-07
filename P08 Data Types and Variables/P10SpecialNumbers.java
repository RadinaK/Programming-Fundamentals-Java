package P02DataTypesAndVariablesLab;

import java.util.Scanner;

public class P10SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num; i++) {
            int sum=0;
            int number=i;
            while (number>0){
                sum=sum+(number%10);
                number=number/10;
            }
            boolean isTrue=sum==5||sum==7||sum==11;
            if (isTrue){
                System.out.printf("%d -> True%n", i);
            }
            else System.out.printf("%d -> False%n",i);
        }
    }
}
