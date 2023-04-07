package P06MidExam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03N05ManOWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> pirateShipList= Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> warShipList= Arrays.stream(scanner.nextLine().split(">")).map(Integer::parseInt).collect(Collectors.toList());
        int maxHealth=Integer.parseInt(scanner.nextLine());

        String inputLine= scanner.nextLine();
        while (!inputLine.equals("Retire")){
            String[]tokens=inputLine.split(">");
            String command=tokens[0];

            switch (command){
                case "Fire":
                    int fireIndex=Integer.parseInt(tokens[1]);
                    int fireDamage=Integer.parseInt(tokens[2]);
                    if(isValidIndex(fireIndex, warShipList));
                    break;
                case "Defend":
                    break;
                case "Repair":
                    break;
                case "Status":
                    break;
            }


            inputLine= scanner.nextLine();
        }
    }

    private static boolean isValidIndex(int index, List<Integer> warShipList) {
        return (index>=0&&index< warShipList.size());
    }
}
