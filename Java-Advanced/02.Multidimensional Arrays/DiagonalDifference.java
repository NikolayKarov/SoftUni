package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class DiagonalDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());
        int[][] matrix = readMatrix(scanner, size);
        int sum = 0;
        for (int row = 0; row < size; row++) {
            sum += matrix[row][row];
        }
        for (int row = 0; row < size; row++) {
            sum -= matrix[size - 1 - row][row];
        }
        System.out.println(Math.abs(sum));
    }

    private static int[][] readMatrix(Scanner scanner, int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            matrix[i] = Arrays.stream(scanner.nextLine().split("\\s+"))
                    .mapToInt(Integer::parseInt).toArray();
        }
        return matrix;
    }
}
