import java.util.Scanner;

public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for input
        System.out.print("Enter a string to check if it is a palindrome: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] chars = input.toCharArray();

        // Two-pointer approach
        boolean isPalindrome = true;
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Print the result
        if (isPalindrome) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }

        sc.close();
    }
}
