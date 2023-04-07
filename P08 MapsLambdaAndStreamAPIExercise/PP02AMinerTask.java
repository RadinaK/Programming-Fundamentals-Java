package P08MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PP02AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        Map<String, Integer> resourceQuantityMap=new LinkedHashMap<>();
        while (!input.equals("stop")){
            String resource= input;
            int quantity=Integer.parseInt(scanner.nextLine());
            if (!resourceQuantityMap.containsKey(resource)){
                resourceQuantityMap.put(resource,quantity);
            }
            else {
                int currentQuantity=resourceQuantityMap.get(resource);
                resourceQuantityMap.put(resource, currentQuantity+quantity);
            }
            input=scanner.nextLine();
        }
        resourceQuantityMap.entrySet().forEach(entry->System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue()));
    }
}
