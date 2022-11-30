import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int startNumber = numbers.get(0);
        int endNumber = numbers.get(1);
        String command = scanner.nextLine();

        if (command.equals("even")) {
            for (int i = startNumber; i <= endNumber; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        } else if (command.equals("odd")) {
            for (int i = startNumber; i <= endNumber; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
