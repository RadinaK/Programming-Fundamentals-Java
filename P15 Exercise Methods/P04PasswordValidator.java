package P04MethodsExercise;

import java.util.Scanner;

public class P04PasswordValidator {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine();
//        boolean isValidCheckNumCharacters =checkNumCharacters(password);
//        if(isValidCheckNumCharacters){
//            System.out.println("Password is valid");
//        }
//        else {
//            System.out.println("Password must be between 6 and 10 characters");
//        }
//         boolean isValidCheckLettersAndDigits=checkLettersAndDigits(password);
//        if(isValidCheckNumCharacters){
//            System.out.println("Password is valid");
//        }
//        else {
//            System.out.println("Password must consist only of letters and digits");
//        }
//        boolean isValidCheckNumDigits=checkNumDigits(password);
//        if(isValidCheckNumCharacters){
//            System.out.println("Password is valid");
//        }
//        else {
//            System.out.println("Password must have at least 2 digits");
//        }
//    }
//
//    private static boolean checkNumCharacters(String password) {
////•	6 – 10 characters (inclusive);
////        if (password.length() >= 6 && password.length() <= 10) {
////            System.out.println("Password is valid");
////        } else System.out.println("Password must be between 6 and 10 characters");
//return password.length() >= 6 && password.length() <= 10;
////•	"Password must be between 6 and 10 characters";
//
//
//    }
//
//    private static boolean checkLettersAndDigits(String password) {
//        //•	Consists only of letters and digits;
//        //•	"Password must consist only of letters and digits";
//        boolean isLettersAndDigits = false;
//        for (char symbol:password.toCharArray()) {
//            if (!Character.isLetterOrDigit(password.charAt(symbol))) {
////                System.out.println("Password must consist only of letters and digits");
//                isLettersAndDigits = false;
//
//            } else {
////                isLettersAndDigits = true;
//                isLettersAndDigits = true;
//            }
//        }
//        if (isLettersAndDigits) {
//return true;
////            System.out.println("Password is valid");
//        }
//        else return false;
//    }
//
//    private static boolean checkNumDigits(String password) {
////•	"Password must have at least 2 digits".
//        //•	Have at least 2 digits.
//        int countDigits = 0;
//        for (char symbol : password.toCharArray()) {
//            if (Character.isDigit(symbol)) {
//                countDigits++;
//            }
//        }
//        if (countDigits >= 2) {
//            return true;
////            System.out.println("Password is valid");
//        } else return false;
////            System.out.println("Password must have at least 2 digits");
//
//    }
//
//}




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        //проверка за дължина -> [6; 10]
        boolean isPasswordValidLength = isValidLength(password); //true -> валидна; false -> не е валидна
        if (!isPasswordValidLength) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        //проверка за съдържанието -> само букви и цифри
        boolean isValidPasswordContent = isValidContent(password); //true (валидна), false (невалидна)
        if (!isValidPasswordContent) {
            System.out.println("Password must consist only of letters and digits");
        }

        //проверка за брой на цифирите -> минимум 2
        boolean isValidPasswordCountDigits = isValidCountDigits(password);  //true (валидна), false (невалидна)
        if (!isValidPasswordCountDigits) {
            System.out.println("Password must have at least 2 digits");
        }

        //валидна: isPasswordValidLength = true и isValidPasswordContent = true и isValidPasswordCountDigits = true
        if (isPasswordValidLength && isValidPasswordContent && isValidPasswordCountDigits) {
            System.out.println("Password is valid");
        }

    }

    //метод за валидиране на дължината -> true (валидна); false (невалидна)
    private static boolean isValidLength(String password) {
        //валидна -> дължина >= 6 и дължина <= 10
        /*if (password.length() >= 6 && password.length() <= 10) {
            return true;
        } else {
            return false;
        }*/
        return password.length() >= 6 && password.length() <= 10;
    }

    //метод за валидиране на съдържанието -> true (валидна), false (невалидна)
    private static boolean isValidContent(String password) {
        //всички символи да са буква или цифра -> "T@st1234"
        //обхождаме всички символи
        //ако даден символ не е буква или цифра -> false
        for (char symbol : password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }

    //метод за валидиране на брой на цифрите -> валидна парола: брой >= 2
    private static boolean isValidCountDigits(String password) {
        //true -> count >= 2
        //false -> count < 2
        int count = 0; //брой на цифрите
        //обхождам всеки един символ -> проверка дали е цифра -> увеличавам броя
        for (char symbol : password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                count++;
            }
        }
        //знам броя на цифрите
        /*if (count >= 2) {
            return true;
        } else {
            return false;
        }*/
        return count >= 2;
    }

}
