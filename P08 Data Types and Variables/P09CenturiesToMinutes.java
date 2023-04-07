package P02DataTypesAndVariablesLab;

import java.util.Scanner;

public class P09CenturiesToMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int centuries=Integer.parseInt(scanner.nextLine());
        int ages=centuries*100;
        double days=ages*365.2422;
        double hours=days*24;
        double minutes=hours*60;
        System.out.printf("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes", centuries, ages, days, hours, minutes);

    }
}
