package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class SumOfOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 0; i < numbers; i++) {
            System.out.println(2 * i + 1);

            sum = sum + numbers;
        }
        System.out.printf("Sum: %d", sum);
    }
}
