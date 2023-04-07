package P09TextProcesingLab;

import java.util.Scanner;

public class P04TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] bannedWords= scanner.nextLine().split(", ");
        String text= scanner.nextLine();

        for (String bannWord:bannedWords) {
            if(text.contains(bannWord)){
                text=text.replace(bannWord, repeatWord("*", bannWord.length()));
            }
        }
        System.out.println(text);
    }
    public static String repeatWord(String word, int count){
        String[] stringArr=new String[count];
        for (int i = 0; i < count; i++) {
            stringArr[i]=word;
        }
        return String.join("", stringArr);
    }
}
