package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P09PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        lightsabers, belts and robes.
//        You will be given the amount of money George Lucas has, the number of students and the prices of each item.
//        You have to help George Lucas calculate if the money he has is enough to buy all of the equipment, or how much more money he needs.
//        Because the lightsabers sometimes brake, George Lucas should buy 10% more, rounded up to the next integer.
//        Also, every sixth belt is free.
//        Input / Constraints
//        The input data should be read from the console. It will consist of exactly 5 lines:
//•	The amount of money George Lucas has – floating-point number in range [0.00…1,000.00].
        float amount=Float.parseFloat(scanner.nextLine());
//•	The count of students – integer in range [0…100].
        int students=Integer.parseInt(scanner.nextLine());
//•	The price of lightsabers for a single sabre – floating-point number in range [0.00…100.00].
        float lightsabersPrice=Float.parseFloat(scanner.nextLine());
//•	The price of robes for a single robe – floating-point number in range [0.00…100.00].
        float robePrice=Float.parseFloat(scanner.nextLine());
//•	The price of belts for a single belt – floating-point number in range [0.00…100.00].
        float beltPrice=Float.parseFloat(scanner.nextLine());
//        The input data will always be valid. There is no need to check it explicitly.

        double lightsaberCount=students+Math.ceil(students*1.0/100*10);
        int freeBeltCount=students-students/6;
        float allMoney= (float) (lightsaberCount*lightsabersPrice+students*robePrice+beltPrice*freeBeltCount);
//        Output
//        The output should be printed on the console.
//•	If the calculated price of the equipment is less or equal to the money George Lucas has:
        float dff=Math.abs(allMoney-amount);
        if (amount>=allMoney){
            System.out.printf("The money is enough - it would cost %.2flv.", allMoney);
        }
        else {
            System.out.printf("George Lucas will need %.2flv more.", dff);
        }
//        o	"The money is enough - it would cost {the cost of the equipment}lv."
//•	If the calculated price of the equipment is more than the money George Lucas has:
//        o	 "George Lucas will need {neededMoney}lv more."
//•	All prices must be rounded to two digits after the decimal point.

    }
}
