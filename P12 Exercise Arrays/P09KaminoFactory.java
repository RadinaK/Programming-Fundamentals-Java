package P03ArraysExercise;

import java.util.Arrays;
import java.util.Scanner;

public class P09KaminoFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        int[] bestDna = new int[length];
        String input = scanner.nextLine();
        int sample = 1;
        int bestSample = 0;

        int maxSum = 0;
        int bestIndex = 0;
        int maxSequenceLength = 0;
        while (!input.equals("Clone them!")) {
            int[] dna = Arrays.stream(input.split("!+")).mapToInt(Integer::parseInt).toArray();
            int currentSum = 0;
            int sequenceLength = 1;
            int currentIndex = 0;
            for (int i = 0; i < dna.length; i++) {
                currentSum += dna[i];
                if (i != dna.length - 1) {

                    if (dna[i] == 1 && dna[i + 1] == 1) {
                        sequenceLength++;
                        currentIndex = i + 1;
                    }
                }
            }
            if (sequenceLength > maxSequenceLength || (sequenceLength == maxSequenceLength && currentIndex < bestIndex)
                    || (sequenceLength == maxSequenceLength && bestIndex == currentIndex && currentSum > maxSum)) {
                maxSequenceLength = sequenceLength;
                bestIndex = currentIndex;
                maxSum = currentSum;
                bestSample = sample;

                for (int i = 0; i < length; i++) {
                    bestDna[i] = dna[i];
                }
            }

            input = scanner.nextLine();
            sample++;

        }
        System.out.printf("Best DNA sample %d with sum: %d.\n", bestSample, maxSum);
        for (int elements : bestDna) {
            System.out.print(elements + " ");
        }
    }
}

