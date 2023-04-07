package P04MethodsExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P00TY {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array= scanner.nextLine().split("");
        String[] newArray=modify(array);
        System.out.println(Arrays.toString(newArray));
        array=scanner.nextLine().split("");
        while (!array.equals("end")){
            if (array.equals("end")){
                break;
            }
            newArray=modify(array);
            System.out.println(Arrays.toString(newArray));
            array=scanner.nextLine().split("");
        }


    }

//    public static String input(String[] array) {
//
//    }
//    public static String output(String[] array) {
//
//    }
    public static String[] modify(String[] array) {
        String firstSymbol=array[0];

        for (int i = 1; i < array.length-1; i++) {
            if(!firstSymbol.equals(array.length-1)&&firstSymbol!=array[i]){
                array[i]=array[0];
            }
            if (firstSymbol.equals(array[i+1])){
                break;
            }
//            while (!firstSymbol.equals(array.length-1)&&firstSymbol!=array[i]){
//                array[i]=array[0];
//            }
        }
        return array;

    }
}
