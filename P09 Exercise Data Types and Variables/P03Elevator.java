package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P03Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Calculate how many courses will be needed to elevate n persons by using an elevator with capacity of p persons.
//        The input holds two lines: the number of people n and the capacity p of the elevator.
        int people=Integer.parseInt(scanner.nextLine());
        int capacity=Integer.parseInt(scanner.nextLine());

        double courses=Math.ceil(people*1.0/capacity);
        System.out.printf("%.0f", courses);
}}
