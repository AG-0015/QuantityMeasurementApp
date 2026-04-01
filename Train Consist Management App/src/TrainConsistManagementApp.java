import java.util.HashMap;
import java.util.Map;

public class TrainConsistManagementApp {
    public static void main(String[] args) {
        // Create a HashMap to store bogie names as keys and capacities as values
        HashMap<String, Integer> bogieCapacityMap = new HashMap<>();

        // Use put() method to map each bogie to its capacity
        bogieCapacityMap.put("Sleeper", 72);
        bogieCapacityMap.put("AC Chair Car", 78);
        bogieCapacityMap.put("First Class", 24);
        bogieCapacityMap.put("General", 90);
        bogieCapacityMap.put("Pantry Car", 0);

        // Display the bogie-capacity mapping
        System.out.println("--- Train Bogie Capacity Mapping ---");

        // Iterate over the map using entrySet() to display keys and values
        for (Map.Entry<String, Integer> entry : bogieCapacityMap.entrySet()) {
            System.out.println("Bogie Type: " + entry.getKey() + " | Capacity: " + entry.getValue() + " seats");
        }
    }
}