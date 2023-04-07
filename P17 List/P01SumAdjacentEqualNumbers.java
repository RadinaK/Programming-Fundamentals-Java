package P05ListsLab;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P01SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> items = new ArrayList<>();
        for (String s : scanner.nextLine().split(" ")) {
            Double parseDouble = Double.parseDouble(s);
            items.add(parseDouble);
        }

        for (int i = 0; i < items.size() - 1; i++) {
            if (items.get(i).equals(items.get(i + 1))) {
                items.set(i + 1, items.get(i) + items.get(i + 1));
                items.remove(i);

                i = -1;
            }

        }
        System.out.println(joinElementsByDelimiter(items, " "));


    }

    private static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        String output = "";
        for (Double item : items) {
            DecimalFormat decimalFormat = new DecimalFormat("0.#");
            String df = decimalFormat.format(item) + " ";

            output += df;
        }
        return output;
    }
}
