public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("=== Unit Conversion Demo ===");

        System.out.println("1 FEET → INCHES = " +
                convert(1.0, LengthUnit.FEET, LengthUnit.INCHES));

        System.out.println("3 YARDS → FEET = " +
                convert(3.0, LengthUnit.YARDS, LengthUnit.FEET));

        System.out.println("36 INCHES → YARDS = " +
                convert(36.0, LengthUnit.INCHES, LengthUnit.YARDS));

        System.out.println("1 CENTIMETER → INCHES = " +
                convert(1.0, LengthUnit.CENTIMETERS, LengthUnit.INCHES));

        System.out.println("0 FEET → INCHES = " +
                convert(0.0, LengthUnit.FEET, LengthUnit.INCHES));
    }

    public static double convert(double value,
                                 LengthUnit source,
                                 LengthUnit target) {

        if (!Double.isFinite(value) || source == null || target == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        double valueInFeet = value * source.getConversionFactor();
        return valueInFeet / target.getConversionFactor();
    }
}