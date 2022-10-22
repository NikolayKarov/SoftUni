package StacksAndQueues_Lab;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] expression = scanner.nextLine().split("\\s+");

        ArrayDeque<String> stack = new ArrayDeque<>();
        Collections.addAll(stack, expression);

        while (stack.size() > 1) {
            int leftOperand = Integer.parseInt(stack.pop());
            String operand = stack.pop();
            int rightOperand = Integer.parseInt(stack.pop());

            int result = operand.equals("+")
                    ? rightOperand + leftOperand
                    : leftOperand - rightOperand;

            stack.push(String.valueOf(result));
        }
        System.out.println(stack.pop());
    }
}
