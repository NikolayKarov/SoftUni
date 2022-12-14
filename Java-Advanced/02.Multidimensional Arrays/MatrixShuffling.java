package MultidimensionalArrays_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class MatrixShuffling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimension = readArray(scanner);
        int rows = dimension[0];
        int cols = dimension[1];

        int[][] matrix = new int[rows][cols];
        for (int r = 0; r < matrix.length; r++) {
            matrix[r] = readArray(scanner);
        }

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String[] tokens = input.split("\\s+");

            if (tokens[0].equals("swap") && tokens.length == 5) {

                int row1 = Integer.parseInt(tokens[1]);
                int col1 = Integer.parseInt(tokens[2]);

                int row2 = Integer.parseInt(tokens[3]);
                int col2 = Integer.parseInt(tokens[4]);

                if (isOutOfBounds(row1, col1, matrix) && isOutOfBounds(row2, col2, matrix)) {
                    System.out.println("Invalid input!");
                    input = scanner.nextLine();
                    continue;
                }

                int temp = matrix[row1][col1];
                matrix[row1][col1] = matrix[row2][col2];
                matrix[row2][col2] = temp;
                printMatrix(matrix);

            } else {
                System.out.println("Invalid input!");
            }

            input = scanner.nextLine();
        }
    }

    public static int[] readArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
    }

    public static boolean isOutOfBounds(int row, int col, int[][] matrix) {
        return row < 0 || row >= matrix.length ||
                col < 0 || col >= matrix[row].length;
    }

    private static void printMatrix(int[][] matrix) {
        for (int[] arr : matrix) {
            for (int element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
