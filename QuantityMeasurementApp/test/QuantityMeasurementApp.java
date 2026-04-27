import java.util.HashMap;
import java.util.Map;

public class TrainConsistApp {

    public static void main(String[] args) {

        System.out.println("=== TRAIN CONSIST MANAGEMENT (UC6) ===");

        // Step 1: Create HashMap (Bogie -> Capacity)
        Map<String, Integer> bogieCapacityMap = new HashMap<>();

        // Step 2: Insert bogies with capacities
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair", 48);
        bogieCapacityMap.put("First Class", 36);
        bogieCapacityMap.put("Goods - Rectangular", 10000);
        bogieCapacityMap.put("Goods - Cylindrical", 8000);

        // Step 3: Display all entries using entrySet()
        System.out.println("\n--- Bogie Capacity Details ---");

        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie: " + entry.getKey()
                    + " | Capacity: " + entry.getValue());
        }

        System.out.println("\n=== END OF PROGRAM ===");
    }
}