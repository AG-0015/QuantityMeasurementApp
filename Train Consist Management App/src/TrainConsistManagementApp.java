import java.util.*;
import java.util.stream.*;

class Bogie {
    int capacity;

    Bogie(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }
}

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        List<Bogie> bogies = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            bogies.add(new Bogie(i % 100));
        }

        long start1 = System.nanoTime();

        List<Bogie> result1 = new ArrayList<>();
        for (Bogie b : bogies) {
            if (b.getCapacity() > 60) {
                result1.add(b);
            }
        }

        long end1 = System.nanoTime();

        long start2 = System.nanoTime();

        List<Bogie> result2 = bogies.stream()
                .filter(b -> b.getCapacity() > 60)
                .collect(Collectors.toList());

        long end2 = System.nanoTime();

        System.out.println("Loop Time: " + (end1 - start1));
        System.out.println("Stream Time: " + (end2 - start2));
    }
}