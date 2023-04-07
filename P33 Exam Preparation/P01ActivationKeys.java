package P11FinalExamPreparationLab;

import java.util.Scanner;

public class P01ActivationKeys {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawActivationKey = scanner.nextLine();

        String instruction = scanner.nextLine();

        while (!instruction.equals("Generate")) {
            String[] instructionData = instruction.split(">>>");

            String firstInstruction = instructionData[0];
            switch (firstInstruction) {
                case "Contains":
                    String containSubstring = instructionData[1];
                    if (rawActivationKey.contains(containSubstring)) {
//                    o	If it does prints: "{raw activation key} contains {containSubstring}".
                        System.out.printf("%s contains %s%n", rawActivationKey, containSubstring);
                    } else {
//                    o	If not, prints: "Substring not found!"
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String option = instructionData[1];
                    int startIndex = Integer.parseInt(instructionData[2]);
                    int endIndex = Integer.parseInt(instructionData[3]);

                    String substringToReplace = rawActivationKey.substring(startIndex, endIndex);

                    if (option.equals("Upper")) {
                        rawActivationKey = rawActivationKey.replace(substringToReplace, substringToReplace.toUpperCase());
                        System.out.println(rawActivationKey);
                    } else if (option.equals("Lower")) {
                        rawActivationKey=rawActivationKey.replace(substringToReplace, substringToReplace.toLowerCase());
                        System.out.println(rawActivationKey);
                    }
                    break;

                case "Slice":
                    int startIndexSlice = Integer.parseInt(instructionData[1]);
                    int endIndexSlice = Integer.parseInt(instructionData[2]);

                    String substringToRemove=rawActivationKey.substring(startIndexSlice, endIndexSlice);
                    rawActivationKey=rawActivationKey.replace(substringToRemove, "");
                    System.out.println(rawActivationKey);

                    break;
            }


            instruction = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s", rawActivationKey);
    }
}
