package P13FinalExam2;

import java.util.Scanner;


public class P01N02WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();

        String inputLine = scanner.nextLine();
        while (!inputLine.equals("Travel")) {
            String[] tokens = inputLine.split(":");
            String command=tokens[0];
            switch (command){
                case "Add Stop":
                    int addIndex=Integer.parseInt(tokens[1]);
                    String addSubstring=tokens[2];
                    if(isValidIndex(addIndex, stops)){
                        String firstPart=stops.substring(0, addIndex);
                        String secondPart=stops.substring(addIndex);
                        stops=firstPart+addSubstring+secondPart;
                    }
                    System.out.println(stops);
                    break;

                case "Remove Stop":
                    int startIndex=Integer.parseInt(tokens[1]);
                    int endIndex=Integer.parseInt(tokens[2]);
                    if(isValidIndex(startIndex, stops)&&isValidIndex(endIndex, stops)){
                        String firstPart=stops.substring(0, startIndex);
                        String secondPart=stops.substring(endIndex+1);
                        stops=firstPart+secondPart;
                    }
                    System.out.println(stops);
                    break;

                case "Switch":
                    String oldString=tokens[1];
                    String newString=tokens[2];
                    if(stops.contains(oldString)){
                        stops=stops.replace(oldString, newString);
                    }
                    System.out.println(stops);
                    break;

            }

            inputLine = scanner.nextLine();
        }
        System.out.printf("Ready for world tour! Planned stops: %s%n", stops);
    }

    private static boolean isValidIndex(int index, String stops) {
        return (index>=0&&index<stops.length());
    }
}
