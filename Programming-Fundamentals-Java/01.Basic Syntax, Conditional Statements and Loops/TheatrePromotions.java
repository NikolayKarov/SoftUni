package BasicSyntaxConditionalStatementsAndLoops_Lab;

import java.util.Scanner;

public class TheatrePromotions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfDay = scanner.nextLine();
        int ageOfThePerson = Integer.parseInt(scanner.nextLine());

        int price = 0;

        switch (typeOfDay) {
            case "Weekday":
                if (ageOfThePerson >= 0 && ageOfThePerson <= 18) {
                    price = 12;
                    break;
                } else if (ageOfThePerson >= 18 && ageOfThePerson <= 64) {
                    price = 18;
                    break;
                } else if (ageOfThePerson >= 64 && ageOfThePerson <= 122) {
                    price = 12;
                    break;
                }
            case "Weekend":
                if (ageOfThePerson >= 0 && ageOfThePerson <= 18) {
                    price = 15;
                    break;
                } else if (ageOfThePerson >= 18 && ageOfThePerson <= 64) {
                    price = 20;
                    break;
                } else if (ageOfThePerson >= 64 && ageOfThePerson <= 122) {
                    price = 15;
                    break;
                }
            case "Holiday":
                if (ageOfThePerson >= 0 && ageOfThePerson <= 18) {
                    price = 5;
                    break;
                } else if (ageOfThePerson >= 18 && ageOfThePerson <= 64) {
                    price = 12;
                    break;
                } else if (ageOfThePerson >= 64 && ageOfThePerson <= 122) {
                    price = 10;
                    break;
                }
        }
        if ((ageOfThePerson < 0) || (ageOfThePerson > 122)) {
            System.out.println("Error!");
        } else {
            System.out.println(price + "$");
        }
    }
}
