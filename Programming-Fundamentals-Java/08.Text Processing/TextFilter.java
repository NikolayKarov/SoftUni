package TextProcessing_Lab;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] forbiddenWords = scanner.nextLine().split(", ");
        String input = scanner.nextLine();

        for (String forbiddenWord : forbiddenWords) {
            if (input.contains(forbiddenWord)) {
                String wordOfStar = convertWordToStar(forbiddenWord);
                input = input.replace(forbiddenWord, wordOfStar);
            }
        }
        System.out.println(input);
    }

    public static String convertWordToStar(String forbiddenWord) {
        StringBuilder wordToStar = new StringBuilder();
        wordToStar.append("*".repeat(forbiddenWord.length()));
        return wordToStar.toString();
    }
}
