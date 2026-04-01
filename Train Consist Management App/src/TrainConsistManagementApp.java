import java.util.ArrayList;
import java.util.List;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== UC2: Passenger Bogies (ArrayList) ===");

        List<String> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add("Sleeper");
        passengerBogies.add("AC Chair");
        passengerBogies.add("First Class");

        System.out.println("After adding bogies: " + passengerBogies);

        // Remove one bogie
        passengerBogies.remove("AC Chair");
        System.out.println("After removing AC Chair: " + passengerBogies);

        // Check existence
        System.out.println("Is Sleeper present? " + passengerBogies.contains("Sleeper"));
    }
}