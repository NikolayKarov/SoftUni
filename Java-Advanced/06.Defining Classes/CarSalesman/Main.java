package CarSalesman;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<Engine> engines = new LinkedHashSet<>();
        Set<Car> cars = new LinkedHashSet<>();
        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");
            String model = input[0];
            String power = input[1];
            if (input.length == 2) {
                Engine engine = new Engine(model, power);
                engines.add(engine);
            } else if (input.length == 3) {
                try {
                    int displacement = Integer.parseInt(input[2]);
                    Engine engine = new Engine(model, power, displacement);
                    engines.add(engine);
                } catch (NumberFormatException e) {
                    String efficiency = input[2];
                    Engine engine = new Engine(model, power, efficiency);
                    engines.add(engine);
                }
            } else {
                int displacement = Integer.parseInt(input[2]);
                String efficiency = input[3];
                Engine engine = new Engine(model, power, displacement, efficiency);
                engines.add(engine);
            }
        }
        n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0) {
            String[] input = scanner.nextLine().split("\\s+");

            String model = input[0];
            String engine = input[1];
            if (input.length == 2) {
                Engine currentEngine = getCurrentE(engines, engine);
                Car car = new Car(model, currentEngine);
                cars.add(car);
            } else if (input.length == 3) {
                Engine currentEngine = getCurrentE(engines, engine);
                try {
                    int weight = Integer.parseInt(input[2]);
                    Car car = new Car(model, currentEngine, weight);
                    cars.add(car);
                } catch (NumberFormatException e) {
                    String color = input[2];
                    Car car = new Car(model, currentEngine, color);
                    cars.add(car);
                }
            } else {
                Engine currentEngine = getCurrentE(engines, engine);
                int weight = Integer.parseInt(input[2]);
                String color = input[3];
                Car car = new Car(model, currentEngine, weight, color);
                cars.add(car);
            }
        }
        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }

    private static Engine getCurrentE(Set<Engine> engines, String engine) {
        Engine currentE = new Engine();
        for (Engine engine1 : engines) {
            if (engine1.getModel().equals(engine)) {
                currentE = engine1;
                break;
            }
        }
        return currentE;
    }
}
