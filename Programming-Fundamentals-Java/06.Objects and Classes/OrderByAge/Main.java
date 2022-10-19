package ObjectsAndClasses_Exercises.OrderByAge;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Person> personList = new ArrayList<>();

        while (!input.equals("End")) {
            String[] personData = input.split("\\s+");
            String name = personData[0];
            int id = Integer.parseInt(personData[1]);
            int age = Integer.parseInt(personData[2]);

            Person person = new Person(name, id, age);
            personList.add(person);

            input = scanner.nextLine();
        }

        List<Person> filteredPerson = new ArrayList<>(personList);
        filteredPerson.sort(Comparator.comparing(Person::getAge));
        for (Person persons : filteredPerson) {
            System.out.printf("%s with ID: %d is %d years old.%n", persons.getName(), persons.getId(), persons.getAge());
        }
    }
}
