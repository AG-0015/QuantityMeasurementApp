import java.util.*;

// Stack Method
class StackPalindrome {
    public boolean check(String input) {
        String s = input.replaceAll("\\s+", "").toLowerCase();
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray()) {
            stack.push(c);
        }

        for(char c : s.toCharArray()) {
            if(c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}

// Deque Method
class DequePalindrome {
    public boolean check(String input) {
        String s = input.replaceAll("\\s+", "").toLowerCase();
        Deque<Character> deque = new ArrayDeque<>();

        for(char c : s.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

// Two Pointer Method
class TwoPointerPalindrome {
    public boolean check(String input) {
        String s = input.replaceAll("\\s+", "").toLowerCase();

        int start = 0;
        int end = s.length() - 1;

        while(start < end) {
            if(s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Main Class
public class palindromecheckerapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        StackPalindrome stackMethod = new StackPalindrome();
        DequePalindrome dequeMethod = new DequePalindrome();
        TwoPointerPalindrome twoPointerMethod = new TwoPointerPalindrome();

        // Stack timing
        long startTime = System.nanoTime();
        boolean stackResult = stackMethod.check(input);
        long endTime = System.nanoTime();
        long stackTime = endTime - startTime;

        // Deque timing
        startTime = System.nanoTime();
        boolean dequeResult = dequeMethod.check(input);
        endTime = System.nanoTime();
        long dequeTime = endTime - startTime;

        // Two Pointer timing
        startTime = System.nanoTime();
        boolean pointerResult = twoPointerMethod.check(input);
        endTime = System.nanoTime();
        long pointerTime = endTime - startTime;

        System.out.println("\nResults:");
        System.out.println("Stack Method: " + stackResult + " | Time: " + stackTime + " ns");
        System.out.println("Deque Method: " + dequeResult + " | Time: " + dequeTime + " ns");
        System.out.println("Two Pointer Method: " + pointerResult + " | Time: " + pointerTime + " ns");

        sc.close();
    }
}