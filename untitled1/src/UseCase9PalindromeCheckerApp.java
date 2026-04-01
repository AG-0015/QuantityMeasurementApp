public class UseCase9PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "level";

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }
    }

    // Recursive method
    public static boolean isPalindrome(String str, int start, int end) {

        // Base condition: If pointers cross or meet
        if (start >= end) {
            return true;
        }

        // If characters don't match
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call for inner substring
        return isPalindrome(str, start + 1, end - 1);
    }
}