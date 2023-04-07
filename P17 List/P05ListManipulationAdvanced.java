package P05ListsLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
//        Print even – print all the numbers that are even separated by a space
//        Print odd – print all the numbers that are odd separated by a space
//        Get sum – print the sum of all the numbers
//        Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="

        List<Integer>intList= Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        String input=scanner.nextLine();
        while (!input.equals("end")){
            String[] command=input.split(" ");
            String typeCommand=command[0];

            switch (typeCommand){
                case "Contains":
                    int num=Integer.parseInt(command[1]);
                    if (intList.contains(num)){
                    System.out.println("Yes");
                }else System.out.println("No such number");

                    break;
                case "Print":
                    List<Integer> evenOrOddList=new ArrayList<>();
                    String evenOrOdd=command[1];
                    switch (evenOrOdd){
                        case "even":
                            for (int i = 0; i < intList.size(); i++) {
                                if (intList.get(i)%2==0){
                                    evenOrOddList.add(intList.get(i));
                                }
                            }
                            for (int element:evenOrOddList){
                                System.out.print(element+" ");
                            }
                            System.out.println();
                            break;
                        case "odd":
                            for (int i = 0; i < intList.size(); i++) {
                                if (intList.get(i)%2==1){
                                    evenOrOddList.add(intList.get(i));
                                }
                            }
                            for (int element:evenOrOddList){
                                System.out.print(element+" ");
                            }
                            System.out.println();
                            break;
                    }
                    break;
                case "Get":
                    int sum=0;
                    for (int i = 0; i < intList.size(); i++) {
                        sum+=intList.get(i);
                    }
                    System.out.println(sum);
                    break;
                case "Filter":
                    String condition=command[1];
                    num=Integer.parseInt(command[2]);
                    List<Integer> conditionList =new ArrayList<>();
                    switch (condition){
                        case "<":
                            for (int i = 0; i < intList.size(); i++) {
                                if (intList.get(i)<num){
                                    conditionList.add(intList.get(i));
                                }
                            }
                            for (int element:conditionList){
                                System.out.print(element+" ");
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < intList.size(); i++) {
                                if (intList.get(i)>num){
                                    conditionList.add(intList.get(i));
                                }
                            }
                            for (int element:conditionList){
                                System.out.print(element+" ");
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < intList.size(); i++) {
                                if (intList.get(i)<=num){
                                    conditionList.add(intList.get(i));
                                }
                            }
                            for (int element:conditionList){
                                System.out.print(element+" ");
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < intList.size(); i++) {
                                if (intList.get(i)>=num){
                                    conditionList.add(intList.get(i));
                                }
                            }
                            for (int element:conditionList){
                                System.out.print(element+" ");
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            input=scanner.nextLine();

        }
    }
}
