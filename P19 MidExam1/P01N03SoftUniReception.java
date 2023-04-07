package P06MidExam1;

import java.util.Scanner;

public class P01N03SoftUniReception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentsOfFirstEmployee = Integer.parseInt(scanner.nextLine());
        int studentsOfSecondEmployee = Integer.parseInt(scanner.nextLine());
        int studentsOfThirdEmployee = Integer.parseInt(scanner.nextLine());

        int studentsPerHour = studentsOfFirstEmployee + studentsOfSecondEmployee + studentsOfThirdEmployee;

        int allStudents = Integer.parseInt(scanner.nextLine());

        int countHours = 0;

        if (allStudents == 0) {
            System.out.println("Time needed: 0h.");
        } else {

            while (!(allStudents <= 0)) {

                    countHours++;
                if (countHours % 4 == 0 && countHours != 0) {
                    continue;
                }

                allStudents -= studentsPerHour;

            }
            if (allStudents == 0 && countHours%4==0) {
                countHours++;
            }
            System.out.printf("Time needed: %dh.%n", countHours);
        }
    }
}
