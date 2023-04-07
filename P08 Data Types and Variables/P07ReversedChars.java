package P02DataTypesAndVariablesLab;

import java.util.Scanner;

public class P07ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String data="";
//        for (int i = 1; i <=3; i++) {
//            char symbol=scanner.nextLine().charAt(0);
//            data=data+symbol;
//        }
//        for (int i = data.length()-1; i >=0 ; i--) {
//            System.out.println(data.charAt(i)+" ");
//        }
        char firstSymbol=scanner.nextLine().charAt(0);
        char secondSymbol=scanner.nextLine().charAt(0);
        char thirdSymbol=scanner.nextLine().charAt(0);
        System.out.printf("%c %c %c", thirdSymbol, secondSymbol,firstSymbol);
    }
}
