package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class MaximumSumOf2x2SubMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner.nextLine(), ", ");
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = readMatrix(rows, cols, scanner, ", ");
        int[][] bestMatrix = getMaxSumSubMatrix2By2(matrix);
        printMatrix(bestMatrix);
        System.out.println(getElementsSum(bestMatrix));
    }

    public static int getElementsSum(int[][] matrix) {
        int sum = 0;
        for (int[] array : matrix) {
            for (int element : array) {
                sum += element;
            }
        }
        return sum;
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getMaxSumSubMatrix2By2(int[][] matrix) {
        int maxSum = 0;

        int bestRow = 0;
        int bestCol = 0;

        for (int row = 0; row < matrix.length - 1; row++) {
            for (int col = 0; col < matrix[row].length - 1; col++) {
                int sum =
                        matrix[row][col] +
                                matrix[row][col + 1] +
                                matrix[row + 1][col] +
                                matrix[row + 1][col + 1];

                if (sum > maxSum) {
                    maxSum = sum;
                    bestRow = row;
                    bestCol = col;
                }
            }
        }
        return new int[][]{
                {matrix[bestRow][bestCol], matrix[bestRow][bestCol + 1]},
                {matrix[bestRow + 1][bestCol], matrix[bestRow + 1][bestCol + 1]}
        };
    }

    public static int[][] readMatrix(int rows, int cols, Scanner scanner, String pattern) {
        int[][] matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner.nextLine(), pattern);
        }
        return matrix;
    }

    public static int[] readArray(String line, String pattern) {
        return Arrays.stream(line.split(pattern))
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
