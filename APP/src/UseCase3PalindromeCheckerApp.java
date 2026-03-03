import java.util.Scanner;

public class UseCase3PalindromeCheckerApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask the user for a string
        System.out.print("Enter a string to check if it is a palindrome: ");
        String original = sc.nextLine();

        // Initialize an empty string to hold the reversed value
        String reversed = "";

        // Reverse the string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a palindrome.");
        } else {
            System.out.println(original + " is not a palindrome.");
        }

        sc.close();
    }
}
