package P06MidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P03SchoolLibrary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> library= Arrays.stream(scanner.nextLine().split("&")).collect(Collectors.toList());

        String input= scanner.nextLine();
        while (!input.equals("Done")){
            String[] command=input.split("\\| ");
            String typeCommand=command[0].trim();
            switch (typeCommand){
                case "Add Book":
                    String bookNameToAdd=command[1].trim();
                        if (!library.contains(bookNameToAdd)) {
                            library.add(0, bookNameToAdd);
                            break;
                        }
                    break;
                case "Take Book":
                    String bookNameToTake=command[1].trim();
                    for (int i = 0; i < library.size(); i++) {
                        if(library.get(i).equals(bookNameToTake)){
                            library.remove(library.get(i));
                            break;
                        }
                    }
                    break;
                case "Insert Book":
                    String bookNameToInsert=command[1].trim();
                    for (int i = 0; i < library.size(); i++) {
                        if(!library.get(i).equals(bookNameToInsert)){
                            library.add(bookNameToInsert);
                            break;
                        }
                    }
                    break;
                case "Swap Books":
                    String book1=command[1].trim();
                    String book2=command[2].trim();
                    boolean isBook1=library.contains(book1);
                    boolean isBook2=library.contains(book2);
                    if (isBook1&&isBook2){
                        library.set(library.indexOf(book2), book1);
                        library.remove(book2);
                        library.set(library.indexOf(book1), book2);

                    }
                    break;
                case "Check Book":
                    int index=Integer.parseInt(command[1]);
                    if (index>=0||index< library.size()){
                        System.out.println(library.get(index));
                    }
                    break;
            }

            input= scanner.nextLine();
        }
//        System.out.println(library.toString().replaceAll("[\\[\\]]", "").trim().replaceAll("  ", ", "));
        for (int i = 0; i < library.size(); i++) {
            if (i== library.size()-1){
                System.out.print(library.get(i));
                break;
            }
            System.out.print(library.get(i)+", ");
        }
    }
}
