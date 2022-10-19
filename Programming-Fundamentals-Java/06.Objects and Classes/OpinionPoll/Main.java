package ObjectsAndClasses_Exercises.OpinionPoll;

import java.util.*;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int persons = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 0; i < persons; i++) {
            String[] personsData = scanner.nextLine().split("\\s+");
            String personName = personsData[0];
            int personAge = Integer.parseInt(personsData[1]);

            Person person = new Person(personName, personAge);
            personList.add(person);
        }
        List<Person> filteredPersons = personList.stream().filter(person -> person.getAge() > 30).collect(Collectors.toList());

        for (Person person : filteredPersons) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

