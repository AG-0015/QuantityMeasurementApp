public class QuantityMeasurementApp {

    public static void main(String[] args) {

        System.out.println("=== UC9 WEIGHT MEASUREMENT APP ===");

        QuantityWeight kg = new QuantityWeight(1.0, WeightUnit.KILOGRAM);
        QuantityWeight gram = new QuantityWeight(1000.0, WeightUnit.GRAM);
        QuantityWeight pound = new QuantityWeight(2.20462, WeightUnit.POUND);

        // 1. Equality
        System.out.println("\n--- EQUALITY ---");
        System.out.println("1 KG == 1000 GRAM : " + kg.equals(gram));
        System.out.println("1 KG == 2.20462 POUND : " + kg.equals(pound));

        // 2. Conversion
        System.out.println("\n--- CONVERSION ---");
        System.out.println("1 KG to GRAM = " + kg.convertTo(WeightUnit.GRAM).getValue());
        System.out.println("1 KG to POUND = " + kg.convertTo(WeightUnit.POUND).getValue());

        // 3. Addition (default unit)
        System.out.println("\n--- ADDITION (DEFAULT UNIT) ---");
        QuantityWeight sum1 = kg.add(new QuantityWeight(500.0, WeightUnit.GRAM));
        System.out.println("1 KG + 500 GRAM = " + sum1.getValue() + " " + sum1.getUnit());

        // 4. Addition (explicit target unit)
        System.out.println("\n--- ADDITION (TARGET UNIT) ---");
        QuantityWeight sum2 = kg.add(
                new QuantityWeight(500.0, WeightUnit.GRAM),
                WeightUnit.GRAM
        );
        System.out.println("Result in GRAM = " + sum2.getValue());

        System.out.println("\n=== END UC9 MAIN ===");
    }
}