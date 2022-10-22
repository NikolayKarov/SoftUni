package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int decimalNumber = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        if (decimalNumber == 0) {
            System.out.println(0);
            return;
        }

        while (decimalNumber != 0) {
            stack.push(decimalNumber % 2);
            decimalNumber /= 2;
        }
        for (Integer integer : stack) {
            System.out.print(integer);
        }
    }
}
