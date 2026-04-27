package uc10;

import org.junit.jupiter.api.Test;
import uc15.SeatUnit;

import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class UC10Test {

    @Test
    void testReduce() {
        List<SeatUnit> list = Arrays.asList(
                new SeatUnit(72),
                new SeatUnit(60)
        );

        int total = list.stream()
                .map(SeatUnit::getCapacity)
                .reduce(0, Integer::sum);

        assertEquals(132, total);
    }
}