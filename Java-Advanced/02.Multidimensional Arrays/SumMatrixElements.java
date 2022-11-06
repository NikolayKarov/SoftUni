package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class SumMatrixElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = readArray(scanner.nextLine(), ", ");
        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = readMatrix(rows, cols, scanner, ", ");

        System.out.println(matrix.length);
        System.out.println(matrix[0].length);
        System.out.println(getElementsSum(matrix));
    }

    private static int getElementsSum(int[][] matrix) {
        int sum = 0;

        for (int[] array : matrix) {
            for (int element : array) {
                sum += element;
            }
        }
        return sum;
    }

    private static int[] readArray(String line, String pattern) {
        return Arrays.stream(line.split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static int[][] readMatrix(int rows, int cols, Scanner scanner, String pattern) {
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            matrix[i] = readArray(scanner.nextLine(), pattern);
        }
        return matrix;
    }
}
