public class QuantityMeasurementAppTest {

    public static void main(String[] args) {

        System.out.println("=== TEST START ===");

        testEquality();
        testConversion();
        testAddition();

        System.out.println("=== TEST PASS ===");
    }

    static void testEquality() {
        QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(12.0, LengthUnit.INCHES);

        if (!a.equals(b)) {
            throw new AssertionError("Equality failed");
        }

        System.out.println("PASS: Equality");
    }

    static void testConversion() {
        QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);

        if (a.convertTo(LengthUnit.INCHES).getValue() != 12.0) {
            throw new AssertionError("Conversion failed");

        System.out.println("PASS: Conversion");
    }

    static void testAddition() {
        QuantityLength a = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength b = new QuantityLength(12.0, LengthUnit.INCHES);

        if (a.add(b).getValue() != 2.0) {
            throw new AssertionError("Addition failed");
        }

        System.out.println("PASS: Addition");
    }
}