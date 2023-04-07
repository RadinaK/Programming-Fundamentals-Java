package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P03Vacantion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVisitors=Integer.parseInt(scanner.nextLine());
        String type= scanner.nextLine();
        String day= scanner.nextLine();
        double price=0;
        double totalPrice=0;
        switch (day){
            case "Friday":
                switch (type){
                    case "Students":
                        price=8.45;
                        break;
                    case "Business":
                        price=10.90;
                        break;
                    case "Regular":
                        price=15;
                        break;
                }
                break;
            case "Saturday":
                switch (type){
                    case "Students":
                        price=9.80;
                        break;
                    case "Business":
                        price=15.60;
                        break;
                    case "Regular":
                        price=20;
                        break;
                }
                break;
            case "Sunday":
                switch (type){
                    case "Students":
                        price=10.46;
                        break;
                    case "Business":
                        price=16;
                        break;
                    case "Regular":
                        price=22.50;
                        break;
                }
                break;
        }
        totalPrice=price*numVisitors;
        if (type.equals("Students")&&numVisitors>=30){
            totalPrice=totalPrice-totalPrice*15/100;
        }
        else if (type.equals("Business")&&numVisitors>=100){
            totalPrice=totalPrice-price*10;
        }
        else if(type.equals("Regular")&&numVisitors>=10&&numVisitors<=20){
            totalPrice=totalPrice-totalPrice*5/100;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
