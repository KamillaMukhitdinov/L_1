import java.util.Scanner;

public class Pr_7 {
    
    public static void reverseArray(int[] array, int i)  // Function to reverse the elements of an array (recursive approach)
    {
        if (i < array.length) // Base case: if index reaches the end of the array, stop recursion
        {
            reverseArray(array, i + 1); // Recursive call: print the element at the current index and then call the function again with incremented index to reverse the remaining elements
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number "); // Prompt user to enter the size of the array
        int n = scanner.nextInt();
        int[] array = new int[n]; // Create an integer array of size n
        System.out.println("Enter your array"); // Get user input for each element of the array
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array in reverse order:"); // Print message indicating the reversed order
        reverseArray(array, 0); //Call the reverseArray function to print the array in reverse order

        scanner.close(); // Close the Scanner object to avoid resource leaks
    }
}
