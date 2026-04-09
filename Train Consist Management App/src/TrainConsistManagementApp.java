import java.util.*;
import java.util.stream.Collectors;

class Bogie {
    String type;
    int capacity;

    Bogie(String type, int capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> list = Arrays.asList(
                new Bogie("Sleeper", 72),
                new Bogie("Sleeper", 80),
                new Bogie("AC Chair", 60)
        );

        Map<String, List<Bogie>> grouped =
                list.stream().collect(Collectors.groupingBy(Bogie::getType));

        System.out.println(grouped);
    }
}