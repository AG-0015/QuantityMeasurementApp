public class QuantityMeasurementAppTestTest {

    public static void main(String[] args) {

        System.out.println("=== UC7 FULL TEST SUITE START ===");

        test_FeetPlusInches_Feet();
        test_FeetPlusInches_Inches();
        test_FeetPlusInches_Yards();
        test_YardsPlusFeet_Yards();
        test_CentimetersPlusInches_Centimeters();
        test_ZeroValues();
        test_NegativeValues();
        test_MixedConversions();

        System.out.println("=== ALL UC7 TESTS PASSED SUCCESSFULLY ===");
    }

    // 1. 1 FEET + 12 INCHES = 2 FEET
    static void test_FeetPlusInches_Feet() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.FEET);

        assert Math.abs(result.toBaseUnit() - 2.0) < 0.0001;

        System.out.println("PASS: Feet + Inches → Feet");
    }

    // 2. 1 FEET + 12 INCHES = 24 INCHES
    static void test_FeetPlusInches_Inches() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.INCHES);

        double expected = 24.0 * LengthUnit.INCHES.getConversionFactor();
        assert Math.abs(result.toBaseUnit() - expected) < 0.0001;

        System.out.println("PASS: Feet + Inches → Inches");
    }

    // 3. 1 FEET + 12 INCHES = ~0.667 YARDS
    static void test_FeetPlusInches_Yards() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS);

        assert Math.abs(result.toBaseUnit() - (2.0 / 3.0)) < 0.01;

        System.out.println("PASS: Feet + Inches → Yards");
    }

    // 4. 1 YARD + 3 FEET = 2 YARDS
    static void test_YardsPlusFeet_Yards() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(1.0, LengthUnit.YARDS),
                new QuantityLength(3.0, LengthUnit.FEET),
                LengthUnit.YARDS);

        assert Math.abs(result.toBaseUnit() - 2.0) < 0.0001;

        System.out.println("PASS: Yards + Feet → Yards");
    }

    // 5. 2 CM + 1 INCH = ~5.08 CM
    static void test_CentimetersPlusInches_Centimeters() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(2.54, LengthUnit.CENTIMETERS),
                new QuantityLength(1.0, LengthUnit.INCHES),
                LengthUnit.CENTIMETERS);

        assert Math.abs(result.toBaseUnit() - 5.08 * LengthUnit.CENTIMETERS.getConversionFactor()) < 0.01;

        System.out.println("PASS: CM + Inches → CM");
    }

    // 6. Zero values
    static void test_ZeroValues() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(5.0, LengthUnit.FEET),
                new QuantityLength(0.0, LengthUnit.INCHES),
                LengthUnit.YARDS);

        assert result != null;

        System.out.println("PASS: Zero Values");
    }

    // 7. Negative values
    static void test_NegativeValues() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(5.0, LengthUnit.FEET),
                new QuantityLength(-2.0, LengthUnit.FEET),
                LengthUnit.INCHES);

        assert Math.abs(result.toBaseUnit() - 36.0 * LengthUnit.INCHES.getConversionFactor()) < 0.0001;

        System.out.println("PASS: Negative Values");
    }

    // 8. Mixed conversions stress test
    static void test_MixedConversions() {
        QuantityLength result = QuantityMeasurementApp.add(
                new QuantityLength(10.0, LengthUnit.INCHES),
                new QuantityLength(2.0, LengthUnit.FEET),
                LengthUnit.YARDS);

        assert result != null;

        System.out.println("PASS: Mixed Conversions");
    }
}