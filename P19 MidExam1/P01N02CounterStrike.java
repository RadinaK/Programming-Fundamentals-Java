package P06MidExam1;

import java.util.Scanner;

public class P01N02CounterStrike {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int energy = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int countWins = 0;

        while (!input.equals("End of battle")) {
            int distance = Integer.parseInt(input);

            if (energy <= 0) {
                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countWins, energy);
                break;
            }

            energy -= distance;
            countWins++;

            if (countWins % 3 == 0) {
                energy += countWins;
            }

//            if (energy <= 0) {
            if (energy < 0) {
//                System.out.printf("Not enough energy! Game ends with %d won battles and %d energy%n", countWins, energy);
                System.out.printf("Not enough energy! Game ends with %d won battles and 0 energy%n", countWins);
                break;
            }


            input = scanner.nextLine();
        }



        if (input.equals("End of battle") && energy > 0) {
            System.out.printf("Won battles: %d. Energy left: %d%n", countWins, energy);
        } else if (input.equals("End of battle") && energy == 0) {
            System.out.printf("Won battles: %d. Energy left: %d%n", countWins, energy);
        }

    }
}
