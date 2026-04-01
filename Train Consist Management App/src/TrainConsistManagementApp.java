import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String name;
    int capacity;

    public Bogie(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%-15s : %d seats", name, capacity);
    }
}

public class TrainConsistApp {
    public static void main(String[] args) {
        // 1. Initialize the Bogie List (As in UC7)
        List<Bogie> allBogies = new ArrayList<>();
        allBogies.add(new Bogie("Sleeper", 72));
        allBogies.add(new Bogie("AC Chair", 56));
        allBogies.add(new Bogie("First Class", 24));
        allBogies.add(new Bogie("General", 90));
        allBogies.add(new Bogie("Deccan Queen", 78));

        System.out.println("All Available Bogies:");
        allBogies.forEach(System.out::println);

        // 2. Apply Stream Filtering Logic
        // Business Rule: Select only High-Capacity bogies (Capacity > 60)
        int threshold = 60;

        List<Bogie> highCapacityBogies = allBogies.stream()
                .filter(b -> b.capacity > threshold) // Filter condition
                .collect(Collectors.toList());        // Gather results into a new list

        // 3. Display Results
        System.out.println("\n--- High Capacity Bogies (> " + threshold + " seats) ---");
        if (highCapacityBogies.isEmpty()) {
            System.out.println("No bogies match the criteria.");
        } else {
            highCapacityBogies.forEach(System.out::println);
        }

        // 4. Verify Original Integrity
        System.out.println("\n(Verification) Original list size remains: " + allBogies.size());
    }
}