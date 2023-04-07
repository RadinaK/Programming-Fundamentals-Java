package P07ObjectsAndClassesExercise.P02Articles;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");
        String articleTitle=input[0];
        String articleContent=input[1];
        String articleAuthor=input[2];

        int commandsNum = Integer.parseInt(scanner.nextLine());

        Article newArticle=new Article(articleTitle, articleContent, articleAuthor);
        for (int i = 0; i < commandsNum; i++) {
            String[] command= scanner.nextLine().split(": ");
            String commandName=command[0];
            String newValue=command[1];

            switch (commandName){
                case "Edit":
                    newArticle.setContent(newValue);
                    break;
                case "ChangeAuthor":
                    newArticle.setAuthor(newValue);
                    break;
                case "Rename":
                    newArticle.setTitle(newValue);
                    break;
            }

        }
        System.out.println(newArticle);
    }

}
