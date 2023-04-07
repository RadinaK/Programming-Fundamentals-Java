package P06MidExam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03N02MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> targetsList = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = scanner.nextLine();

        while (!inputLine.equals("End")) {
            String[] command = inputLine.split(" ");
            String commandType = command[0];
            int index = Integer.parseInt(command[1]);


            switch (commandType) {
                case "Shoot":
                    if (isValidIndex(index, targetsList)) {
                        int power = Integer.parseInt(command[2]);
                        if (targetsList.get(index) - power > 0) {
                            targetsList.set(index, targetsList.get(index) - power);
                        } else {
                            targetsList.remove(index);
                        }
                    }
                    break;

                case "Add":
                    int value = Integer.parseInt(command[2]);
                    if (isValidIndex(index, targetsList)) {
                        targetsList.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;

                case "Strike":
                    int radius = Integer.parseInt(command[2]);
                    if (isValidIndex(index + radius, targetsList) && isValidIndex(index - radius, targetsList)) {

//                        if(index-radius==0&&index+radius==targetsList.size()-1){
//                            System.out.println("Strike missed!");
//                            break;
//                        }else {

                        for (int i = index - radius; i <= index + radius; i++) {
                            targetsList.set(i, 0);
                        }

                        for (int i = 0; i < targetsList.size(); i++) {
                            if (targetsList.get(i) == 0) {
                                targetsList.remove(i);
                                i--;
                            }
                        }
//                        }

                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;


            }
            inputLine = scanner.nextLine();
        }
        targetsList.forEach(target -> {
            if (targetsList.indexOf(target) == targetsList.size() - 1) {
                System.out.print(target);
            } else {
                System.out.print(target + "|");
            }


            //            if(targetsList.indexOf(target)==0){
//                System.out.print(target);
//            }else{
//                System.out.print("|"+target);
//            }
        });

    }

    private static boolean isValidIndex(int index, List<Integer> targetsList) {
        return index >= 0 && index < targetsList.size();
    }
}

