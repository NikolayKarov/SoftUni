package StacksAndQueues_Exercises;

import java.util.Scanner;

public class RecursiveFibonacci {
    public static long[] memoryForFib;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        memoryForFib = new long[number + 1];
        System.out.println(fib(number));
    }

    public static long fib(int number) {
        if (number <= 1) {
            return 1;
        }
        if (memoryForFib[number] != 0) {
            return memoryForFib[number];
        }
        return memoryForFib[number] = fib(number - 1) + fib(number - 2);
    }
}
