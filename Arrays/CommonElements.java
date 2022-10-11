package Arrays_Exercises;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] firstArray = scanner.nextLine().split("\\s+");
        String[] secondArray = scanner.nextLine().split("\\s+");

        for (String elementSecondArray : secondArray) {
            for (String elementFirstArray : firstArray) {
                if (elementSecondArray.equals(elementFirstArray)) {
                    System.out.print(elementSecondArray + " ");
                }
            }
        }
    }
}
