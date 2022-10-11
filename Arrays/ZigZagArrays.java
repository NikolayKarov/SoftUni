package Arrays_Exercises;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());

        String[] firstArray = new String[rows];
        String[] secondArray = new String[rows];

        for (int i = 0; i < rows; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstElement = input[0];
            String secondElement = input[1];

            if ((i + 1) % 2 == 0) {
                secondArray[i] = firstElement;
                firstArray[i] = secondElement;
            } else {
                firstArray[i] = firstElement;
                secondArray[i] = secondElement;
            }
        }
        System.out.println(String.join(" ", firstArray));
        System.out.println(String.join(" ", secondArray));
    }
}
