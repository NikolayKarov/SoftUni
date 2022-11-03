package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicStackOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsToPush = scanner.nextInt();
        int elementsToPop = scanner.nextInt();
        int elementToCheck = scanner.nextInt();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int count = 1; count <= elementsToPush; count++) {
            stack.push(scanner.nextInt());
        }

        for (int count = 1; count <= elementsToPop; count++) {
            stack.pop();
        }

        if (stack.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            if (!stack.isEmpty()) {
                System.out.println(Collections.min(stack));
            } else {
                System.out.println("0");

            }
        }
    }
}
