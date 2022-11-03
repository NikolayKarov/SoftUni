package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int elementsToOffer = scanner.nextInt();
        int elementsToPoll = scanner.nextInt();
        int elementToCheck = scanner.nextInt();

        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int count = 1; count <= elementsToOffer; count++) {
            queue.offer(scanner.nextInt());
        }

        for (int count = 1; count <= elementsToPoll; count++) {
            queue.poll();
        }

        if (queue.contains(elementToCheck)) {
            System.out.println("true");
        } else {
            if (!queue.isEmpty()) {
                System.out.println(Collections.min(queue));
            } else {
                System.out.println("0");
            }
        }
    }
}
