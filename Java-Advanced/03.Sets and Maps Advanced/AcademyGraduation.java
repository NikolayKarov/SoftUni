package SetsAndMapsAdvanced_Lab;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AcademyGraduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());

        Map<String, List<Double>> students = new TreeMap<>();

        IntStream.range(0, numberOfStudents).mapToObj(i -> scanner.nextLine())
                .forEach(name -> students.put(name, Arrays.stream(scanner.nextLine().split("\\s+"))
                        .map(Double::parseDouble).collect(Collectors.toList())));

        students.forEach((k, v) -> System.out.printf("%s is graduated with %s%n", k, getAverage(v)));
    }

    private static Double getAverage(List<Double> value) {
        double average = 0;
        for (Double aDouble : value) {
            average += aDouble;
        }
        return average / value.size();
    }
}
