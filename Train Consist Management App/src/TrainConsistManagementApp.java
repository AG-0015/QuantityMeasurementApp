import java.util.*;
import java.util.stream.Collectors;

// 🔹 Bogie Class
class Bogie {
    private String type;
    private int capacity;

    public Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return type + " | Capacity: " + capacity;
    }
}

// 🔹 Main Application
public class TrainConsistManagementApp {

    public static void main(String[] args) {

        // 🔸 Step 1: Create list of bogies
        List<Bogie> bogies = new ArrayList<>();

        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("AC Chair", 60));
        bogies.add(new Bogie("Sleeper", 72));
        bogies.add(new Bogie("First Class", 40));
        bogies.add(new Bogie("AC Chair", 60));

        // 🔸 Step 2: Group bogies by type
        Map<String, List<Bogie>> groupedBogies =
                bogies.stream()
                        .collect(Collectors.groupingBy(Bogie::getType));

        // 🔸 Step 3: Display grouped result
        System.out.println("=== Grouped Bogies by Type ===\n");

        groupedBogies.forEach((type, list) -> {
            System.out.println("Bogie Type: " + type);
            list.forEach(b -> System.out.println("  " + b));
            System.out.println();
        });
    }
}