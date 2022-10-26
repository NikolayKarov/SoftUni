package TextProcessing_Exercises;

import java.math.BigInteger;
import java.util.Scanner;

public class MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        BigInteger firstNumber = new BigInteger(scanner.nextLine());
        BigInteger secondNumber = new BigInteger(scanner.nextLine());

        BigInteger result = new BigInteger(String.valueOf(firstNumber.multiply(secondNumber)));

        System.out.println(result);

    }
}
