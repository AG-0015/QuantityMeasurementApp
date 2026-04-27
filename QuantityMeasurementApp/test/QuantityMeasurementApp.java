public class QuantityMeasurementApp {

    public static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            // Same reference
            if (this == obj) {
                return true;
            }

            // Null check
            if (obj == null) {
                return false;
            }

            // Type check
            if (this.getClass() != obj.getClass()) {
                return false;
            }

            // Cast
            Feet other = (Feet) obj;

            // Compare values safely
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // Optional main method (for manual run)
    public static void main(String[] args) {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Equal: " + f1.equals(f2));
    }
}