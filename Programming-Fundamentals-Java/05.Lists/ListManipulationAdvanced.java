package Lists_Lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scanner.nextLine().split("\\s+")).map(Integer::parseInt).collect(Collectors.toList());


        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] command = input.split("\\s+");


            switch (command[0]) {
                case "Contains":
                    int numberToCheck = Integer.parseInt(command[1]);
                    if (numbers.contains(numberToCheck)) {
                        System.out.println("Yes");
                    } else {
                        System.out.println("No such number");
                    }
                    break;

                case "Print":
                    if (command[1].equals("even")) {
                        for (Integer number : numbers) {
                            if (number % 2 == 0) {
                                System.out.print(number + " ");
                            }
                        }
                    } else if (command[1].equals("odd")) {
                        for (Integer number : numbers) {
                            if (number % 2 != 0) {
                                System.out.print(number + " ");
                            }
                        }
                    }
                    System.out.println();
                    break;

                case "Get":
                    int sum = 0;
                    for (Integer number : numbers) {
                        sum += number;
                    }
                    System.out.println(sum);
                    break;

                case "Filter":
                    String condition = command[1];
                    int number = Integer.parseInt(command[2]);
                    if (">".equals(condition)) {
                        for (Integer numb : numbers) {
                            if (numb > number) {
                                System.out.print(numb + " ");
                            }
                        }
                        System.out.println();
                    } else if ("<".equals(condition)) {
                        for (Integer numb : numbers) {
                            if (numb < number) {
                                System.out.print(numb + " ");
                            }
                        }
                        System.out.println();
                    } else if (">=".equals(condition)) {
                        for (Integer numb : numbers) {
                            if (numb >= number) {
                                System.out.print(numb + " ");
                            }
                        }
                        System.out.println();
                    } else if ("<=".equals(condition)) {
                        for (Integer numb : numbers) {
                            if (numb <= number) {
                                System.out.print(numb + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
            }
            input = scanner.nextLine();
        }
    }
}
