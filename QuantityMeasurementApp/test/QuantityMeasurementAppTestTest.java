public class QuantityWeightTest {

    public static void main(String[] args) {

        System.out.println("=== UC9 TEST START ===");

        testEquality();
        testConversion();
        testAddition();
        testAdditionWithTargetUnit();

        System.out.println("=== ALL UC9 TESTS PASSED ===");
    }

    static void testEquality() {
        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight gram = new QuantityWeight(1000.0, WeightUnit.GRAM);

        if (!kg.equals(gram)) {
            throw new AssertionError("Equality failed");
        }

        System.out.println("PASS: Equality");
    }

    static void testConversion() {
        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);

        if (kg.convertTo(WeightUnit.GRAM).getValue() != 1000.0) {
            throw new AssertionError("Conversion failed");
        }

        System.out.println("PASS: Conversion KG → GRAM");
    }

    static void testAddition() {
        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight gram = new QuantityWeight(500.0, WeightUnit.GRAM);

        QuantityWeight result = kg.add(gram);

        if (result.getValue() != 1.5) {
            throw new AssertionError("Addition failed");
        }

        System.out.println("PASS: Addition");
    }

    static void testAdditionWithTargetUnit() {
        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight gram = new QuantityWeight(500.0, WeightUnit.GRAM);

        QuantityWeight result = kg.add(gram, WeightUnit.GRAM);

        if (result.getValue() != 1500.0) {
            throw new AssertionError("Target unit addition failed");
        }

        System.out.println("PASS: Addition with Target Unit");
    }
}