package P13FinalExam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02N01AdAstra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine= scanner.nextLine();
        String regex="([|#])(?<name>[A-Za-z\\s]+)(\\1)(?<date>[0-9]{2}\\/[0-9]{2}\\/[0-9]{2})(\\1)(?<calories>[0-9]+)(\\1)";

        int kcalPerDay=2000;

        Pattern pattern=Pattern.compile(regex);
        Matcher mather=pattern.matcher(inputLine);

        Matcher calories=pattern.matcher(inputLine);

        int allCalories=0;



        while (calories.find()){
            int kcal=Integer.parseInt(calories.group("calories"));
            allCalories+=kcal;
        }
        int days=allCalories/kcalPerDay;
        System.out.printf("You have food to last you for: %d days!%n", days);


        while (mather.find()){
            String name= mather.group("name");
            String date= mather.group("date");
            int cals=Integer.parseInt(mather.group("calories"));
//            allCalories+=calories;



            System.out.printf("Item: %s, Best before: %s, Nutrition: %d%n",name, date, cals);
        }

//        int days=allCalories/kcalPerDay;
//        System.out.printf("You have food to last you for: %d days!%n", days);


    }
}
