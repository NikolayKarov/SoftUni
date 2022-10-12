package Methods_Lab;

import java.util.Scanner;

public class CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double width = Integer.parseInt(scanner.nextLine());
        double height = Integer.parseInt(scanner.nextLine());
        double area = rectangleArea(width, height);
        System.out.printf("%.0f", area);

    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }
}
