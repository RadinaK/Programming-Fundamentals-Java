package P12FinalExam;

import java.util.Scanner;

public class P01PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password= scanner.nextLine();

        String regex="";

        String command=scanner.nextLine();
        while (!command.equals("Complete")){
            String[] tokens=command.split(" ");

            switch (tokens[0]){
                case "Make":
                    String type=tokens[1];
                    int index=Integer.parseInt(tokens[2]);
                    char letter=password.charAt(index);
                    if (type.equals("Upper")){
                        password=password.replace(letter, Character.toUpperCase(letter));
                        System.out.println(password);

                    }else if(type.equals("Lower")){
                        password=password.replace(letter, Character.toLowerCase(letter));
                        System.out.println(password);
                    }
                    break;

                case "Insert":
                    int indexToInsert=Integer.parseInt(tokens[1]);
                    String charToInsert=tokens[2];
//                    char letterToInsert=password.charAt(indexToInsert);
                    if(isValidIndex(indexToInsert, password)){
                        //letterToInsert->
                        String firstHalf=password.substring(0, indexToInsert);
                        String secondHalf=password.substring(indexToInsert);
                        password=firstHalf+charToInsert+secondHalf;

                        System.out.println(password);
                    }

                    break;
                case "Replace":
                    String charToReplace=tokens[1];
                    int value=Integer.parseInt(tokens[2]);
//                    int charToReplaceValue=Integer.parseInt(charToReplace);
                    for (char symbol:password.toCharArray()) {
                        if (password.toCharArray().equals(charToReplace)){
                            char newSymbol=password.charAt(value+symbol);

                            String newString=newSymbol+"";

                            password=password.replace(charToReplace, newString);
                        }
                    }




//                    char previousChar = input.charAt(0);
//                    sb.append(previousChar);
//
//                    for (int i = 1; i < password.length(); i++) {
//                        char ch = password.charAt(i);
//                        if (ch != previousChar) {
//                            sb.append(ch);
//                            previousChar = ch;
//                        }
//                    }



                    System.out.println(password);



//                    String firstHalf=password.substring(0, indexToInsert);
//                    String secondHalf=password.substring(indexToInsert);
//                    String substringToRemove=password.substring();
//                    rawActivationKey=rawActivationKey.replace(substringToRemove, "");
//                    System.out.println(rawActivationKey);

                    break;

                case "Validation":
                    if(password.length()<8){
                        System.out.println("Password must be at least 8 characters long!");
                    }


                    int countSymbols=0;
                    for (char symbol:password.toCharArray()) {
                        if(symbol!='_'||!Character.isLetterOrDigit(symbol)){
                        countSymbols++;
                        }
                    }
                    if (countSymbols==0) {
                        System.out.println("Password must consist only of letters, digits and _!");
                    }


                    int countU=0;
                    for (char symbol:password.toCharArray()) {
                        if(!Character.isUpperCase(symbol)){
                            countU++;
                        }
                    }if (countU==0){
                    System.out.println("Password must consist at least one uppercase letter!");
                }



                    int countL=0;
                    for (char symbol:password.toCharArray()) {
                        if(Character.isLowerCase(symbol)){
                            countL++;
                        }
                    }
                    if (countL==0){
                        System.out.println("Password must consist at least one lowercase letter!");
                    }



                    int countDigits=0;
                    for (char symbol:password.toCharArray()) {
                        if(Character.isDigit(symbol)){
                            countDigits++;
                        }
                    }
                    if (countDigits==0){
                        System.out.println("Password must consist at least one digit!");
                    }

                    break;
                default:
                    break;
            }



            command=scanner.nextLine();
        }

    }
    public static boolean isValidIndex(int index, String password) {
        //true -> валиден
        //false -> невалиден
        return index >= 0 && index < password.length();
    }
//    public static boolean isValidChar(char letter, String password) {
//        //true -> валиден
//        //false -> невалиден
//        for (char symbol:password.toCharArray() ) {
//            int index=Character.valueOf(symbol);
//            if(password.contains()){
//
//            }
//        }
//    }


}
