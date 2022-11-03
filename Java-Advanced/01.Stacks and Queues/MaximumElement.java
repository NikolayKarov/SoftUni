package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfCommands = Integer.parseInt(scanner.nextLine());

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 1; i <= countOfCommands; i++) {
            String command = scanner.nextLine();

            if (command.equals("2")) {
                stack.pop();
            } else if (command.equals("3")) {
                if (!stack.isEmpty()) {
                    System.out.println(Collections.max(stack));
                }
            } else if (command.split("\\s+")[0].equals("1")) {
                int pushElement = Integer.parseInt(command.split("\\s+")[1]);
                stack.push(pushElement);
            }
        }
    }
}
