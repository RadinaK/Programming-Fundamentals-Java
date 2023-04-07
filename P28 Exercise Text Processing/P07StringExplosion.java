package P09TextProcesingExercise;

import java.util.Scanner;

public class P07StringExplosion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //abv>1>1>2>2asdasd
        //abv>>>>dasd
        //1st explosion is at index 3 and it is with strength of 1.
        // We delete only the digit after the explosion character.
        // The string will look like this: abv>>1>2>2asdasd

        //2nd explosion is with strength one and the string transforms to this:
        // abv>>>2>2asdasd

        //3rd explosion is now with strength of 2.
        //We delete the digit and we find another explosion.
        // At this point the string looks like this: abv>>>>2asdasd.

        //4th explosion is with strength 2.
        // We have 1 strength left from the previous explosion,
        // we add the strength of the current explosion to what is left
        // and that adds up to a total strength of 3.
        // We delete the next three characters and we receive the string abv>>>>dasd

        //We do not have any more explosions and we print the result: abv>>>>dasd


        String input = scanner.nextLine();
        StringBuilder text = new StringBuilder(input);
        int strength = 0;

        for (int index = 0; index < text.length(); index++) {
            char currentSymbol = text.charAt(index);
            if (currentSymbol == '>') {
                strength = strength + Integer.parseInt(String.valueOf(text.charAt(index + 1)));
            } else if (currentSymbol != '>' && strength > 0) {
                text.deleteCharAt(index);
                strength--;
                index--;
            }
        }
        System.out.println(text);


//        String text= scanner.nextLine();
//        StringBuilder stringBuilder=new StringBuilder(text);
//        int strength=0;
//        int restStrength=0;
//        int countStrength=0;
//
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            if(stringBuilder.charAt(i)=='>'){
//                strength=Integer.parseInt(String.valueOf(stringBuilder.charAt(i+1)));
//                int firstStrength=strength;
//                while (strength+restStrength!=0){
//                    for (int j = 1; j <= strength+restStrength; j++) {
//                        if (stringBuilder.charAt(i+j)!='>'){
//                            stringBuilder.deleteCharAt(i+1);
//
//                            strength--;

//                            countStrength++;
//
//                        }else {
//                            restStrength=firstStrength-countStrength;
//                            strength--;
//                            continue;
//                        }
//                    }
//                }
//                if(restStrength==0){
//                    countStrength=0;
//                }
//            }
//
//        }
//        System.out.println(stringBuilder);

    }
}
