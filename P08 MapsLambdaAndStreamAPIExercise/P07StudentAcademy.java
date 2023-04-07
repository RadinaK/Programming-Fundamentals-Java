package P08MapsLambdaAndStreamAPIExercise;

import java.util.*;

public class P07StudentAcademy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numStudents=Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> studentGradesMap=new LinkedHashMap<>();

        for (int i = 0; i < numStudents; i++) {
            String studentName= scanner.nextLine();
            double grade=Double.parseDouble(scanner.nextLine());

            if(!studentGradesMap.containsKey(studentName)) {
                studentGradesMap.put(studentName, new ArrayList<>());
            }
                studentGradesMap.get(studentName).add(grade);
        }

        Map<String, Double> studentAverageGrade=new LinkedHashMap<>();

        for (Map.Entry<String, List<Double>> entry : studentGradesMap.entrySet()){
            //entry -> име (String) + списък с оценки (list<double>)
            String studentName= entry.getKey();
            List<Double> grades=entry.getValue();

            double averageGrade=getAverageGrade(grades);

            if(averageGrade>=4.50){
                studentAverageGrade.put(studentName, averageGrade);
            }
        }

        //разменяме записите ако на втория оценката > оценката на първия
        //descending order
        studentAverageGrade.entrySet().stream().sorted((e1, e2)->e2.getValue().compareTo(e1.getValue()))
                .forEach(entry-> System.out.printf("%s -> %.2f%n", entry.getKey(), entry.getValue()));
    }

    private static double getAverageGrade(List<Double> grades) {
        double sumGrades=0;
        for (double grade:grades) {
            sumGrades+=grade;
        }
        return sumGrades/grades.size();
    }
}
