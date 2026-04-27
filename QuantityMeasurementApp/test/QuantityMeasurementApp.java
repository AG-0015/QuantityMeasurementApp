public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("=== UC8 LENGTH MEASUREMENT APP ===");

        QuantityLength feet = new QuantityLength(1.0, LengthUnit.FEET);
        QuantityLength inches = new QuantityLength(12.0, LengthUnit.INCHES);
        QuantityLength yards = new QuantityLength(3.0, LengthUnit.FEET);

        // Equality
        System.out.println("\n--- EQUALITY ---");
        System.out.println("1 FEET == 12 INCHES : " + feet.equals(inches));

        // Conversion
        System.out.println("\n--- CONVERSION ---");
        System.out.println("1 FEET to INCHES = " +
                feet.convertTo(LengthUnit.INCHES).getValue());

        System.out.println("1 FEET to CENTIMETERS = " +
                feet.convertTo(LengthUnit.CENTIMETERS).getValue());

        // Addition (default unit)
        System.out.println("\n--- ADDITION (DEFAULT UNIT) ---");
        QuantityLength sum1 = feet.add(inches);
        System.out.println("1 FEET + 12 INCHES = " +
                sum1.getValue() + " " + sum1.getUnit());

        // Addition (explicit target unit)
        System.out.println("\n--- ADDITION (TARGET UNIT) ---");
        QuantityLength sum2 = feet.add(inches, LengthUnit.YARDS);
        System.out.println("Result in YARDS = " + sum2.getValue());

        // Extra case
        System.out.println("\n--- EXTRA ---");
        QuantityLength sum3 = yards.add(feet, LengthUnit.FEET);
        System.out.println("3 FEET + 1 FEET = " +
                sum3.getValue() + " FEET");

        System.out.println("\n=== END UC8 MAIN ===");
    }
}