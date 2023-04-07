package P08MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P08CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        Map<String, List<String>> companyDataMap=new HashMap<>();

        while (!input.equals("End")){
            String[] data=input.split(" -> ");
            String companyName=data[0];
            String employeeId=data[1];
            if (!companyDataMap.containsKey(companyName)){
                companyDataMap.put(companyName, new ArrayList<>());
            }
            if (!companyDataMap.get(companyName).contains(employeeId)){
                companyDataMap.get(companyName).add(employeeId);
            }

            input= scanner.nextLine();
        }
        companyDataMap.entrySet().stream().sorted((e1, e2)->e1.getKey().compareTo(e2.getKey()))
                .forEach(e->{
                    System.out.printf("%s%n", e.getKey());
                    e.getValue().stream().sorted(String::compareTo)
                            .forEach(employeeId-> System.out.println("-- "+employeeId));
                });
    }
}
