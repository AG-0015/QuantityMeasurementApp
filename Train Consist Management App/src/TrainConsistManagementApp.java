package uc11;

import java.util.regex.*;

public class TrainConsistManagementApp {
    public static void main(String[] args) {

        String train = "TRN-1234";

        boolean valid = Pattern.matches("TRN-\\d{4}", train);

        System.out.println("Valid: " + valid);
    }
}