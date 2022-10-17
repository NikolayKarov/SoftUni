package Lists_Exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> elements = Arrays.stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String[] input = scanner.nextLine().split("\\s+");
        String bombNumber = input[0];
        int power = Integer.parseInt(input[1]);
        int sum = 0;

        while (elements.contains(bombNumber)) {
            int indexOfElement = elements.indexOf(bombNumber);

            int left = Math.max(0, indexOfElement - power);
            int right = Math.min(indexOfElement + power, elements.size() - 1);

            for (int i = right; i >= left; i--) {
                elements.remove(i);
            }
        }
        System.out.println(elements.stream().mapToInt(Integer::parseInt).sum());
    }
}
