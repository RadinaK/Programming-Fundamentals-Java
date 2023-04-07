package P06RetakeMidExam;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P02BookSWorld {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> genresList = Arrays.stream(scanner.nextLine().split(" \\| ")).collect(Collectors.toList());
        String inputLine = scanner.nextLine();

        while (!inputLine.equals("Stop!")) {
            String[] tokens = inputLine.split("\\s+");
            String command = tokens[0];
            switch (command) {
                case "Join":
                    String joinGenre = tokens[1];
                    if (!genresList.contains(joinGenre)) {
                        genresList.add(joinGenre);
                    }
                    break;

                case "Drop":
                    String dropGenre = tokens[1];
                    if (genresList.contains(dropGenre)) {
                        genresList.remove(dropGenre);
                    }
                    break;

                case "Replace":
                    String oldGenre = tokens[1];
                    String newGenre = tokens[2];
                    if (genresList.contains(oldGenre) && !genresList.contains(newGenre)) {
                        int index = genresList.indexOf(oldGenre);
                        genresList.add(index, newGenre);
                        genresList.remove(oldGenre);
                    }
                    break;

                case "Prefer":
                    int index1 = Integer.parseInt(tokens[1]);
                    int index2 = Integer.parseInt(tokens[2]);
                    if ((index1 >= 0 && index1 < genresList.size()) && (index2 >= 0 && index2 < genresList.size())) {

                        if (genresList.contains(genresList.get(index1)) && genresList.contains(genresList.get(index2))) {
                            String savedIndex1 = genresList.get(index1);
                            genresList.set(index1, genresList.get(index2));
                            genresList.set(index2, savedIndex1);
                        }
                    }
                    break;
            }


            inputLine = scanner.nextLine();
        }
        for (int i = 0; i < genresList.size(); i++) {
            System.out.print(genresList.get(i) + " ");
        }
    }
}
