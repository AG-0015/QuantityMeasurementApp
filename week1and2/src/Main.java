import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class week1and2 {

    // Thread-safe map for existing usernames
    private final ConcurrentHashMap<String, Integer> usernames = new ConcurrentHashMap<>();

    // Thread-safe map to count attempted usernames
    private final ConcurrentHashMap<String, AtomicInteger> attempts = new ConcurrentHashMap<>();

    // Check if a username is available
    public boolean checkAvailability(String username) {
        // Increment attempt count atomically
        attempts.computeIfAbsent(username, k -> new AtomicInteger(0)).incrementAndGet();
        return !usernames.containsKey(username);
    }

    // Suggest alternative usernames
    public List<String> suggestAlternatives(String username) {
        List<String> suggestions = new ArrayList<>();
        // Append numbers 1-3
        for (int i = 1; i <= 3; i++) {
            String alt = username + i;
            if (!usernames.containsKey(alt)) suggestions.add(alt);
        }
        // Replace underscores with dots
        String altDot = username.replace("_", ".");
        if (!usernames.containsKey(altDot)) suggestions.add(altDot);

        return suggestions;
    }

    // Get the most attempted username
    public String getMostAttempted() {
        return attempts.entrySet()
                .stream()
                .max(Comparator.comparingInt(e -> e.getValue().get()))
                .map(Map.Entry::getKey)
                .orElse(null);
    }

    // For testing
    public static void main(String[] args) {
        UsernameChecker checker = new UsernameChecker();
        checker.usernames.put("john_doe", 1);
        checker.usernames.put("admin", 100);

        System.out.println(checker.checkAvailability("john_doe"));   // false
        System.out.println(checker.checkAvailability("jane_smith")); // true
        System.out.println(checker.suggestAlternatives("john_doe")); // [john_doe1, john_doe2, john_doe3, john.doe]
        System.out.println(checker.getMostAttempted());              // john_doe
    }
}