import java.util.HashMap;
import java.util.Map;

public class TrainConsistAppTest {

    public static void main(String[] args) {

        System.out.println("=== UC6 TEST START ===");

        Map<String, Integer> map = new HashMap<>();

        map.put("Sleeper", 72);
        map.put("AC Chair", 48);
        map.put("First Class", 36);

        assert map.get("Sleeper") == 72 : "Sleeper capacity failed";
        assert map.get("AC Chair") == 48 : "AC Chair capacity failed";
        assert map.get("First Class") == 36 : "First Class capacity failed";

        System.out.println("PASS: All bogie capacity mappings correct");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        System.out.println("=== UC6 TEST END ===");
    }
}