package Lists_Lab;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Double::parseDouble).collect(Collectors.toList());


        for (int i = 0; i < numbers.size() - 1; i++) {
            double currentNumber = numbers.get(i);
            double nextNumber = numbers.get(i + 1);
            if (currentNumber == nextNumber) {
                numbers.set(i, currentNumber + nextNumber);
                numbers.remove(i + 1);
                i = -1;
            }
        }
        System.out.println(joinElementsByDelimiter(numbers, " "));
    }

    public static String joinElementsByDelimiter(List<Double> items, String delimiter) {
        StringBuilder output = new StringBuilder();
        for (Double item : items) {
            output.append(new DecimalFormat("0.#").format(item)).append(delimiter);
        }
        return output.toString();
    }
}
