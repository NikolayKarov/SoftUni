package DataTypesAndVariables_Exercises;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int all= 255;
        int capacity = 0;

        for (int i = 0; i < n; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if (capacity + liters <= all) {
                capacity += liters;
            } else {
                System.out.println("Insufficient capacity!");
            }
        }
        System.out.println(capacity);
    }
}
