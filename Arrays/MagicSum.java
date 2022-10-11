package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int magicNumber = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                int number = numbers[j];

                if (currentNumber + number == magicNumber) {
                    System.out.println(currentNumber + " " + number);
                }
            }
        }
    }
}
