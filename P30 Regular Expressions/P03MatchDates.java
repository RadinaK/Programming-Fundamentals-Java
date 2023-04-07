package P10RegularExpressionsLab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03MatchDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dates = scanner.nextLine();
        String regex = "\\b(?<Day>\\d{2})([.\\-\\/])(?<Month>[A-Z][a-z]{2}+)\\2(?<Year>\\d{4})\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(dates);

        while (matcher.find()) {
            String day = matcher.group("Day");
            String month = matcher.group("Month");
            String year = matcher.group("Year");

            System.out.printf("Day: %s, Month: %s, Year: %s%n", day, month, year);
        }
    }
}
