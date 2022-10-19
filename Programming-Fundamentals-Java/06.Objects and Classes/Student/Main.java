package ObjectsAndClasses_Exercises.Students;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudent = Integer.parseInt(scanner.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < countStudent; i++) {
            String[] input = scanner.nextLine().split("\\s+");
            String firstName = input[0];
            String lastName = input[1];
            double grade = Double.parseDouble(input[2]);

            Student student = new Student(firstName,lastName,grade);
            students.add(student);
        }

        students.sort(Comparator.comparing(Student::getGrade).thenComparing(Student::getFirstName));
        Collections.reverse(students);

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
