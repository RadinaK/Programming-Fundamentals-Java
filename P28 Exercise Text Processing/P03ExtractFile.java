package P09TextProcesingExercise;

import java.util.Scanner;

public class P03ExtractFile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fullPath= scanner.nextLine();
        String[] pathParts=fullPath.split("\\\\");

        String fullPathName=pathParts[pathParts.length-1];
        String fileName=fullPathName.split("\\.")[0];
        String extension=fullPathName.split("\\.")[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s", extension);
    }
}
