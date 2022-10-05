package BasicSyntaxConditionalStatementsAndLoops_Exercises;

import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double money = Double.parseDouble(scanner.nextLine());
        int students = Integer.parseInt(scanner.nextLine());
        double lightsabersPrice = Double.parseDouble(scanner.nextLine());
        double robePrice = Double.parseDouble(scanner.nextLine());
        double beltPrice = Double.parseDouble(scanner.nextLine());

        double sumLightsabers = lightsabersPrice * Math.ceil(students * 1.1);
        double sumBelts = (students - students / 6) * beltPrice;
        double sumRobe = robePrice * students;

        double totalSum = sumLightsabers + sumRobe + sumBelts;

        if (money >= totalSum) {
            System.out.printf("The money is enough - it would cost %.2flv.", totalSum);
        } else {
            System.out.printf("George Lucas will need %.2flv more.", totalSum - money);
        }
    }
}
