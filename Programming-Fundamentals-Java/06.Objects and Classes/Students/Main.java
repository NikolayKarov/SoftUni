package ObjectsAndClasses_Lab.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();

        while (!input.equals("end")) {
            String[] tokens = input.split("\\s+");

            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String hometown = tokens[3];

            Student student = new Student(firstName, lastName, age, hometown);

            students.add(student);
            input = scanner.nextLine();
        }

        String filterHometown = scanner.nextLine();
        for (Student student : students) {
            if (student.getHometown().equals(filterHometown)) {
                System.out.printf("%s %s is %d years old%n", student.getFirstName(), student.getLastName(),
                        student.getAge(), student.getHometown());
            }
        }
    }
}
