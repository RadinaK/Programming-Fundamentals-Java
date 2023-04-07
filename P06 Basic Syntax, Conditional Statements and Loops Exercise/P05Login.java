package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P05Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName=scanner.nextLine();
        String password="";
        for (int position = userName.length()-1; position >= 0 ; position--) {
            char currentPosition=userName.charAt(position);
            password+=currentPosition;
        }
        String checkPassword=scanner.nextLine();
        int count=0;
        while (!checkPassword.equals(password)){
            count++;
            if (count>=4){
                System.out.printf("User %s blocked!%n",userName);
                break;
            }
            System.out.printf("Incorrect password. Try again.%n");
            checkPassword=scanner.nextLine();
        }
        if (checkPassword.equals(password))
            System.out.printf("User %s logged in.%n", userName);
    }
}
