package P14RetakeFinalExam;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P02Employees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());

//    String regex="(?<name>[A-Z][a-z]{2,} [A-Z][a-z]{2,})[#]+(?<job>([A-Z][a-z]+)(&[A-Z][a-z]+)?(&[A-Z][a-z]+)?)[0-9]{2,}(?<company>[A-Z][A-Za-z0-9]+ ((JSC)|(Ltd.)))";
//        String regex="(?<name>[A-Z][a-z]{2,} [A-Z][a-z]{2,})[#]+(?<job>([A-Z][A-Za-z]+)(&[A-Z][A-Za-z]+)?(&[A-Z][A-Za-z]+)?)[0-9]{2,}(?<company>[A-Z][A-Za-z0-9]+ ((JSC)|(Ltd.)))";
//        String regex="(?<name>[A-Z][a-z]{3,} [A-Z][a-z]{3,})[#]+(?<job>([A-Z][A-Za-z]+)(&[A-Z][A-Za-z]+)?(&[A-Z][A-Za-z]+)?)[0-9]{2,}(?<company>[A-Z][A-Za-z0-9]+ ((JSC)|(Ltd.)))";
        String regex="(?<name>[A-Z][a-z]{3,} [A-Z][a-z]{3,})[#]+(?<job>([A-Z][A-Za-z]+)(&[A-Z][A-Za-z]+)?(&[A-Z][A-Za-z]+)?)[0-9]{2}(?<company>[A-Z][A-Za-z0-9]+ ((JSC)|(Ltd.)))";
//        String regex="";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=null;

        for (int i = 1; i <= n; i++) {
            String inputLine= scanner.nextLine();

            matcher= pattern.matcher(inputLine);

            if (matcher.find()){
                String employeeName=matcher.group("name");
                String job=matcher.group("job");
                String companyName=matcher.group("company");
                if (job.contains("&")){
                    job=job.replace("&", " ");
                }


                System.out.printf("%s is %s at %s%n", employeeName, job, companyName);

            }

        }
    }
}
