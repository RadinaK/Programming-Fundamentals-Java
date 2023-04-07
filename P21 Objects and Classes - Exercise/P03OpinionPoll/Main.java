package P07ObjectsAndClassesExercise.P03OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfPeople=Integer.parseInt(scanner.nextLine());

        List<Person> personList=new ArrayList<>();
        for (int i = 0; i < numOfPeople; i++) {
            String command=scanner.nextLine();

            String name=command.split(" ")[0];
            int age=Integer.parseInt(command.split(" ")[1]);

            Person personInformation=new Person(name, age);

            if (age>30){
                personList.add(personInformation);
            }

        }
        personList.sort(Comparator.comparing(Person::getName));
        for (Person person:personList){
            System.out.println(person.getName()+" "+"-"+" "+person.getAge());
        }
    }
}
