package SetsAndMapsAdvanced_Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        Set<String> parkingLot = new LinkedHashSet<>();

        while (!input.equals("END")) {
            String car = input.split(", ")[1];
            if (input.contains("IN")) {
                parkingLot.add(car);
            } else if (input.contains("OUT")) {
                parkingLot.remove(car);
            }
            input = scanner.nextLine();
        }

        for (String cars : parkingLot) {
            System.out.println(cars);
        }

        if (parkingLot.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        }
    }
}
