package P10RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P06ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String email= scanner.nextLine();
//        info@softuni-bulgaria.org, kiki@hotmail.co.uk,
//        no-reply@github.com, s.peterson@mail.uu.net,
//        info-bg@software-university.software.academy

//        String regex="(?<user>[A-Za-z0-9]+[.\\-_]?[A-Za-z0-9]+)@(?<host>[A-Za-z]+\\-?[A-Za-z]+[.?[A-Za-z]+\\-?[A-Za-z]+]*)";

        String regex="[A-Za-z0-9]+[._\\-]?[A-Za-z0-9]+@[A-Za-z]+\\-?[A-Za-z]+(\\.[A-Za-z]+\\-?[A-Za-z])+";

        Pattern patternEmail=Pattern.compile(regex);
        Matcher matcherEmail= patternEmail.matcher(email);

        while (matcherEmail.find()){
            System.out.println(matcherEmail.group());
        }

    }
}
