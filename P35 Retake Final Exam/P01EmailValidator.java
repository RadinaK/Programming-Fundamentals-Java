package P14RetakeFinalExam;

import java.util.Scanner;

public class P01EmailValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email = scanner.nextLine();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Complete")) {
            String[] tokens = inputLine.split(" ");
            String command = tokens[0];
            switch (command) {
                case "Make":
                    if (tokens[1].equals("Upper")) {
                        for (char symbol : email.toCharArray()) {
                            if (Character.isLetter(symbol)) {
                                email = email.replace(symbol, Character.toUpperCase(symbol));
                            }
                        }
                        System.out.println(email);

                    } else if (tokens[1].equals("Lower")) {
                        for (char symbol : email.toCharArray()) {
                            if (Character.isLetter(symbol)) {
                                email = email.replace(symbol, Character.toLowerCase(symbol));
                            }
                        }
                        System.out.println(email);
                    }
                    break;

                case "GetDomain":
                    int count = Integer.parseInt(tokens[1]);
                    String getSubstring=email.substring(email.length()-count);
                    System.out.println(getSubstring);
                    break;

                case "GetUsername":
                    if (email.contains("@")){
                        int endIndex=email.indexOf("@");
                        String getUsername=email.substring(0, endIndex);
                        System.out.println(getUsername);
                    }else {
                        System.out.printf("The email %s doesn't contain the @ symbol.%n", email);
                    }
                    break;

                case "Replace":
                    String charToReplace = tokens[1];
                    if (email.contains(charToReplace)){
                        email=email.replace(charToReplace, "-");
                    }
                    System.out.println(email);
                    break;

                case "Encrypt":
                    for (char symbol:email.toCharArray()) {
                        System.out.print((int)symbol+" ");
                    }
                    System.out.println();
                    break;
            }


            inputLine = scanner.nextLine();
        }
    }
}
