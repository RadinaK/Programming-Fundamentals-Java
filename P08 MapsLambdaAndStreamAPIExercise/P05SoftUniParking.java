package P08MapsLambdaAndStreamAPIExercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());

        Map<String, String> registeredUsersMap = new LinkedHashMap<>();

        for (int i = 0; i < num; i++) {
            String[] command = scanner.nextLine().split(" ");
            String firstCommand = command[0];
            String username = command[1];

            switch (firstCommand) {
                case "register":
                    String licensePlateNumber = command[2];
                    if (!registeredUsersMap.containsKey(username)) {
                        registeredUsersMap.put(username, licensePlateNumber);
                        System.out.printf("%s registered %s successfully%n", username, licensePlateNumber);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n", licensePlateNumber);
                    }
                    break;
                case "unregister":
                    if (!registeredUsersMap.containsKey(username)) {
                        System.out.printf("ERROR: user %s not found%n", username);
                    } else {
                        registeredUsersMap.remove(username);
                        System.out.printf("%s unregistered successfully%n", username);
                    }
                    break;
            }
        }
        registeredUsersMap.entrySet().forEach(entry->System.out.printf("%s => %s%n", entry.getKey(), entry.getValue()));
//        registeredUsersMap.forEach((userName, licensePlate) -> System.out.println(userName + " => " + licensePlate));
    }
}
