package P07ObjectsAndClassesExercise.P05Students;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfStudents=Integer.parseInt(scanner.nextLine());

        List<Student> studentList=new ArrayList<>();

        for (int i = 0; i < numOfStudents; i++) {
            String command=scanner.nextLine();
            String firstName=command.split(" ")[0];
            String lastName=command.split(" ")[1];
            double grade=Double.parseDouble(command.split(" ")[2]);

            Student studentInformation=new Student(firstName,lastName,grade);
            studentList.add(studentInformation);
        }
        studentList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student student:studentList){

            System.out.println(student);
        }
    }
}
