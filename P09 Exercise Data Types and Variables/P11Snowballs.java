package P02DataTypesAndVariablesExercise;

import java.util.Scanner;

public class P11Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        double snowballValue=0;
        double highestValue=Double.MIN_VALUE;
        int maxSnowballSnow=Integer.MIN_VALUE;
        int maxSnowballTime=Integer.MIN_VALUE;
        int maxSnowballQuality=Integer.MIN_VALUE;
        for (int snowball = 1; snowball <= n; snowball++) {
            int snowballSnow=Integer.parseInt(scanner.nextLine());
            int snowballTime=Integer.parseInt(scanner.nextLine());
            int snowballQuality=Integer.parseInt(scanner.nextLine());
            snowballValue=  Math.pow((snowballSnow*1.0 / snowballTime), snowballQuality);
            if (snowballValue>=highestValue){
                highestValue=snowballValue;
                maxSnowballQuality=snowballQuality;
                maxSnowballSnow=snowballSnow;
                maxSnowballTime=snowballTime;
            }
        }
        System.out.printf("%d : %d = %.0f (%d)",maxSnowballSnow, maxSnowballTime, highestValue, maxSnowballQuality);
    }
}
