package P06MidExam1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02N02ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer>targetsList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        String inputLine= scanner.nextLine();

        int countShotTargets=0;
        while (!inputLine.equals("End")){
            int shot=Integer.parseInt(inputLine);

            if(shot>=0 && shot<targetsList.size()){
                int shotTarget=targetsList.get(shot);
                if(shotTarget!=-1) {
                    targetsList.set(shot, -1);
                    countShotTargets++;

//                    for (int target : targetsList) {
                    for (int i = 0; i < targetsList.size(); i++) {
                        int target = targetsList.get(i);

                        if (target != -1) {


                            if (target <= shotTarget) {
                                targetsList.set(i, targetsList.get(i) + shotTarget);
                            } else {
                                targetsList.set(i, targetsList.get(i) - shotTarget);
                            }
                        }
                    }
//                    }
                }


            }

            inputLine= scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ",countShotTargets);
        targetsList.forEach(target-> System.out.print(target + " "));
    }
}
