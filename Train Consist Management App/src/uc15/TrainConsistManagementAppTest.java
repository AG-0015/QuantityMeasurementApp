package uc15;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UC15Test {

    @Test
    void testNoCrash() {
        TransportUnit t = new TransportUnit("Rectangular");
        assertDoesNotThrow(() -> t.assign("Petroleum"));
    }
}