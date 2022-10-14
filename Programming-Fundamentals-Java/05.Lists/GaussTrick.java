package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());


        for (int i = 0; i <= numbers.size() / 2; i++) {
            if (i == numbers.size() - 1) {
                break;
            }
            int firstNumber = numbers.get(i);
            int lastNumber = numbers.get(numbers.size() - 1);

            numbers.set(i, firstNumber + lastNumber);
            numbers.remove(numbers.size() - 1);
        }

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }
}
