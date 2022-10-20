import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class TheLift {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int waitingPeopleForTheLift = Integer.parseInt(scanner.nextLine());
        int[] stateOFTheLift = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        for (int i = 0; i < stateOFTheLift.length; i++) {
            if (stateOFTheLift[i] < 4) {
                if (waitingPeopleForTheLift >= 4 - stateOFTheLift[i]) {
                    waitingPeopleForTheLift -= 4 - stateOFTheLift[i];
                    stateOFTheLift[i] = 4;
                } else {
                    stateOFTheLift[i] += waitingPeopleForTheLift;
                    waitingPeopleForTheLift = 0;
                }
            }
        }
        boolean isFull = (IntStream.range(0, stateOFTheLift.length).noneMatch(i -> stateOFTheLift[i] != 4));
        if (waitingPeopleForTheLift == 0 && !isFull) {
            System.out.println("The lift has empty spots!");
        } else if (waitingPeopleForTheLift > 0 && isFull) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeopleForTheLift);
        }
        System.out.print(Arrays.toString(stateOFTheLift).replaceAll("[\\[\\]]", "").replaceAll(", ", " "));
    }
}
