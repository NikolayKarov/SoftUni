package SetsAndMapsAdvanced_Exercises;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        Map<Character, Integer> charOccurrences = new TreeMap<>();

        for (int i = 0; i <= text.length() - 1; i++) {
            char currentChar = text.charAt(i);
            if (!charOccurrences.containsKey(currentChar)) {
                charOccurrences.put(currentChar, 1);
            } else {
                charOccurrences.put(currentChar, charOccurrences.get(currentChar) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : charOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " time/s");
        }
    }
}
