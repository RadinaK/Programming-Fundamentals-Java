package P13FinalExam2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02N02DestinationMapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input= scanner.nextLine();

        String regex="([=\\/])(?<place>[A-Z][A-Za-z]{2,})(\\1)";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher= pattern.matcher(input);

        int sum=0;
        List<String> destinationsList=new ArrayList<>();

        while (matcher.find()){
            String location= matcher.group("place");
            destinationsList.add(location);

            sum+=location.length();
        }
        System.out.print("Destinations: ");
        for (int i = 0; i < destinationsList.size(); i++) {
            if(i==0){
                System.out.print(destinationsList.get(i));
            }else {
                System.out.print(", "+destinationsList.get(i));
            }
        }
        System.out.println();
        System.out.println("Travel Points: "+sum);

    }
}
