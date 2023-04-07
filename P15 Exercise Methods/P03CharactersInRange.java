package P04MethodsExercise;

import java.util.Scanner;

public class P03CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char firstSymbol=scanner.nextLine().charAt(0);
        char secondSymbol=scanner.nextLine().charAt(0);
        symbolsBetween(firstSymbol,secondSymbol);

    }

    public static void symbolsBetween(char first, char second) {
        if(first<second){
            for (char symbol = (char) (first+1); symbol < second; symbol++) {
                System.out.print(symbol+" ");
            }
        }
        else {
            for (char symbol = (char) (second+1); symbol < first; symbol++) {
                System.out.print(symbol+" ");
            }
        }

    }
}
