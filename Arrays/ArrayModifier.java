package Arrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        String command = scanner.nextLine();

        while (!command.equals("end")) {
            if (command.contains("swap")) {
                int index1 = Integer.parseInt(command.split("\\s+")[1]);
                int index2 = Integer.parseInt(command.split("\\s+")[2]);

                int element1 = numbers[index1];
                int element2 = numbers[index2];

                numbers[index1] = element2;
                numbers[index2] = element1;

            } else if (command.contains("multiply")) {
                int index1 = Integer.parseInt(command.split("\\s+")[1]);
                int index2 = Integer.parseInt(command.split("\\s+")[2]);

                int element1 = numbers[index1];
                int element2 = numbers[index2];

                int product = element1 * element2;
                numbers[index1] = product;

            } else if (command.contains("decrease")) {
                for (int i = 0; i <= numbers.length - 1; i++) {
                    numbers[i] = numbers[i] - 1;
                }
            }
            command = scanner.nextLine();
        }
        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNumber = numbers[i];

            if (i != numbers.length - 1) {
                System.out.print(currentNumber + ", ");

            } else {
                System.out.println(currentNumber);
            }
        }
    }
}
