package Arrays_Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int[] firstArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        int[] secondArr = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();


        String output = IntStream
                .range(0, firstArr.length)
                .filter(index -> firstArr[index] != secondArr[index])
                .mapToObj(index -> String.format("Arrays are not identical. Found difference at %d index.", index))
                .findFirst()
                .orElse(String.format("Arrays are identical. Sum: %d", Arrays.stream(firstArr).sum()));

        System.out.println(output);
    }
}
