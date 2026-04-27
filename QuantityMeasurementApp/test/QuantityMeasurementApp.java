public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("=== UC7: ADDITION WITH TARGET UNIT ===");

        QuantityLength result1 = add(new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.FEET);
        System.out.println("1 FEET + 12 INCHES in FEET = " + result1);

        QuantityLength result2 = add(new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.INCHES);
        System.out.println("1 FEET + 12 INCHES in INCHES = " + result2);

        QuantityLength result3 = add(new QuantityLength(1.0, LengthUnit.FEET),
                new QuantityLength(12.0, LengthUnit.INCHES),
                LengthUnit.YARDS);
        System.out.println("1 FEET + 12 INCHES in YARDS = " + result3);
    }

    public static QuantityLength add(QuantityLength l1,
                                     QuantityLength l2,
                                     LengthUnit targetUnit) {

        if (l1 == null || l2 == null || targetUnit == null) {
            throw new IllegalArgumentException("Invalid input");
        }

        double value1 = l1.toBaseUnit(); // FEET
        double value2 = l2.toBaseUnit();

        double sum = value1 + value2;

        double resultValue = sum / targetUnit.getConversionFactor();

        return new QuantityLength(resultValue, targetUnit);
    }
}