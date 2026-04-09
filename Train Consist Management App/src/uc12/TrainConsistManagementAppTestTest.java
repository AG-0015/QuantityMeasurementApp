package uc13;

import java.util.*;

class CapacityUnit {
    int value;

    CapacityUnit(int v) { value = v; }

    int getValue() { return value; }
}

public class TrainConsistManagementAppTestTest {
    public static void main(String[] args) {

        List<CapacityUnit> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) list.add(new CapacityUnit(i));

        long start = System.nanoTime();
        list.stream().filter(b -> b.getValue() > 60).toList();
        long end = System.nanoTime();

        System.out.println("Time: " + (end - start));
    }
}