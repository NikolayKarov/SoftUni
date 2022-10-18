package ObjectsAndClasses_Lab.StudentsAdvanced;

import ObjectsAndClasses_Lab.Students.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        String input = scanner.nextLine();
        while (!input.equals("end")) {
            String[] tokens = input.split(" ");
            String firstName = tokens[0];
            String lastName = tokens[1];
            int age = Integer.parseInt(tokens[2]);
            String town = tokens[3];

            if (isStudentExisting(students, firstName, lastName)) {

            } else {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            }
            if (isStudentExisting(students, firstName, lastName)) {
                Student student = getStudent(students, firstName, lastName);

                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(town);
            }
            Student student = students.stream().filter(s -> s.getFirstName().equals(firstName) && s.getLastName().equals(lastName)).findFirst().orElse(null);
            if (student == null) {
                Student studentToAdd = new Student(firstName, lastName, age, town);
                studentToAdd.setFirstName(firstName);
                studentToAdd.setLastName(lastName);
                studentToAdd.setAge(age);
                studentToAdd.setHometown(town);
                students.add(studentToAdd);
            } else {
                student.setFirstName(firstName);
                student.setLastName(lastName);
                student.setAge(age);
                student.setHometown(town);
            }
            input = scanner.nextLine();
        }
        String city = scanner.nextLine();
        List<Student> filteredStudents =
                students.stream().filter(s -> s.getHometown().equals(city)).collect(Collectors.toList());
        for (Student filteredStudent : filteredStudents) {
            System.out.printf("%s %s is %d years old%n", filteredStudent.getFirstName(), filteredStudent.getLastName(),
                    filteredStudent.getAge());
        }
    }

    private static boolean isStudentExisting(List<Student> students, String firstName, String lastName) {
        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                return true;
            }
        }
        return false;
    }

    private static Student getStudent(List<Student> students, String firstName, String lastName) {
        Student existingStudent = null;

        for (Student student : students) {
            if (student.getFirstName().equals(firstName) && student.getLastName().equals(lastName)) {
                existingStudent = student;
            }
        }
        return existingStudent;
    }
}