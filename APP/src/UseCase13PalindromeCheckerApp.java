import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class UseCase13PalindromeCheckerApp {

    // String Reverse Method
    public static boolean stringReverse(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return text.equals(reversed);
    }

    // Stack Method
    public static boolean stackMethod(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) if (c != stack.pop()) return false;
        return true;
    }

    // Deque Method
    public static boolean dequeMethod(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) deque.addLast(c);
        while (deque.size() > 1)
            if (!deque.removeFirst().equals(deque.removeLast())) return false;
        return true;
    }

    // Recursive Method
    public static boolean recursiveMethod(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return recursiveMethod(text, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String testString = "abccba"; // You can modify or take input dynamically

        System.out.println("Performance comparison for string: " + testString);

        long start, end;

        // String Reverse
        start = System.nanoTime();
        stringReverse(testString);
        end = System.nanoTime();
        System.out.println("String Reverse method: " + (end - start) + " ns");

        // Stack
        start = System.nanoTime();
        stackMethod(testString);
        end = System.nanoTime();
        System.out.println("Stack method: " + (end - start) + " ns");

        // Deque
        start = System.nanoTime();
        dequeMethod(testString);
        end = System.nanoTime();
        System.out.println("Deque method: " + (end - start) + " ns");

        // Recursive
        start = System.nanoTime();
        recursiveMethod(testString, 0, testString.length() - 1);
        end = System.nanoTime();
        System.out.println("Recursive method: " + (end - start) + " ns");
    }
}