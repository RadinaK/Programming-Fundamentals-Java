package P06MidExam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03N04HeartDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> housesList = Arrays.stream(scanner.nextLine().split("@")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        int currentPosition = 0;
        int length = 0;

        while (!inputLine.equals("Love!")) {
            String[] tokens = inputLine.split(" ");


            length = length + Integer.parseInt(tokens[1]);
            if (length > housesList.size()) {
                length = 0;

            }
            for (int i = length; i < housesList.size(); i += length) {
                currentPosition = i;

                if (housesList.get(i) > 0) {
                    housesList.set(i, housesList.get(i) - 2);
                    if (housesList.get(i) == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", i);

                    }

                } else {
                    System.out.printf("Place %d already had Valentine's day.%n", i);

                }
                break;

            }


            inputLine = scanner.nextLine();
        }
        System.out.printf("Cupid's last position was %d.%n", currentPosition);

        int countHouses = 0;

        for (int i = 0; i < housesList.size(); i++) {
            if (housesList.get(i) == 0) {
                countHouses++;
            }
        }
        if (countHouses == housesList.size()) {
            System.out.println("Mission was successful.");
        } else {
            System.out.printf("Cupid has failed %d places.%n", housesList.size() - countHouses);
        }

    }
}
