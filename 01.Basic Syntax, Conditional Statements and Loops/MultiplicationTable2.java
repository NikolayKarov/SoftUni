package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());

        for (int i = b; i <= 10; i++) {
            int result = a * i;
            System.out.printf("%d X %d = %d\n", a, i, result);
        }
        if (b > 10) {
            int result = a * b;
            System.out.printf("%d X %d = %d\n", a, b, result);
        }
    }
}
