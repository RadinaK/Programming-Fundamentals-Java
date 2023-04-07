package P13FinalExam2;

import java.util.Scanner;

public class P01N04PasswordReset {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password= scanner.nextLine();

        String inputLine=scanner.nextLine();
        while (!inputLine.equals("Done")){
            String[] tokens=inputLine.split(" ");
            String command=tokens[0];
            switch (command){
                case "TakeOdd":
                    StringBuilder sb=new StringBuilder();
                    for (int i = 0; i < password.length(); i++) {
                        if(i%2==1){
                            sb=sb.append(password.charAt(i));
                        }
                    }
                    password=sb.toString();
                    System.out.println(password);
                    break;

                case "Cut":
                    int index=Integer.parseInt(tokens[1]);
                    int length=Integer.parseInt(tokens[2]);
                    String cutSubstring=password.substring(index, index+length);
                    password=password.replace(cutSubstring, "");
                    System.out.println(password);
                    break;

                case "Substitute":
                    String substring=tokens[1];
                    String substitute=tokens[2];
                    if (password.contains(substring)){
                        password=password.replace(substring, substitute);
                        System.out.println(password);
                    }else {
                        System.out.println("Nothing to replace!");
                    }
                    break;
            }

            inputLine=scanner.nextLine();
        }
        System.out.printf("Your password is: %s", password);
    }
}
