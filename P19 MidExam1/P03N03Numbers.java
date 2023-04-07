package P06MidExam1;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class P03N03Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int sum = 0;

        if (array.length == 1) {
            System.out.println("No");
        } else {

            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            double average = sum * 1.0 / array.length;

            List<Integer> greatestNums = new ArrayList<>();

            for (int i = 0; i < array.length; i++) {
                int currentNum = array[i];
                if (currentNum > average) {
                    greatestNums.add(currentNum);
                }
            }


//        System.out.println(sum);
//        System.out.println(average);

            Collections.sort(greatestNums);
            Collections.reverse(greatestNums);

            List<Integer> finalList = new ArrayList<>();

            if (greatestNums.size() >= 5) {
                for (int i = 0; i < 5; i++) {
                    finalList.add(greatestNums.get(i));
                }
            }else {
                for (int i = 0; i < greatestNums.size(); i++) {
                    finalList.add(greatestNums.get(i));
                }
            }



            int countZeros=0;
            for (int i = 0; i < finalList.size(); i++) {
                if (finalList.get(i)==0){
                    countZeros++;
                }
            }
            if (countZeros== finalList.size()){
                System.out.println("No");
            }


            finalList.forEach(element -> System.out.print(element + " "));
        }
    }
}
