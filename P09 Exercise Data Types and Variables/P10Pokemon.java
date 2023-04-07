package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P10Pokemon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pokePower=Integer.parseInt(scanner.nextLine());
        int distanceBetweenPokeTargets=Integer.parseInt(scanner.nextLine());
        int exhaustionFactor=Integer.parseInt(scanner.nextLine());
//        Your task is to start subtracting M from N until N becomes less than M,
//        i.e. the Poke Mon does not have enough power to reach the next target.
        int firstPower=pokePower;
        int targets=0;
        while (pokePower>=distanceBetweenPokeTargets){
            pokePower-=distanceBetweenPokeTargets;
            targets++;
            if(pokePower==firstPower*0.5&&exhaustionFactor!=0){
                pokePower/=exhaustionFactor;
            }
        }
        System.out.println(pokePower);
        System.out.println(targets);
//        Every time you subtract M from N that means you’ve reached a target and poked it successfully.
//        COUNT how many targets you’ve poked – you’ll need that count.
//        The Poke Mon becomes gradually more exhausted.
//        IF N becomes equal to EXACTLY 50 % of its original value, you must divide N by Y, if it is POSSIBLE.
//        This DIVISION is between integers.
//                If a division is not possible, you should NOT do it. Instead, you should continue subtracting.
//        After dividing, you should continue subtracting from N, until it becomes less than M.
//                When N becomes less than M, you must take what has remained of N and the count of targets you’ve poked, and print them as output.

    }
}
