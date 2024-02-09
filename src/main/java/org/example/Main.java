package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The entered string is a palindrome.");
        } else {
            System.out.println("The entered string is not a palindrome.");
        }

        scanner.close();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Removing non-alphanumeric characters and converting to lowercase
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int length = cleanedStr.length();
        for (int i = 0; i < length / 2; i++) {
            if (cleanedStr.charAt(i) != cleanedStr.charAt(length - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}