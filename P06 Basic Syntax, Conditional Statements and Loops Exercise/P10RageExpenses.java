package P01BasicSyntaxConditionalStatementsAndLoopsExercise;

import java.util.Scanner;

public class P10RageExpenses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        As a MOBA challenger player, Peter has the bad habit to trash his PC when he loses a game and rage quits.
//        His gaming setup consists of headset, mouse, keyboard and display. You will receive Peter`s lost games count.
//        Every second lost game, Peter trashes his headset.
//                Every third lost game, Peter trashes his mouse.
//                When Peter trashes both his mouse and headset in the same lost game, he also trashes his keyboard.
//        Every second time, when he trashes his keyboard, he also trashes his display.
//        You will receive the price of each item in his gaming setup. Calculate his rage expenses for renewing his gaming equipment.
//        Input / Constraints
//•	On the first input line - lost games count – integer in the range [0, 1000].
        int lostGames=Integer.parseInt(scanner.nextLine());
//•	On the second line – headset price - floating point number in range [0, 1000].
        float headsetPrice=Float.parseFloat(scanner.nextLine());
//•	On the third line – mouse price - floating point number in range [0, 1000].
        float mousePrice=Float.parseFloat(scanner.nextLine());
//•	On the fourth line – keyboard price - floating point number in range [0, 1000].
        float keyboardPrice=Float.parseFloat(scanner.nextLine());
//•	On the fifth line – display price - floating point number in range [0, 1000].
        float displayPrice=Float.parseFloat(scanner.nextLine());
        int headsetCount=0;
        int mouseCount=0;
        int keyboardCount=0;
        int displayCount=0;
        headsetCount=lostGames/2;
        mouseCount=lostGames/3;
        keyboardCount=lostGames/6;
        displayCount=lostGames/12;
        headsetPrice=headsetCount*headsetPrice;
        mousePrice=mouseCount*mousePrice;
        keyboardPrice=keyboardCount*keyboardPrice;
        displayPrice=displayPrice*displayCount;
//        Output
//•	As output you must print Peter`s total expenses: "Rage expenses: {expenses} lv."
        System.out.printf("Rage expenses: %.2f lv.",headsetPrice+mousePrice+keyboardPrice+displayPrice);
//•	Allowed working time / memory: 100ms / 16MB.

    }
}
