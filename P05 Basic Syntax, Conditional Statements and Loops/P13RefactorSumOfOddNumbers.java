package P01BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class P13RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num=Integer.parseInt(scanner.nextLine());
        int number=1;
        int sum=0;
        for (int i = 1; i <= num; i++) {
            if (number%2==1){
                System.out.printf("%d%n", number);
                sum+=number;
                number+=1;
            }
        }
        System.out.printf("Sum: %d",sum);
    }
}
