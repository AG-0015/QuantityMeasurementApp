package uc11;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class UC11Test {

    @Test
    void testValid() {
        assertTrue("TRN-1234".matches("TRN-\\d{4}"));
    }

    @Test
    void testInvalid() {
        assertFalse("TRN123".matches("TRN-\\d{4}"));
    }
}