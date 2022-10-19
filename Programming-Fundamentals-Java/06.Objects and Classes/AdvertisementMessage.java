package ObjectsAndClasses_Exercises;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        String[] phrases = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};

        String[] events = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};

        String[] authors = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};

        String[] cities = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};

        Random random = new Random();

        for (int i = 0; i < number; i++) {
            int randomIndexPhrases = random.nextInt(6);
            int randomIndexEvents = random.nextInt(6);
            int randomIndexAuthors = random.nextInt(8);
            int randomIndexCities = random.nextInt(5);

            System.out.println(phrases[randomIndexPhrases] + " " + events[randomIndexEvents] + " " + authors[randomIndexAuthors] + " - " + cities[randomIndexCities]);
        }
    }
}
