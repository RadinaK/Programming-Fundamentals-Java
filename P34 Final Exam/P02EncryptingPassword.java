package P12FinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02EncryptingPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

//        String regex="(\\W+)([>])([0-9]{3})\\|([a-z]{3})\\|([A-Z]{3})\\|([^\\w><]{3})([<])(\\1)";
//        String regex="(\\W+)([>])(?<name>[0-9]{3}\\|[a-z]{3}\\|[A-Z]{3}\\|[^\\w><]{3})([<])(\\1)";

//        String regex="([\\w\\W]+)([>])(?<name>[0-9]{3}\\|[a-z]{3}\\|[A-Z]{3}\\|[^\\w><]{3})([<])(\\1)";
//        String regex="([A-Za-z0-9\\W]+)([>])(?<name>[0-9]{3}\\|[a-z]{3}\\|[A-Z]{3}\\|[^\\w><]{3})([<])(\\1)";
        String regex="([\\w\\W]+)([>])(?<name>[0-9]{3}\\|[a-z]{3}\\|[A-Z]{3}\\|[\\W\\w^><]{3})([<])(\\1)";

        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=null;

        for (int i = 0; i < n; i++) {
            String password=scanner.nextLine();
            matcher= pattern.matcher(password);
            if(matcher.find()){
                String[] passwordParts=matcher.group("name").split("\\|");
                StringBuilder sb=new StringBuilder();
                sb.append(passwordParts[0]).append(passwordParts[1]).append(passwordParts[2]).append(passwordParts[3]);

                System.out.printf("Password: %s%n", sb);

            }else {
                System.out.println("Try another password!");
            }

        }

    }
}
