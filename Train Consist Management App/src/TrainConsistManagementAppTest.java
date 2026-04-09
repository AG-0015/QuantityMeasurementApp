package uc12;

import java.util.*;

class CargoUnit {
    String type;
    String cargo;

    CargoUnit(String t, String c) {
        type = t;
        cargo = c;
    }
}

public class TrainConsistManagementAppTest {
    public static void main(String[] args) {

        List<CargoUnit> list = Arrays.asList(
                new CargoUnit("Cylindrical", "Petroleum"),
                new CargoUnit("Rectangular", "Coal")
        );

        boolean safe = list.stream()
                .allMatch(b -> !b.type.equals("Cylindrical") || b.cargo.equals("Petroleum"));

        System.out.println("Safe: " + safe);
    }
}