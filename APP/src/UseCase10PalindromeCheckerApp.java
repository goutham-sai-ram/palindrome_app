import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it is a palindrome (case-insensitive, spaces ignored): ");
        String input = sc.nextLine();

        // Normalize the string: remove spaces & punctuation, convert to lowercase
        String normalized = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Check palindrome
        if (isPalindrome(normalized)) {
            System.out.println("\"" + input + "\" is a palindrome.");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome.");
        }

        sc.close();
    }
}