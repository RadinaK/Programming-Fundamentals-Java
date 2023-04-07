package P02DataTypesAndVariablesLab;

import java.util.Scanner;

public class P08LowerToUpper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter=scanner.nextLine().charAt(0);
        if (letter>=65&&letter<=90){
            System.out.println("upper-case");
        }
        else{
            System.out.println("lower-case");
        }
    }
}
