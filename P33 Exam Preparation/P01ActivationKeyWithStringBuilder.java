package P11FinalExamPreparationLab;

import java.util.Scanner;

public class P01ActivationKeyWithStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String rawActivationKey = scanner.nextLine();
        StringBuilder keyBuilder=new StringBuilder(rawActivationKey);

        String instruction = scanner.nextLine();
        System.out.println();

        while (!instruction.equals("Generate")) {
            String[] instructionData = instruction.split(">>>");

            String firstInstruction = instructionData[0];
            switch (firstInstruction) {
                case "Contains":
                    String containSubstring = instructionData[1];
                    if (keyBuilder.toString().contains(containSubstring)) {
//                    o	If it does prints: "{raw activation key} contains {containSubstring}".
                        System.out.printf("%s contains %s%n", keyBuilder, containSubstring);
                    } else {
//                    o	If not, prints: "Substring not found!"
                        System.out.println("Substring not found!");
                    }
                    break;

                case "Flip":
                    String option = instructionData[1];
                    int startIndex = Integer.parseInt(instructionData[2]);
                    int endIndex = Integer.parseInt(instructionData[3]);
                    String stringToReplace=keyBuilder.substring(startIndex, endIndex);

                    if (option.equals("Upper")) {
                        keyBuilder.replace(startIndex, endIndex, stringToReplace.toUpperCase());
                    } else if (option.equals("Lower")) {
                        keyBuilder.replace(startIndex, endIndex, stringToReplace.toLowerCase());
                    }
                    System.out.println(keyBuilder);
                    break;

                case "Slice":
                    int startIndexSlice = Integer.parseInt(instructionData[1]);
                    int endIndexSlice = Integer.parseInt(instructionData[2]);

                    keyBuilder.delete(startIndexSlice, endIndexSlice);
                    System.out.println(keyBuilder);

                    break;
            }


            instruction = scanner.nextLine();
        }
        System.out.printf("Your activation key is: %s%n", keyBuilder);
    }
}
