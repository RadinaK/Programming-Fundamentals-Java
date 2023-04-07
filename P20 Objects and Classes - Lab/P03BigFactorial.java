package P07ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class P03BigFactorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num=Integer.parseInt(scanner.nextLine());

        BigInteger factorial=new BigInteger(String.valueOf(1));
        for (int i = 1; i <= num; i++) {
            factorial=factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
