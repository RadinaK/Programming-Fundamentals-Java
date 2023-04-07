package P10RegularExpressionsExercise;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class P05NetherRealms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] demons= scanner.nextLine().split(", *");
//        M3ph1st0**, Azazel  ->  ["M3ph1st0**", "Azazel"]

        Arrays.sort(demons);


        for (int i = 0; i < demons.length; i++) {
            String demon=demons[i];
//            "M3p h1st 0**" -> "M3ph1st0**"
            demon = demon.replaceAll(" ", "");
//            "M3ph1st0**"
//            demonHealth = [^0-9+-*/.]
            int demonHealth=getDemonHealth(demon);

//            damageWithout(*, /) = [-+]?[0-9]+[.]?[0-9]*
//            damage = [damageWithout(*, /)]*2 -> ако има *
//            damage = [damageWithout(*, /)]/2 -> ако има /

            double damage=getDamage(demon);

            System.out.printf("%s - %d health, %.2f damage%n", demon, demonHealth, damage);
        }

    }

    private static double getDamage(String demon) {
        StringBuilder damageBuilder=new StringBuilder();
        double damage=0.0;

        String regexDamage="(?<number>[-+]?[0-9]+[.]?[0-9]*)";
        Pattern patternDamage=Pattern.compile(regexDamage);
        Matcher matcherDamage= patternDamage.matcher(demon);

        while (matcherDamage.find()){
            double currentNum=Double.parseDouble(matcherDamage.group("number"));
            damage+=currentNum;
        }

        for (char symbol:demon.toCharArray()) {
            if (symbol=='*'){
                damage*=2;
            }else if (symbol=='/'){
                damage/=2;
            }

        }

        return damage;



//        String baseDamageReg = "[\\-\\+]?([0-9]+)[.]?[0-9]*";
//        String symbolsForBaseDamage = "[\\/\\*]";
//
//        Pattern pattern=Pattern.compile(baseDamageReg);
//        Matcher matcher = pattern.matcher(demon);
//        damage = 0.0;
//        while (matcher.find()) {
//            String group = matcher.group();
//            String sign = "" + group.charAt(0);
//            if (sign.equals("+")){
//                damage += Double.parseDouble(group.substring(1));
//            } else if (sign.equals("-")) {
//                damage -= Double.parseDouble(group.substring(1));
//            } else {
//                damage += Double.parseDouble(group);
//            }
//        }
//
//        pattern = Pattern.compile(symbolsForBaseDamage);
//        matcher = pattern.matcher(demon);
//        while (matcher.find()) {
//            String manipulator = matcher.group();
//            if (manipulator.equals("*")) {
//                damage *= 2;
//            } else if (manipulator.equals("/")) {
//                damage /= 2;
//            }
//        }
//
//        return damage;
    }

    private static int getDemonHealth(String demon) {
        StringBuilder demonHealthBuilder=new StringBuilder();

        String regexDemonHealth="[^0-9+\\-*\\/.]";
//        String regexDemonHealth="[^\\\\-0-9\\\\+\\\\*\\\\/\\\\.]*";

        Pattern patternDemonHealth=Pattern.compile(regexDemonHealth);
        Matcher matcherDemonHealth= patternDemonHealth.matcher(demon);
        int sumOfDemonHealth=0;

        while (matcherDemonHealth.find()){
            demonHealthBuilder.append(matcherDemonHealth.group());
        }

        for (char symbol:demonHealthBuilder.toString().toCharArray()) {
            sumOfDemonHealth+=symbol;
        }

        return sumOfDemonHealth;
    }
}
