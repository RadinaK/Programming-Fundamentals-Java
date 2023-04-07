package P06MidExam1;

import java.util.Scanner;

public class P01N05BlackFlag {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days=Integer.parseInt(scanner.nextLine());
        int dailyPlunder=Integer.parseInt(scanner.nextLine());
        double expectedPlunder=Double.parseDouble(scanner.nextLine());

        double totalPlunder=0;
        for (int i = 1; i <= days; i++) {
            totalPlunder+=dailyPlunder;

            if (i%3==0){
                totalPlunder+=dailyPlunder*50/100;
            }

            if (i%5==0){
                totalPlunder-=totalPlunder*30/100;
            }
        }
        if(totalPlunder>=expectedPlunder){
            System.out.printf("Ahoy! %.2f plunder gained.", totalPlunder);
        }else {
            //expectedPlunder = 380 = 100%
            //totalPlunder = 137,9 = x%

            //x = 137.9/380*100
            double percentage =totalPlunder/expectedPlunder*100;


            System.out.printf("Collected only %.2f%% of the plunder.%n", percentage);
        }
    }
}
