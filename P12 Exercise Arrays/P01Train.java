package P03ArraysExercise;

import java.util.Scanner;

public class P01Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        int[] wagon=new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            int passengers=Integer.parseInt(scanner.nextLine());
            wagon[i]=passengers;
            sum+=passengers;
        }
        for (int people:wagon){
            System.out.printf("%d ",people);
        }
        System.out.println();
        System.out.println(sum);
    }
}
