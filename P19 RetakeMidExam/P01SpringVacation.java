package P06RetakeMidExam;

import java.util.Scanner;

public class P01SpringVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        double budget=Double.parseDouble(scanner.nextLine());
        int people=Integer.parseInt(scanner.nextLine());
        double fuelPricePerKilometer=Double.parseDouble(scanner.nextLine());
        double foodExpensesPerPersonPerDay=Double.parseDouble(scanner.nextLine());
        double hotelRoomPricePerPersonPerNight=Double.parseDouble(scanner.nextLine());

        double totalExpenses=0;
        totalExpenses=foodExpensesPerPersonPerDay*people*days+hotelRoomPricePerPersonPerNight*people*days;
        if(people>10){
            totalExpenses-=hotelRoomPricePerPersonPerNight*people*days*25/100;
        }

        for (int i = 1; i <= days; i++) {
            if (totalExpenses>budget){
                double differance=totalExpenses-budget;
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", differance);
                break;
            }

            double kilometersPerDay=Double.parseDouble(scanner.nextLine());

            totalExpenses+=kilometersPerDay*fuelPricePerKilometer;

//            System.out.println(totalExpenses);

            if(i%3==0||i%5==0){
                totalExpenses+=totalExpenses*40/100;
            }

            else if(i%7==0){
                totalExpenses-=totalExpenses/people;
            }

            if (totalExpenses>budget){
                double differance=totalExpenses-budget;
                System.out.printf("Not enough money to continue the trip. You need %.2f$ more.", differance);
                break;
            }

        }

        if (budget>=totalExpenses){
            double diff=budget-totalExpenses;
            System.out.printf("You have reached the destination. You have %.2f$ budget left.", diff);
        }
    }
}
