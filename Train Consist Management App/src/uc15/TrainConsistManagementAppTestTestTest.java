package uc15;

class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String msg) { super(msg); }
}

class TransportUnit {
    String type;

    TransportUnit(String t) { type = t; }

    void assign(String cargo) {
        try {
            if (type.equals("Rectangular") && cargo.equals("Petroleum"))
                throw new CargoSafetyException("Unsafe");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}

public class TrainConsistManagementAppTestTestTest {
    public static void main(String[] args) {
        new TransportUnit("Rectangular").assign("Petroleum");
    }
}