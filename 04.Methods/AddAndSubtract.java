package Methods_Exercise;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        int thirdNumber = Integer.parseInt(scanner.nextLine());


        int result = subtractThirdNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(result);

    }

    private static int sumOfFirstAndSecondNumbers(int firstNumber, int secondNumber) {
         return firstNumber + secondNumber;

    }

    private static int subtractThirdNumber(int firstNumber, int secondNumber, int thirdNumber) {
        return sumOfFirstAndSecondNumbers(firstNumber, secondNumber) - thirdNumber;
    }
}
