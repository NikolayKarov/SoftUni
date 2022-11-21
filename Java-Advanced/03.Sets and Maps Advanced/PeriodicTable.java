package SetsAndMapsAdvanced_Exercises;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chemicalCompounds = Integer.parseInt(scanner.nextLine());

        TreeSet<String> compounds = new TreeSet<>();

        for (int i = 0; i < chemicalCompounds; i++) {
            String input = scanner.nextLine();
            String[] chemicalElements = input.split("\\s+");
            compounds.addAll(Arrays.asList(chemicalElements));
        }

        compounds.forEach(e -> System.out.print(e + " "));
    }
}
