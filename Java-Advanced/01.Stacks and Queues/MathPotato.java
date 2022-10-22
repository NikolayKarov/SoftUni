package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] children = scanner.nextLine().split("\\s+");
        int repeatingRound = Integer.parseInt(scanner.nextLine());
        int round = 1;

        ArrayDeque<String> queue = new ArrayDeque<>();
        Collections.addAll(queue, children);

        while (queue.size() > 1) {
            for (int i = 0; i < repeatingRound - 1; i++) {
                String currentChild = queue.pop();
                queue.offer(currentChild);
            }
            if (isPrime(round)) {
                String child = queue.peek();
                System.out.println("Prime " + child);
            } else {
                String child = queue.poll();
                System.out.println("Removed " + child);
            }
            round++;
        }
        System.out.println("Last is " + queue.poll());
    }

    public static boolean isPrime(int number) {
        if (number == 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
