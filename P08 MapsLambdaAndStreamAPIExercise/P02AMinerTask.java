package P08MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command= scanner.nextLine();

        Map<String, Integer> resourceMap=new LinkedHashMap<>();

        while (!command.equals("stop")){
            int quantity=Integer.parseInt(scanner.nextLine());
            if (!resourceMap.containsKey(command)){
                resourceMap.put(command, quantity);
            }
            else {
                int currentQuantity=resourceMap.get(command)+quantity;
                resourceMap.put(command, currentQuantity);
            }

            command= scanner.nextLine();
        }
//        resourceMap.entrySet().forEach(entry-> System.out.println(entry.getKey()+" -> "+entry.getValue()));


        for (Map.Entry<String, Integer> entry:resourceMap.entrySet()) {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
