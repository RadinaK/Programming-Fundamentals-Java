package P06MidExam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02N04ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> groceryList= Arrays.stream(scanner.nextLine().split("!")).collect(Collectors.toList());
        String inputLine= scanner.nextLine();
        while (!inputLine.equals("Go Shopping!")){
            String[]tokens=inputLine.split("\\s+");
            String command=tokens[0];
            switch (command){
                case "Urgent":
                    String urgentItem=tokens[1];
                    if(!isValidItem(urgentItem, groceryList)){
                        groceryList.add(0, urgentItem);
                    }
                    break;

                case "Unnecessary":
                    String unnecessaryItem=tokens[1];
                    if (isValidItem(unnecessaryItem, groceryList)){
                        groceryList.remove(unnecessaryItem);
                    }
                    break;

                case "Correct":
                    String oldItem=tokens[1];
                    String newItem=tokens[2];
                    if (isValidItem(oldItem, groceryList)){
                        groceryList.set(groceryList.indexOf(oldItem), newItem);
                    }

                    break;
                case "Rearrange":
                    String rearrangeItem=tokens[1];
                    String rearrangeSavedItem=rearrangeItem;
                    if (isValidItem(rearrangeItem, groceryList)){
                        groceryList.remove(rearrangeItem);
                        groceryList.add(groceryList.size(), rearrangeSavedItem);
                    }
                    break;
            }


            inputLine= scanner.nextLine();
        }
        groceryList.forEach(element->{
            if(groceryList.indexOf(element)==groceryList.size()-1){
                System.out.println(element);
            }else {
                System.out.printf(element+", ");
            }
        });

    }

    private static boolean isValidItem(String item, List<String> groceryList) {
        return groceryList.contains(item);
    }
}
