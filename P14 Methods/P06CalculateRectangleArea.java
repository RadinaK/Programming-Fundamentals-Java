package P04MethodsLab;

import java.util.Scanner;

public class P06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
      //  double result=rectangleArea(height,width);

        System.out.printf("%.0f", rectangleArea(height,width));
    }

    public static double rectangleArea(double width, double height) {
        return width*height;
    }
}
