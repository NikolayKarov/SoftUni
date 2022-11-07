package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MaximalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = readMatrix(scanner);
        int maxSum = Integer.MIN_VALUE, maxRow = 0, maxCol = 0;

        for (int row = 0; row < matrix.length - 2; row++) {
            for (int col = 0; col < matrix[row].length - 2; col++) {
                int sum = subMatrixSum(matrix, row, col);
                if (sum > maxSum) {
                    maxSum = sum;
                    maxRow = row;
                    maxCol = col;
                }
            }
        }
        System.out.printf("Sum = %d%n", maxSum);
        printSubMatrix(matrix, maxRow, maxCol);
    }


    public static int subMatrixSum(int[][] matrix, int row, int col) {
        int sum = 0;
        for (int rows = row; rows < row + 3; rows++) {
            for (int cols = col; cols < col + 3; cols++) {
                sum += matrix[rows][cols];
            }
        }
        return sum;
    }

    public static int[][] readMatrix(Scanner scanner) {
        int[] size = readArray(scanner);
        int rows = size[0], cols = size[1];

        int[][] matrix = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            matrix[row] = readArray(scanner);
        }
        return matrix;
    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

    public static void printSubMatrix(int[][] matrix, int row, int col) {
        for (int rows = row; rows < row + 3; rows++) {
            for (int cols = col; cols < col + 3; cols++) {
                System.out.print(matrix[rows][cols] + " ");
            }
            System.out.println();
        }
    }
}
