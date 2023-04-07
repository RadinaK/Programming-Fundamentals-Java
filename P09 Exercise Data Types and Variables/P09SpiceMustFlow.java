package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P09SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Write a program that calculates the total amount of spice that can be extracted from a source.
//        The source has a starting yield, which indicates how much spice can be mined on the first day.
//        After it has been mined for a day, the yield drops by 10,
//        meaning on the second day it’ll produce 10 less spice than on the first,
//        on the third day 10 less than on the second, and so on (see examples).
//        A source is considered profitable only while its yield is at least 100 –
//        when less than 100 spice is expected in a day, abandon the source.
//        The mining crew consumes 26 spice every day at the end of their shift and an additional
//        26 after the mine has been exhausted. Note that the workers cannot consume more spice than there is in storage.
//        When the operation is complete, print on the console on two separate lines how many days the mine has operated
//        and the total amount of spice extracted.
//        Input
//        You will receive a number, representing the starting yield of the source.
        int sourceOfYield=Integer.parseInt(scanner.nextLine());
        int days=0;
        int totalLeaving=0;
        while (sourceOfYield>=100){
            days++;
            int leavingSpice=sourceOfYield-26;
            sourceOfYield=sourceOfYield-10;
            totalLeaving+=leavingSpice;

        }
        System.out.println(days);
        if (totalLeaving>=26){
            System.out.println(totalLeaving-26);

        }
        else System.out.println(totalLeaving);
//        Output
//        Print on the console on two separate lines how many days the mine has operated and the total amount of spice extracted.

    }
}
