package P06MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> intList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("Finish")){
            String[] command=input.split("\\s+");
            String typeCommand=command[0];
            int value=Integer.parseInt(command[1]);
            switch (typeCommand){
                case "Add":
                    intList.add(value);
                    break;
                case "Remove":
                    for (int i = 0; i < intList.size(); i++) {
                        if (intList.get(i)==value){
                            intList.remove(i);
                            break;
                        }
                    }
                    break;
                case "Replace":
                    int replacement=Integer.parseInt(command[2]);
                    for (int i = 0; i < intList.size(); i++) {
                        if (intList.get(i)==value){
                            intList.set(i, replacement);
                            break;
                        }
                    }
                    break;
                case "Collapse":
                    for (int i = 0; i < intList.size(); i++) {
                        if (intList.get(i)<value){
                            intList.remove(i);
                        }
                    }
                    break;
            }
            input=scanner.nextLine();
        }
        for (int num:intList){
            System.out.print(num+" ");
        }
    }
}
