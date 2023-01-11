import java.util.Scanner;

public class RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int size = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= size; i++) {
            printRow(size, i);
        }

        for (int i = size - 1; i >= 1; i--) {
            printRow(size, i);
        }
    }

    private static void printRow(int size, int startCount) {
        for (int i = 0; i < size - startCount; i++) {
            System.out.print(" ");
        }

        for (int i = 1; i < startCount; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
