import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class CountUppercaseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<String> textAsList = Arrays.stream(scanner.nextLine().split("\\s+")).collect(Collectors.toList());

        Predicate<String> checkUpperCase = word -> Character.isUpperCase(word.charAt(0));

        List<String> result = new ArrayList<>();
        for (String word : textAsList) {
            if (checkUpperCase.test(word)) {
                result.add(word);
            }
        }
        System.out.println(result.size());
        for (String s : result) {
            System.out.println(s);
        }
    }
}
