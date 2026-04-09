package uc12;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class UC12Test {

    @Test
    void testSafety() {
        List<uc12.CargoUnit> list = Arrays.asList(
                new uc12.CargoUnit("Cylindrical", "Petroleum")
        );

        boolean safe = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        assertTrue(safe);
    }
}