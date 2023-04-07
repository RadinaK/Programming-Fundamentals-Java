package P09TextProcesingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P03Substring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String removedString= scanner.nextLine();
        String secondString= scanner.nextLine();

        int index=secondString.indexOf(removedString);

        while (index!=-1){
            secondString = secondString.replace(removedString, "");
            index=secondString.indexOf(removedString);
        }
        System.out.println(secondString);
    }
}
