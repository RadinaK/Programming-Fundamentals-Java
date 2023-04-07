package P07ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P05Students {

    static class Student{
        String firstName;
        String lastName;
        String age;
        String homeTown;

        Student (String firstName, String lastName, String age, String homeTown){
            this.age=age;
            this.firstName=firstName;
            this.homeTown=homeTown;
            this.lastName=lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getAge() {
            return age;
        }

        public String getHomeTown() {
            return homeTown;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input= scanner.nextLine();

        List<Student> students= new ArrayList<>();
        while (!input.equals("end")){

            String[] data=input.split("\\s+");

            String firstName=data[0];
            String lastName=data[1];
            String age=data[2];
            String town=data[3];

            Student studentData=new Student(firstName, lastName, age, town);

            students.add(studentData);

            input= scanner.nextLine();
        }
        String city= scanner.nextLine();

        for (Student student:students){
            if(student.getHomeTown().equals(city)){
                System.out.printf("%s %s is %s years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }
}
