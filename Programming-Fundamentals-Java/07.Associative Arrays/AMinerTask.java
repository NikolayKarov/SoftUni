package AssociativeArrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class AMinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(scanner.nextLine());


            if (!resources.containsKey(resource)) {
                resources.put(resource, quantity);
            } else {
                resources.put(resource, resources.get(resource) + quantity);
            }
            command = scanner.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
