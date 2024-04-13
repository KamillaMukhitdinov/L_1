import java.util.Scanner;

public class Pr_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); // Scanner object to read user input
        String word = scan.next(); // Prompt user to enter a word

        System.out.println(word + ": " + (isAllDigits(word)? "Yes" : "No")); // Check if the word contains only digits and print the result
    }

    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) // Base case 1: empty string is considered all digits
        {
            return true;
        }
        if (Character.isDigit(s.charAt(0))) // Check if the first character is a digit
        {
            return isAllDigits(s.substring(1)); // Recursively call isAllDigits for the remaining part of the string
        }
        return false; // If the first character is not a digit, the word does not consist only of digits
    }
}