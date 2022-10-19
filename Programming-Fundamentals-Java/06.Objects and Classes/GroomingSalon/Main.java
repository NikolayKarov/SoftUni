package ObjectsAndClasses_Exercises.GroomingSalon;

public class Main {
    public static void main(String[] args) {
        GroomingSalon salon = new GroomingSalon(20);

// Initialize entity
        Pet dog = new Pet("Ellias", 5, "Tim");

// Print Pet
        System.out.println(dog);

// Add Pet
        salon.add(dog);

// Remove Pet
        System.out.println(salon.remove("Ellias"));
        System.out.println(salon.remove("Pufa"));

        Pet cat = new Pet("Bella", 2, "Mia");
        Pet bunny = new Pet("Zak", 4, "Jon");

        salon.add(cat);
        salon.add(bunny);

// Get Pet
        Pet pet = salon.getPet("Bella", "Mia");
        System.out.println(pet);

// Count
        System.out.println(salon.getCount());

// Get Statistics
        System.out.println(salon.getStatistics());
    }
}
