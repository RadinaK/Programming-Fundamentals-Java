package P13FinalExam2;

import java.util.Scanner;

public class P01N03SecretChat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String secretChat = scanner.nextLine();
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Reveal")) {
            String[] tokens = inputLine.split("[\\:|\\:]+");
            String command = tokens[0];
            switch (command) {
                case "InsertSpace":
                    int index = Integer.parseInt(tokens[1]);
//                    secretChat.replace(secretChat.charAt(index), ' ');
                    String firstPart = secretChat.substring(0, index);
                    String secondPart = secretChat.substring(index);
                    secretChat = firstPart + ' ' + secondPart;
                    System.out.println(secretChat);
                    break;

                case "Reverse":
                    String reversedSubstring = tokens[1];

                    if (secretChat.toString().contains(reversedSubstring)) {
                        StringBuilder reverseSB = new StringBuilder();

                        for (int i = reversedSubstring.length() - 1; i >= 0; i--) {
                            reverseSB.append(reversedSubstring.charAt(i));
                        }
                        secretChat = secretChat.replace(reversedSubstring, "");
                        secretChat = secretChat.concat(reverseSB.toString());
                        System.out.println(secretChat);
                        break;


                    } else {
                        System.out.println("error");
                    }

                    break;

                case "ChangeAll":
                    String changedSubstring = tokens[1];
                    String replacement = tokens[2];
                    if (secretChat.contains(changedSubstring)) {
                        secretChat = secretChat.replace(changedSubstring, replacement);
                    }
                    System.out.println(secretChat);
                    break;
            }


            inputLine = scanner.nextLine();
        }
        System.out.printf("You have a new text message: %s%n", secretChat);
    }
}
