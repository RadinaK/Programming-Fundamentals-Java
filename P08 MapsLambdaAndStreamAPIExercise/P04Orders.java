package P08MapsLambdaAndStreamAPIExercise;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Double> productPriceMap = new LinkedHashMap<>();
        Map<String, Integer> productQuantityMap=new LinkedHashMap<>();

        while (!input.equals("buy")) {
            String productName = input.split(" ")[0];
            double price = Double.parseDouble(input.split(" ")[1]);
            int quantity = Integer.parseInt(input.split(" ")[2]);
//            double totalPrice = price * quantity;

            if (!productPriceMap.containsKey(productName)){
                productQuantityMap.put(productName, quantity);
                double totalPrice=price*quantity;
                productPriceMap.put(productName, totalPrice);
            }
            else {
                int currentQuantity=productQuantityMap.get(productName);
                double newPrice=Double.parseDouble(input.split(" ")[1]);
//                double newTotalPrice=price*quantity;
                productQuantityMap.put(productName, (currentQuantity+quantity));
                productPriceMap.put(productName, productQuantityMap.get(productName)*newPrice);
            }

                input = scanner.nextLine();
        }
        productPriceMap.entrySet().forEach(entry->System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }
}
