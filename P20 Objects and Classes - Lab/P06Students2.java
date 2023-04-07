package P07ObjectsAndClassesLab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P06Students2 {

    static class Student {
        String firstName;
        String lastName;
        int age;
        String homeTown;

        Student(String firstName, String lastName, int age, String homeTown) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.homeTown = homeTown;
        }

//        Student() {
//            this.firstName = null;
//            this.lastName = null;
//            this.age = 0;
//            this.homeTown = null;
//        }

        public String getHomeTown() {
            return this.homeTown;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public int getAge() {
            return this.age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setHomeTown(String homeTown){
            this.homeTown=homeTown;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Student> studentsList = new ArrayList<>();

        while (!command.equals("end")) {
            String[] dataStudent = command.split(" ");

            String firstName = dataStudent[0];
            String lastName = dataStudent[1];
            int age = Integer.parseInt(dataStudent[2]);
            String town = dataStudent[3];

            Student student = new Student(firstName, lastName, age, town);

            int studentIndex = findStudentIndex(studentsList, student.getFirstName(), student.getLastName());

            if (studentIndex==-1){

                studentsList.add(student);
            }
            else {
                studentsList.get(studentIndex).setAge(student.getAge());
                studentsList.get(studentIndex).setHomeTown(student.getHomeTown());
            }



            command = scanner.nextLine();
        }
        String searchTown = scanner.nextLine();

        for (Student student : studentsList) {
            if (student.getHomeTown().equals(searchTown)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(), student.getAge());
            }
        }

    }

    public static int findStudentIndex(List<Student> studentList, String firstName, String lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            String firstNameList = studentList.get(i).getFirstName();
            String lastNameList = studentList.get(i).getLastName();

            if (firstName.equals(firstNameList) && lastName.equals(lastNameList)) {
                return i;
            }
        }
        return -1;
    }
}
