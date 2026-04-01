// Palindrome service class
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }

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
}


// Main Application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "radar";

        // Create object of PalindromeChecker
        PalindromeChecker checker = new PalindromeChecker();

        boolean result = checker.checkPalindrome(word);

        if (result) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }
}