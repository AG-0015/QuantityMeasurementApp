import java.util.*;

public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "AmanaplanacanalPanamaAmanaplanacanalPanama";

        // Normalize
        String input = word.toLowerCase();

        // Reverse String Approach
        long startTime1 = System.nanoTime();
        boolean result1 = reverseStringMethod(input);
        long endTime1 = System.nanoTime();

        // Two Pointer Approach
        long startTime2 = System.nanoTime();
        boolean result2 = twoPointerMethod(input);
        long endTime2 = System.nanoTime();

        // Stack Approach
        long startTime3 = System.nanoTime();
        boolean result3 = stackMethod(input);
        long endTime3 = System.nanoTime();

        System.out.println("Reverse String Result: " + result1 +
                " | Time: " + (endTime1 - startTime1) + " ns");

        System.out.println("Two Pointer Result: " + result2 +
                " | Time: " + (endTime2 - startTime2) + " ns");

        System.out.println("Stack Result: " + result3 +
                " | Time: " + (endTime3 - startTime3) + " ns");
    }


    // Method 1: Reverse String
    public static boolean reverseStringMethod(String input) {

        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }


    // Method 2: Two Pointer
    public static boolean twoPointerMethod(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    // Method 3: Stack
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}