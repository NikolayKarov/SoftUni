package Methods_Lab;

import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numbers = Integer.parseInt(scanner.nextLine());
        System.out.println(getMultipleOfEvanAndOdds(Math.abs(numbers)));

    }

    public static int getMultipleOfEvanAndOdds(int numbers) {
        int evenSum = getEvenSum(numbers);
        int oddSum = getOddSum(numbers);
        return evenSum * oddSum;
    }

    public static int getEvenSum(int number) {
        int evenSum = 0;

        while (number > 0) {
            int digits = number % 10;
            if (digits % 2 == 0) {
                evenSum += digits;
            }
            number /= 10;
        }
        return evenSum;
    }

    public static int getOddSum(int number) {
        int oddSum = 0;

        while (number > 0) {
            int digits = number % 10;
            if (digits % 2 == 1) {
                oddSum += digits;
            }
            number /= 10;
        }
        return oddSum;
    }
}
