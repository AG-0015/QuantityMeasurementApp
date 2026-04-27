public class QuantityMeasurementAppTest {

    public static void main(String[] args) {

        System.out.println("=== TESTS START ===");

        testFeetToInches();
        testYardsToFeet();
        testInchesToYards();
        testCentimetersToInches();
        testZeroConversion();

        System.out.println("=== TESTS FINISHED ===");
    }

    static void testFeetToInches() {
        double result = QuantityMeasurementApp.convert(1.0, LengthUnit.FEET, LengthUnit.INCHES);
        assert result == 12.0 : "Feet to Inches failed";
        System.out.println("testFeetToInches PASSED");
    }

    static void testYardsToFeet() {
        double result = QuantityMeasurementApp.convert(3.0, LengthUnit.YARDS, LengthUnit.FEET);
        assert result == 9.0 : "Yards to Feet failed";
        System.out.println("testYardsToFeet PASSED");
    }

    static void testInchesToYards() {
        double result = QuantityMeasurementApp.convert(36.0, LengthUnit.INCHES, LengthUnit.YARDS);
        assert result == 1.0 : "Inches to Yards failed";
        System.out.println("testInchesToYards PASSED");
    }

    static void testCentimetersToInches() {
        double result = QuantityMeasurementApp.convert(1.0, LengthUnit.CENTIMETERS, LengthUnit.INCHES);
        assert Math.abs(result - 0.3937) < 0.01 : "CM to Inches failed";
        System.out.println("testCentimetersToInches PASSED");
    }

    static void testZeroConversion() {
        double result = QuantityMeasurementApp.convert(0.0, LengthUnit.FEET, LengthUnit.INCHES);
        assert result == 0.0 : "Zero conversion failed";
        System.out.println("testZeroConversion PASSED");
    }
}