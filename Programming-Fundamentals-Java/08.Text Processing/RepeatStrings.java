package TextProcessing_Lab;

import java.util.Scanner;

public class RepeatStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = scanner.nextLine().split("\\s+");

        for (String word : words) {
            String repeatedWord = repeatWord(word, word.length());
            System.out.print(repeatedWord);
        }
    }

    private static String repeatWord(String word, int numberOfRepetitions) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numberOfRepetitions; i++) {
            result.append(word);
        }
        return result.toString();
    }
}
