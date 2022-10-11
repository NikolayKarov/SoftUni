package Arrays_Exercises;

import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countOfWagons = Integer.parseInt(scanner.nextLine());
        int sumOfThePeopleInTrain = 0;

        for (int i = 0; i < countOfWagons; i++) {
            int peopleInCurrentWagon = Integer.parseInt(scanner.nextLine());
            System.out.print(peopleInCurrentWagon + " ");
            sumOfThePeopleInTrain += peopleInCurrentWagon;
        }
        System.out.println();
        System.out.println(sumOfThePeopleInTrain);
    }
}
