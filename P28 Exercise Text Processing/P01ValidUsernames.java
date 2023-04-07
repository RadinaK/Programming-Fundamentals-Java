package P09TextProcesingExercise;

import java.util.Scanner;

public class P01ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] text = scanner.nextLine().split(", ");
        for (String username : text) {
            //проверка дали е валиден
            //true -> валиден
            //false -> невалиден
            if (isValidUsername(username)){
                System.out.println(username);
            }
        }
    }

    private static boolean isValidUsername(String username) {
        if (!(username.length() >= 3 && username.length() <= 16)) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!(symbol == '-' || symbol == '_' || Character.isLetterOrDigit(symbol))) {
                return false;
            }
        }
        return true;
    }
}
