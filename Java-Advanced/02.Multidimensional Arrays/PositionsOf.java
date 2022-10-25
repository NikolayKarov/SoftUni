package MultidimensionalArrays_Lab;

import java.util.Arrays;
import java.util.Scanner;

public class PositionsOf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] dimension = readArray(scanner.nextLine(), "\\s+");
        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = readMatrix(rows, cols, scanner, "\\s+");
        int searchNumber = Integer.parseInt(scanner.nextLine());

        isFound(matrix, searchNumber);

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

    private static void isFound(int[][] matrix, int searchNumber) {
        boolean isFound = false;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                if (matrix[row][col] == searchNumber) {
                    System.out.println(row + " " + col);
                    isFound = true;
                }
            }
        }
        if (!isFound) {
            System.out.println("not found");
        }
    }
}
