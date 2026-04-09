package uc13;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class UC13Test {

    @Test
    void testTime() {
        List<uc13.CapacityUnit> list = new ArrayList<>();
        for (int i = 0; i < 1000; i++) list.add(new uc13.CapacityUnit(i));

        long start = System.nanoTime();
        list.stream().filter(b -> b.getValue() > 60).toList();
        long end = System.nanoTime();

        assertTrue((end - start) > 0);
    }
}