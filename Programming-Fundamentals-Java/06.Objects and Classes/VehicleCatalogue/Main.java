package ObjectsAndClasses_Exercises.VehicleCatalogue;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        List<Vehicle> vehicleList = new ArrayList<>();
        while (!command.equals("End")) {

            String[] commands = command.split(" ");
            String type = commands[0];
            String model = commands[1];
            String color = commands[2];
            int horsePower = Integer.parseInt(commands[3]);

            Vehicle vehicle = new Vehicle(type, model, color, horsePower);
            vehicleList.add(vehicle);

            command = scanner.nextLine();
        }
        String secondCommand = scanner.nextLine();
        while (!secondCommand.equals("Close the Catalogue")) {
            String modelOfVehicle = secondCommand;
            for (int i = 0; i <= vehicleList.size() - 1; i++) {
                if (modelOfVehicle.equals(vehicleList.get(i).getModel())) {
                    if ("car".equals(vehicleList.get(i).getVehicleType())) {
                        vehicleList.get(i).setVehicleType("Car");
                    } else if ("truck".equals(vehicleList.get(i).getVehicleType())) {
                        vehicleList.get(i).setVehicleType("Truck");
                    }
                    System.out.println("Type: " + vehicleList.get(i).getVehicleType());
                    System.out.println("Model: " + vehicleList.get(i).getModel());
                    System.out.println("Color: " + vehicleList.get(i).getColor());
                    System.out.println("Horsepower: " + vehicleList.get(i).getHorsepower());
                }
            }
            secondCommand = scanner.nextLine();
        }
        int cars = 0;
        int trucks = 0;
        int sum = 0;
        int sums = 0;
        double carPower = 0;
        double truckPower = 0;
        for (int i = 0; i <= vehicleList.size() - 1; i++) {
            if ("Car".equalsIgnoreCase(vehicleList.get(i).getVehicleType())) {
                cars++;
                int horsePower = vehicleList.get(i).getHorsepower();

                sum += horsePower;
                carPower = sum * 1.0 / cars;
            } else if ("Truck".equalsIgnoreCase(vehicleList.get(i).getVehicleType())) {
                trucks++;
                int horsePwr = vehicleList.get(i).getHorsepower();

                sums += horsePwr;
                truckPower = sums * 1.0 / trucks;
            }
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", carPower);
        System.out.printf("Trucks have average horsepower of: %.2f.", truckPower);
    }
}