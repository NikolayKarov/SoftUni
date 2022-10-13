package DataTypesAndVariables_Exercises;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());

        int fullCurses = (int) Math.ceil((double) numberOfPeople / capacity);

        System.out.println(fullCurses);
    }
}
