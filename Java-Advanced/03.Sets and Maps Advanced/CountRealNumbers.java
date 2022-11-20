package SetsAndMapsAdvanced_Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountRealNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> numbersOccurrences = new LinkedHashMap<>();

        for (double number : numbers) {
            if (!numbersOccurrences.containsKey(number)) {
                numbersOccurrences.put(number, 1);
            } else {
                numbersOccurrences.put(number, numbersOccurrences.get(number) + 1);
            }
        }

        for (Double key : numbersOccurrences.keySet()) {
            System.out.printf("%.1f -> %d%n", key, numbersOccurrences.get(key));
        }
    }
}
