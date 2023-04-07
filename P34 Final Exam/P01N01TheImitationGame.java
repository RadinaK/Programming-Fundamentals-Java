package P13FinalExam2;

import java.util.Scanner;

public class P01N01TheImitationGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String encryptedMessage = scanner.nextLine();

        String inputLine = scanner.nextLine();
        StringBuilder stringBuilder=new StringBuilder(encryptedMessage);

        while (!inputLine.equals("Decode")) {
            String[] tokens = inputLine.split("\\|");
            String command = tokens[0];
            switch (command) {
                case "Move":
                    int numOfLetters = Integer.parseInt(tokens[1]);
//                    String moveSubstring=encryptedMessage.substring(0, numOfLetters-1);
//                    encryptedMessage.replace(moveSubstring, "");
//                    encryptedMessage.concat(moveSubstring);

                    String moveSubstring=stringBuilder.substring(0, numOfLetters);
                    stringBuilder.delete(0, numOfLetters);
                    stringBuilder= new StringBuilder(stringBuilder.append(moveSubstring));
                break;

                case "Insert":
                    int index = Integer.parseInt(tokens[1]);
                    String value = tokens[2];
                    stringBuilder= new StringBuilder( stringBuilder.insert(index, value));

                    break;

                case "ChangeAll":
                    String substring = tokens[1];
                    String replacement = tokens[2];
                    if(stringBuilder.toString().contains(substring)){
                        stringBuilder= new StringBuilder(stringBuilder.toString().replace(substring, replacement));

                    }
                    break;

            }


            inputLine = scanner.nextLine();
        }
        System.out.printf("The decrypted message is: %s", stringBuilder);
    }
}
