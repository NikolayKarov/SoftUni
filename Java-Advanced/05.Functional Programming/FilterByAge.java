import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> persons = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(", ");
            String name = input[0];
            int age = Integer.parseInt(input[1]);
            persons.put(name, age);
        }
        String condition = scanner.nextLine();
        int filterAge = Integer.parseInt(scanner.nextLine());
        String format = scanner.nextLine();

        switch (format) {
            case "name age":
                if (condition.equals("younger")) {
                    for (Map.Entry<String, Integer> person : persons.entrySet()) {
                        if (person.getValue() <= filterAge) {
                            System.out.println(person.getKey() + " - " + person.getValue());
                        }
                    }
                } else if (condition.equals("older")) {
                    for (Map.Entry<String, Integer> person : persons.entrySet()) {
                        if (person.getValue() >= filterAge) {
                            System.out.println(person.getKey() + " - " + person.getValue());
                        }
                    }
                }
                break;

            case "name":
                if (condition.equals("younger")) {
                    for (Map.Entry<String, Integer> person : persons.entrySet()) {
                        if (person.getValue() <= filterAge) {
                            System.out.println(person.getKey());
                        }
                    }

                } else if (condition.equals("older")) {
                    for (Map.Entry<String, Integer> person : persons.entrySet()) {
                        if (person.getValue() >= filterAge) {
                            System.out.println(person.getKey());
                        }
                    }
                }
                break;

            case "age":
                if (condition.equals("younger")) {
                    for (Map.Entry<String, Integer> person : persons.entrySet()) {
                        if (person.getValue() <= filterAge) {
                            System.out.println(person.getValue());
                        }
                    }

                } else if (condition.equals("older")) {
                    for (Map.Entry<String, Integer> person : persons.entrySet()) {
                        if (person.getValue() >= filterAge) {
                            System.out.println(person.getValue());
                        }
                    }
                }
                break;
        }
    }
}
