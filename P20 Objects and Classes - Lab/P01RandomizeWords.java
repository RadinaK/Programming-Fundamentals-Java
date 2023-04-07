package P07ObjectsAndClassesLab;

import java.util.Random;
import java.util.Scanner;

public class P01RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();
        String[] stringArr=input.split("\\s+");
        Random randomGenerator= new Random();

        for (int i = 0; i < stringArr.length; i++) {
            int indexX= randomGenerator.nextInt(stringArr.length);
            int indexY=randomGenerator.nextInt(stringArr.length);

            String oldWord=stringArr[indexX];
            stringArr[indexX]=stringArr[indexY];
            stringArr[indexY]=oldWord;
        }
        System.out.println(String.join(System.lineSeparator(), stringArr));
    }
}
