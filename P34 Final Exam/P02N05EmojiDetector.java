package P13FinalExam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02N05EmojiDetector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        String regex="([:]{2}|[*]{2})(?<word>[A-Z][a-z]{2,})(\\1)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

//        String coolRegex="[0-9]";
//        Pattern coolPattern=Pattern.compile(coolRegex);
//        Matcher coolMatcher= pattern.matcher(input);

        int coolSum=1;
//        if (coolMatcher.find()){
//            int num=Integer.parseInt(coolMatcher.group());
//            coolSum+=num;
//        }
        for (char symbol:input.toCharArray()) {
            if (Character.isDigit(symbol)) {

                coolSum *= Integer.parseInt(symbol+"");
            }
        }
        System.out.printf("Cool threshold: %d%n", coolSum);

        List<String> coolEmojis=new ArrayList<>();
        int numEmojis=0;

        while (matcher.find()){
            String word= matcher.group("word");
            String emoji= matcher.group();
            int sum=0;
//            for (int i = 0; i < word.length(); i++) {
//                sum+=(int)word.charAt(i);
//            }
            for (char symbol:word.toCharArray()) {
                sum+=(int) symbol;
            }
            numEmojis++;
            if(sum>coolSum){
                coolEmojis.add(emoji);
            }
        }
        System.out.printf("%d emojis found in the text. The cool ones are:%n", numEmojis);
        coolEmojis.forEach(emoji-> System.out.println(emoji));
    }
}
