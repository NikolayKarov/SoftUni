package AssociativeArrays_Exercises;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CompanyUsers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, ArrayList<String>> companies = new LinkedHashMap<>();

        String command = scanner.nextLine();

        while (!command.equals("End")) {

            String[] input = command.split(" -> ");
            String company = input[0];
            String id = input[1];

            if (!companies.containsKey(company)) {
                companies.put(company, new ArrayList<>());
            }
            if (companies.containsKey(company) && !companies.get(company).contains(id)) {
                companies.get(company).add(id);
            }
            command = scanner.nextLine();
        }

        for (Map.Entry<String, ArrayList<String>> entry : companies.entrySet()) {
            System.out.println(entry.getKey());
            for (String ids : entry.getValue()) {
                System.out.println("-- " + ids);
            }
        }
    }
}
