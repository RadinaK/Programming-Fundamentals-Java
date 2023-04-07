package P09TextProcesingExercise;

import java.util.Scanner;

public class P02CharacterMultiplier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //str1 - превръщаме всеки символ в съответната му цифра и ги сумираме
        //str2 - превръщаме всеки символ в съответната му цифра и ги сумираме
        //обща сума

        //умножаваме str1[0] и str2[1] и добавяме към общата сума
        //ако единия низ е по-дълъг от другия прибавяме останалите цифри без да умножаваме
        String[] input = scanner.nextLine().split(" ");
        String first = input[0];
        String second = input[1];
        int sum = 0;

        for (int i = 0; i < Math.max(first.length(), second.length()); i++) {
            if(i < first.length() && i < second.length()){
                sum += first.charAt(i) * second.charAt(i);
            }else if(i < first.length()){
                sum += first.charAt(i);
            }else{
                sum += second.charAt(i);
            }
        }

        System.out.println(sum);
    }
}
