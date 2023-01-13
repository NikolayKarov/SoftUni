package TrafficLights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] lightsColor = scanner.nextLine().split("\\s+");
        int count = Integer.parseInt(scanner.nextLine());

        List<Light> lightList = new ArrayList<>();

        for (String color : lightsColor) {
            Light light = new Light(Color.valueOf(color));
            lightList.add(light);
        }

        for (int i = 0; i < count; i++) {
            for (Light light : lightList) {
                light.changeColor();
                System.out.print(light.getColor()+ " ");
            }
            System.out.println();
        }
    }
}
