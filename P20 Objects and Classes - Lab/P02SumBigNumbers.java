package P07ObjectsAndClassesLab;

import java.math.BigInteger;
import java.util.Scanner;

public class P02SumBigNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger firstNum=scanner.nextBigInteger();
        BigInteger secondNum=scanner.nextBigInteger();

        BigInteger result=firstNum.add(secondNum);
        System.out.println(result);

    }
}
