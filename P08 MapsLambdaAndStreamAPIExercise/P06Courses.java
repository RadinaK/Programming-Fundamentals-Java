package P08MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P06Courses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        Map<String, List<String>> courseInfoMap=new LinkedHashMap<>();
        int countStudents=0;

        while (!input.equals("end")){
            String courseName=input.split(" : ")[0];
            String studentName=input.split(" : ")[1];

            if(!courseInfoMap.containsKey(courseName)){
                courseInfoMap.put(courseName, new ArrayList<>());
            }
            courseInfoMap.get(courseName).add(studentName);
            countStudents++;



            input= scanner.nextLine();
        }
        //courseName -> List<String>
        courseInfoMap.entrySet().stream().sorted((e1, e2)->Integer.compare(e2.getValue().size(), e1.getValue().size()))
        //сортира курсовете(ключовете) по брой хора (descending order / намаляващ ред)
                .forEach(entry->{
                    //key: име на курса
                    //value: списък с хората
                    //име на курса -> бр. хората
                    System.out.println(entry.getKey() + ": "+ entry.getValue().size());
                    entry.getValue().stream().sorted().forEach(student->System.out.println("-- "+ student));
                    //ascending order / нарастващ ред
                });
    }
}
