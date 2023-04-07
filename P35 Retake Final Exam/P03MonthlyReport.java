package P14RetakeFinalExam;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03MonthlyReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine= scanner.nextLine();

        Map<String, Double> clientEarnedMap=new TreeMap<>();
        Map<String, Double> distributorSpentMap=new TreeMap<>();

        double totalMoney=0.0;

        while (!inputLine.equals("End")){
            String[]tokens=inputLine.split("\\s+");
            String command=tokens[0];
            switch (command){
                case "Deliver":
                    String deliverDistributor=tokens[1];
                    double moneySpend=Double.parseDouble(tokens[2]);
                    if(distributorSpentMap.containsKey(deliverDistributor)){
                        distributorSpentMap.put(deliverDistributor, distributorSpentMap.get(deliverDistributor)+moneySpend);
                    }else {
                        distributorSpentMap.put(deliverDistributor, moneySpend);
                    }
                    break;

                case "Return":
                    String returnDistributor=tokens[1];
                    double moneyReturned=Double.parseDouble(tokens[2]);
                    if (distributorSpentMap.containsKey(returnDistributor)){
                        if (distributorSpentMap.get(returnDistributor)>=moneyReturned){
                            if (distributorSpentMap.get(returnDistributor)-moneyReturned==0){
                                distributorSpentMap.remove(returnDistributor);
                            }else {
                                distributorSpentMap.put(returnDistributor, distributorSpentMap.get(returnDistributor)-moneyReturned);
                            }
                        }
                    }
                    break;

                case "Sell":
                    String client=tokens[1];
                    double moneyEarned=Double.parseDouble(tokens[2]);
                    totalMoney+=moneyEarned;
                    if(clientEarnedMap.containsKey(client)){
                        clientEarnedMap.put(client, clientEarnedMap.get(client)+moneyEarned);
                    }else {
                        clientEarnedMap.put(client, moneyEarned);
                    }
                    break;
            }


            inputLine= scanner.nextLine();
        }

        clientEarnedMap.entrySet().stream()
                .forEach(client-> System.out.printf("%s: %.2f%n", client.getKey(), client.getValue()));

        System.out.println("-----------");

        distributorSpentMap.entrySet().stream()
                .forEach(distributor-> System.out.printf("%s: %.2f%n", distributor.getKey(), distributor.getValue()));

        System.out.println("-----------");

        System.out.printf("Total Income: %.2f%n", totalMoney);

    }
}
