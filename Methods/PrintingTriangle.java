package Methods_Lab;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height = Integer.parseInt(scanner.nextLine());
        printTriangle(height);
    }

    public static void printTriangle(int height) {
        printTopHalf(height);
        printBottomHalf(height);
    }

    public static void printTopHalf(int height) {
        for (int i = 0; i < height; i++) {
            printSingleLine(1 + i);
        }
    }

    public static void printBottomHalf(int height) {
        for (int i = height; i >= 1; i--) {
            printSingleLine(1 + i);
        }
    }

    public static void printSingleLine(int length) {
        for (int i = 1; i < length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
