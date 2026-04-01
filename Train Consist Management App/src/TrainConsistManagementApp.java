import java.util.*;

class Bogie {
    String name;
    int capacity;

    // Constructor
    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    // Overriding toString for easy printing
    @Override
    public String toString() {
        return String.format("%-15s : %d seats", name, capacity);
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // 1. Create a List to store Bogie objects
        List<Bogie> bogies = new ArrayList<>();

        // 2. Add different types of bogies
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 56));
        bogies.add(new Bogie("First Class", 24));
        bogies.add(new Bogie("General", 90));

        System.out.println("--- Before Sorting ---");
        bogies.forEach(System.out::println);

        // 3. Apply Comparator to sort by capacity (Ascending)
        // For Descending, use: Comparator.comparingInt((Bogie b) -> b.capacity).reversed()
        bogies.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println("\n--- Sorted by Capacity (Ascending) ---");
        // 4. Display sorted results
        for (Bogie b : bogies) {
            System.out.println(b);
        }
    }
}