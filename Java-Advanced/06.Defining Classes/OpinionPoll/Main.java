package OpinionPoll;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            String personalData = scanner.nextLine();
            String name = personalData.split("\\s+")[0];
            int age = Integer.parseInt(personalData.split("\\s+")[1]);

            Person person = new Person(name, age);

            if (age > 30) {
                personList.add(person);

            }
        }
        personList.sort(Comparator.comparing(Person::getName));
        for (Person person : personList) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}
