package P08MapsLambdaAndStreamAPILab;

import java.util.*;

public class P01CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] number= Arrays.stream(scanner.nextLine().split(" ")).mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> countsNumberMap=new TreeMap<>();
        for (int i = 0; i < number.length; i++) {
            double currentNum=number[i];
//            Integer currentCount=countsNumberMap.get(currentNum);
            if(countsNumberMap.containsKey(currentNum)){
                countsNumberMap.put(currentNum, countsNumberMap.get(currentNum)+1);
            }
            else {
                countsNumberMap.put(currentNum, 1);
            }

        }
        for (Map.Entry<Double, Integer> entry: countsNumberMap.entrySet()){
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
