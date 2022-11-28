package FinalExamPreparation;

import java.util.Scanner;

public class WorldTour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        StringBuilder stops = new StringBuilder(scanner.nextLine());
        String input;

        while (!"Travel".equals(input = scanner.nextLine())) {
            String[] command = input.split(":");
            if ("Add Stop".equals(command[0])) {
                int index = Integer.parseInt(command[1]);
                if (index >= 0 && index < stops.length()) {
                    stops.insert(index, command[2]);
                }
                System.out.println(stops);
            } else if ("Remove Stop".equals(command[0])) {
                int startIndex = Integer.parseInt(command[1]);
                int endIndex = Integer.parseInt(command[2]);
                if (startIndex >= 0 && endIndex >= 0 && startIndex < stops.length() && endIndex < stops.length()) {
                    stops.delete(startIndex, endIndex + 1);
                }
                System.out.println(stops);
            } else if ("Switch".equals(command[0])) {
                stops.replace(stops.indexOf(command[1]), stops.indexOf(command[1]) + command[1].length(), command[2]);
                System.out.println(stops);
            }
        }
        System.out.printf("Ready for world tour! Planned stops: %s", stops);
    }
}
