package StacksAndQueues_Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        ArrayDeque<Character> openBracket = new ArrayDeque<>();

        boolean areBalanced = false;

        for (int i = 0; i < input.length(); i++) {
            char currentBracket = input.charAt(i);

            if (currentBracket == '(' || currentBracket == '{' || currentBracket == '[') {
                openBracket.push(currentBracket);

            } else if (currentBracket == ')' || currentBracket == '}' || currentBracket == ']') {
                if (openBracket.isEmpty()) {
                    areBalanced = false;
                    break;
                }
                char lastOpenBracket = openBracket.pop();

                if (lastOpenBracket == '(' && currentBracket == ')') {
                    areBalanced = true;
                } else if (lastOpenBracket == '{' && currentBracket == '}') {
                    areBalanced = true;
                } else if (lastOpenBracket == '[' && currentBracket == ']') {
                    areBalanced = true;
                } else {
                    areBalanced = false;
                    break;
                }
            }
        }
        if (areBalanced) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
