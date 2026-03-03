import java.util.Scanner;

public class UseCase9PalindromeCheckerApp {

    // Recursive function to check palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        // Base case: if start >= end, we reached the middle
        if (start >= end) {
            return true;
        }

        // If characters at start and end are not equal, not a palindrome
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }

        // Recursive call moving towards the center
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = sc.nextLine();

        // Call recursive function
        if (isPalindrome(input, 0, input.length() - 1)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close();
    }
}