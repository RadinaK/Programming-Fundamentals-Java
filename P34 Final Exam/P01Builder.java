//package P12FinalExam;
//
//import java.util.Scanner;
//
//public class P01Builder {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String password = scanner.nextLine();
//
//        String regex = "";
//
//        String command = scanner.nextLine();
//
//        StringBuilder sb=new StringBuilder(password);
//
//
//        while (!command.equals("Complete")) {
//            String[] tokens = command.split(" ");
//
//            switch (tokens[0]) {
//                case "Make":
//                    String type = tokens[1];
//                    int index = Integer.parseInt(tokens[2]);
//                    char letter = password.charAt(index);
//                    if (type.equals("Upper")) {
////                        password = password.replace(letter, Character.toUpperCase(letter));
////                        System.out.println(password);
//                        sb=new StringBuilder(sb.replace(letter, Character.toUpperCase(letter)));
//
//                    } else if (type.equals("Lower")) {
//                        password = password.replace(letter, Character.toLowerCase(letter));
//                        System.out.println(password);
//                    }
//                    break;
//
//                case "Insert":
//                    int indexToInsert = Integer.parseInt(tokens[1]);
//                    String charToInsert = tokens[2];
////                    char letterToInsert=password.charAt(indexToInsert);
//                    if (isValidIndex(indexToInsert, password)) {
//                        //letterToInsert->
//                        String firstHalf = password.substring(0, indexToInsert);
//                        String secondHalf = password.substring(indexToInsert);
//                        password = firstHalf + charToInsert + secondHalf;
//
//                        System.out.println(password);
//                    }
//
//                    break;
//                case "Replace":
//                    String charToReplace = tokens[1];
//                    int value = Integer.parseInt(tokens[2]);
//                    int charToReplaceValue = Integer.parseInt(charToReplace);
//
//
//                    System.out.println(password);
//
//
////                    String firstHalf=password.substring(0, indexToInsert);
////                    String secondHalf=password.substring(indexToInsert);
////                    String substringToRemove=password.substring();
////                    rawActivationKey=rawActivationKey.replace(substringToRemove, "");
////                    System.out.println(rawActivationKey);
//
//                    break;
//                case "Validation":
//                    break;
//            }
//
//
//            command = scanner.nextLine();
//        }
//
//    }
//
//    public static boolean isValidIndex(int index, String password) {
//        //true -> валиден
//        //false -> невалиден
//        return index >= 0 && index < password.length();
//    }
////    public static boolean isValidChar(char letter, String password) {
////        //true -> валиден
////        //false -> невалиден
////        for (char symbol:password.toCharArray() ) {
////            int index=Character.valueOf(symbol);
////            if(password.contains()){
////
////            }
////        }
////    }
//
//
//}
