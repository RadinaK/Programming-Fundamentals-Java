package P07ObjectsAndClassesExercise.P07OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        List<Person> personList=new ArrayList<>();
        while (!input.equals("End")){
            String[] command=input.split(" ");
            String name=command[0];
            String ID=command[1];
            int age=Integer.parseInt(command[2]);
            Person personalInformation=new Person(name,ID,age);
            personList.add(personalInformation);

            input=scanner.nextLine();
        }
        personList.sort(Comparator.comparing(Person::getAge));
        for (Person person:personList){
            System.out.println(person);
        }
    }
}
