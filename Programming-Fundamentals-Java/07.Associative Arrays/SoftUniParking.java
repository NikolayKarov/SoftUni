package AssociativeArrays_Exercises;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class SoftUniParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfCommands = Integer.parseInt(scanner.nextLine());

        Map<String, String> parking = new LinkedHashMap<>();

        for (int i = 0; i < numberOfCommands; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String command = input[0];

            switch (command) {
                case "register":
                    String username = input[1];
                    String licensePlateNumber = input[2];
                    if (!parking.containsKey(username)) {
                        parking.put(username, licensePlateNumber);
                        System.out.println(username + " registered " + licensePlateNumber + " successfully");
                    } else {
                        System.out.println("ERROR: already registered with plate number " + licensePlateNumber);
                    }
                    break;
                case "unregister":
                    username = input[1];
                    if (!parking.containsKey(username)) {
                        System.out.println("ERROR: user " + username + " not found");
                    } else {
                        System.out.println(username + " unregistered successfully");
                        parking.remove(username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : parking.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}

