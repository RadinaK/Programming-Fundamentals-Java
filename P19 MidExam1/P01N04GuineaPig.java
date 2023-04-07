package P06MidExam1;

import java.util.Scanner;

public class P01N04GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double allFood = Double.parseDouble(scanner.nextLine())*1000;
        double hay = Double.parseDouble(scanner.nextLine())*1000;
        double cover = Double.parseDouble(scanner.nextLine())*1000;
        double guineaWeight = Double.parseDouble(scanner.nextLine())*1000;

        double foodPerDay=300;
        double coverPerDay=guineaWeight/3;

        for (int i = 1; i <= 30; i++) {
            if (allFood>0&&hay>0&&cover>0) {
                allFood = allFood - foodPerDay;
                if (i % 2 == 0) {
                    hay = hay - allFood * 1.0 * 5 / 100;
                }
                if (i % 3 == 0) {
                    cover = cover - coverPerDay;
                }
            } if(allFood<=0||hay<=0||cover<=0){
                System.out.println("Merry must go to the pet store!");
                break;
            }
        }
        if (allFood>0&&hay>0&&cover>0){

            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.%n", allFood/1000, hay/1000, cover/1000);
        }

    }
}
