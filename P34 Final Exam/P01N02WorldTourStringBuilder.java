package P13FinalExam2;

import java.util.Scanner;

public class P01N02WorldTourStringBuilder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        StringBuilder stopsBuilder=new StringBuilder(stops);

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Travel")) {
            String[] tokens = inputLine.split(":");
            String command=tokens[0];
            switch (command){
                case "Add Stop":
                    int addIndex=Integer.parseInt(tokens[1]);
                    String addSubstring=tokens[2];
                    if(isValidIndex(addIndex, stopsBuilder)){
//                        String firstPart=stops.substring(0, addIndex);
//                        String secondPart=stops.substring(addIndex);
//                        stops=firstPart+addSubstring+secondPart;
                    stopsBuilder=stopsBuilder.insert(addIndex, addSubstring);
                    }
                    System.out.println(stopsBuilder);
                    break;

                case "Remove Stop":
                    int startIndex=Integer.parseInt(tokens[1]);
                    int endIndex=Integer.parseInt(tokens[2]);
                    if(isValidIndex(startIndex, stopsBuilder)&&isValidIndex(endIndex, stopsBuilder)){
//                        String firstPart=stops.substring(0, startIndex);
//                        String secondPart=stops.substring(endIndex+1);
//                        stops=firstPart+secondPart;
                        stopsBuilder=stopsBuilder.delete(startIndex, endIndex+1);
                    }
                    System.out.println(stopsBuilder);
                    break;

                case "Switch":
                    String oldString=tokens[1];
                    String newString=tokens[2];
                    if(stops.contains(oldString)){
//                        stops=stops.replace(oldString, newString);
                        stopsBuilder=new StringBuilder(stopsBuilder.toString().replace(oldString, newString));
                    }
                    System.out.println(stopsBuilder);
                    break;

            }

            inputLine = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", stopsBuilder);
    }
    private static boolean isValidIndex(int index, StringBuilder stopsBuilder) {
        return (index>=0&&index<stopsBuilder.length());
    }
}
