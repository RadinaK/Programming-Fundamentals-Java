package P10RegularExpressionsExercise;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P03SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

//        String regex="%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*       (?<price>[0-9]+\\.*[0-9]+)\\$";
        String regex="%(?<customerName>[A-Z][a-z]*)%[^|$%.]*<(?<product>\\w+)>[^|$%.]*\\|(?<count>[0-9]+)\\|[^|$%.]*?(?<price>[0-9]+\\.*[0-9]*)\\$";
        Pattern pattern=Pattern.compile(regex);

        //общия приход от всички продукти
        double income=0;

        while (!input.equals("end of shift")) {
            //%George%<Croissant>|2|10.3$
            Matcher matcher=pattern.matcher(input);
            double totalMoney=0;

            if(matcher.find()){
                String customerName=matcher.group("customerName");
                String product=matcher.group("product");
                int count=Integer.parseInt(matcher.group("count"));
                double price=Double.parseDouble(matcher.group("price"));

                totalMoney+=count*price;
                System.out.printf("%s: %s - %.2f%n", customerName, product, totalMoney);
            }
            income+=totalMoney;

            input = scanner.nextLine();
        }
        System.out.printf("Total income: %.2f", income);

    }
}
