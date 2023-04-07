package P06MidExam;

import java.util.Scanner;

public class P01CookingMasterclass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget=Double.parseDouble(scanner.nextLine());
        int studentsNum=Integer.parseInt(scanner.nextLine());
        double priceFlour=Double.parseDouble(scanner.nextLine());
        double priceEgg=Double.parseDouble(scanner.nextLine());
        double priceApron=Double.parseDouble(scanner.nextLine());

        int flourNum=studentsNum;

        for (int i = 1; i <= studentsNum; i++) {
            if(i%5==0){
                flourNum--;
            }
        }

//        Needed items for 2 students  :
//        apronPrice * (students + 20%) + eggPrice * 10 * (students) + flourPrice * (students - freePackages)
//        10 * (3)                      + 0.10 * 10 * (2)            + 1 * (2) = 34.00
//        34.00 <= 50 – the budget is enough.

        double flour=flourNum*priceFlour;
        double egg=priceEgg*studentsNum*10;
//        double apron=priceApron*(studentsNum+studentsNum*20/100);


//        double apron=Math.ceil((priceApron*studentsNum)+(priceApron*studentsNum*20/100)+studentsNum*3);

//        double apron=studentsNum+Math.ceil(studentsNum*priceApron*20/100);
        double apron=Math.ceil(studentsNum*priceApron+studentsNum*priceApron*20/100);

//            double apron=Math.ceil(priceApron * (studentsNum + 20/100*priceApron*studentsNum));
        double costs=flour+egg+apron;

        if (budget>=costs){
            System.out.printf("Items purchased for %.2f$.%n", costs);

        }
        else {
            double diff=costs-budget;

            System.out.printf("%.2f$ more needed.%n",diff);
        }


    }
}
