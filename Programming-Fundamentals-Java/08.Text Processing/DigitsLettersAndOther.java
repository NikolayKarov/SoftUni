package TextProcessing_Lab;

import java.util.Scanner;

public class DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        StringBuilder digits = new StringBuilder();
        StringBuilder letters = new StringBuilder();
        StringBuilder other = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentSymbol = input.charAt(i);
            if (Character.isDigit(currentSymbol)) {
                digits.append(currentSymbol);
            } else if (Character.isAlphabetic(currentSymbol)) {
                letters.append(currentSymbol);
            } else {
                other.append(currentSymbol);
            }
        }
        System.out.println(digits.toString());
        System.out.println(letters.toString());
        System.out.println(other.toString());
    }
}
