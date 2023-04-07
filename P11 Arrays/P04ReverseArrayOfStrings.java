package P03ArraysLab;

import java.util.Scanner;

public class P04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array=scanner.nextLine().split(" ");
        for (int i = 0; i < array.length/2; i++) {
            String lastSymbol=array[i];
            array[i]=array[array.length-1-i];
            array[array.length-1-i]=lastSymbol;

        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }
}
