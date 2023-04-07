package P05ListsExercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
//        4
//        Allie is going!
//        George is going!
//       John is not going!
//       George is not going!

        List<String> guests= new ArrayList<>();
        String command=scanner.nextLine();
        for (int i = 1; i <= n; i++) {
            List<String> commandType=Arrays.stream(command.split(" ")).collect(Collectors.toList());
            String name= commandType.get(0);
            String going= commandType.get(2);
            if (going.equals("not")){
                if (guests.contains(name)){
                    guests.remove(name);
                }
                else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }

            else if(going.equals("going!")){
                if (guests.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }
                else {
                    guests.add(name);
                }
            }
            if (i==n){
                break;
            }
            command= scanner.nextLine();
        }
        for (String name:guests){
            System.out.println(name);
        }

//        If you receive the first type of input, you have to add the person if he/she is not in the list.
//        (If he/she is in the list print on the console: "{name} is already in the list!").
//        If you receive the second type of input, you have to remove the person if he/she is in the list.
//        (If not print: "{name} is not in the list!"). At the end print all guests.

    }
}
