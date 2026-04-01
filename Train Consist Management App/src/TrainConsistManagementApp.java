import java.util.HashSet;
import java.util.Set;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC3: Unique Bogie IDs (HashSet) ===");

        Set<String> bogieIds = new HashSet<>();

        // Add values (with duplicates)
        bogieIds.add("BG101");
        bogieIds.add("BG102");
        bogieIds.add("BG101"); // duplicate
        bogieIds.add("BG103");

        System.out.println("Unique Bogie IDs: " + bogieIds);
    }
}