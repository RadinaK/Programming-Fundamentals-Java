package P13FinalExam2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P03N01ThePianist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numPieces = Integer.parseInt(scanner.nextLine());

        Map<String, String> pieceComposerMap = new TreeMap<>();
        Map<String, String> pieceKeyMap = new TreeMap<>();

        for (int i = 1; i <= numPieces; i++) {
            String[] pieces = scanner.nextLine().split("\\|");
            String piece = pieces[0];
            String composer = pieces[1];
            String key = pieces[2];

            pieceComposerMap.put(piece, composer);
            pieceKeyMap.put(piece, key);
        }

        String inputLine= scanner.nextLine();
        while (!inputLine.equals("Stop")){
            String[]tokens=inputLine.split("\\|");
            String command=tokens[0];
            switch (command){
                case "Add":
                    String addPiece=tokens[1];
                    String addComposer=tokens[2];
                    String addKey=tokens[3];
                    if(pieceComposerMap.containsKey(addPiece)||pieceKeyMap.containsKey(addPiece)){
                        System.out.printf("%s is already in the collection!%n", addPiece);
                    }else {
                        pieceComposerMap.put(addPiece, addComposer);
                        pieceKeyMap.put(addPiece, addKey);
                        System.out.printf("%s by %s in %s added to the collection!%n", addPiece, addComposer, addKey);
                    }
                    break;

                case "Remove":
                    String removePiece=tokens[1];
                    if(!pieceComposerMap.containsKey(removePiece)||!pieceKeyMap.containsKey(removePiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", removePiece);
                    }else {
                        pieceComposerMap.remove(removePiece);
                        pieceKeyMap.remove(removePiece);
                        System.out.printf("Successfully removed %s!%n", removePiece);
                    }
                    break;

                case "ChangeKey":
                    String changePiece=tokens[1];
                    String changeNewKey=tokens[2];
                    if(!pieceComposerMap.containsKey(changePiece)||!pieceKeyMap.containsKey(changePiece)){
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", changePiece);
                    }else {
//                        pieceKeyMap.get(changePiece).replace(pieceKeyMap.get(changePiece), changeNewKey);

                        pieceKeyMap.replace(changePiece, pieceKeyMap.get(changePiece), changeNewKey);
                        System.out.printf("Changed the key of %s to %s!%n", changePiece, changeNewKey);
                    }
                    break;
            }


            inputLine= scanner.nextLine();
        }

        pieceComposerMap.entrySet().stream().forEach(el->{
            System.out.printf("%s -> Composer: %s, Key: %s%n", el.getKey(), el.getValue(), pieceKeyMap.get(el.getKey()));
        });


        System.out.println();
    }
}
