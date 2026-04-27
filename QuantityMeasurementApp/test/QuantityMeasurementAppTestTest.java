public class QuantityMeasurementAppTest {

    public static void main(String[] args) {

        System.out.println("=== UNIT CONVERSION TESTS START ===");

        testFeetToInches();
        testInchesToFeet();
        testYardsToFeet();
        testInchesToYards();
        testCentimetersToInches();
        testZeroValue();
        testNegativeValue();
        testSameUnitConversion();

        System.out.println("=== ALL TESTS COMPLETED SUCCESSFULLY ===");
    }

    static void testFeetToInches() {
        double result = QuantityMeasurementApp.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        assert result == 12.0 : "Feet to Inches failed";
        System.out.println("PASS: Feet to Inches");
    }

    static void testInchesToFeet() {
        double result = QuantityMeasurementApp.convert(24.0, LengthUnit.INCHES, LengthUnit.FEET);
        assert result == 2.0 : "Inches to Feet failed";
        System.out.println("PASS: Inches to Feet");
    }

    static void testYardsToFeet() {
        double result = QuantityMeasurementApp.convert(3.0, LengthUnit.YARDS, LengthUnit.FEET);
        assert result == 9.0 : "Yards to Feet failed";
        System.out.println("PASS: Yards to Feet");
    }

    static void testInchesToYards() {
        double result = QuantityMeasurementApp.convert(36.0, LengthUnit.INCHES, LengthUnit.YARDS);
        assert result == 1.0 : "Inches to Yards failed";
        System.out.println("PASS: Inches to Yards");
    }

    static void testCentimetersToInches() {
        double result = QuantityMeasurementApp.convert(1.0, LengthUnit.CENTIMETERS, LengthUnit.INCHES);
        assert Math.abs(result - 0.3937) < 0.01 : "CM to Inches failed";
        System.out.println("PASS: Centimeters to Inches");
    }

    static void testZeroValue() {
        double result = QuantityMeasurementApp.convert(0.0, LengthUnit.FEET, LengthUnit.INCHES);
        assert result == 0.0 : "Zero conversion failed";
        System.out.println("PASS: Zero Value");
    }

    static void testNegativeValue() {
        double result = QuantityMeasurementApp.convert(-1.0, LengthUnit.FEET, LengthUnit.INCHES);
        assert result == -12.0 : "Negative conversion failed";
        System.out.println("PASS: Negative Value");
    }

    static void testSameUnitConversion() {
        double result = QuantityMeasurementApp.convert(5.0, LengthUnit.FEET, LengthUnit.FEET);
        assert result == 5.0 : "Same unit conversion failed";
        System.out.println("PASS: Same Unit Conversion");
    }
}