import java.util.Scanner;

public class Pr_10 {

    public static void reverseArray(int[] array, int i)
    {
        if (i < array.length) {
            reverseArray(array, i + 1); // Recursive call to process next element
            System.out.print(array[i] + " "); // This line prints in the original order, not reversed
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

        System.out.print("Enter number  "); // Prompt the user to enter the size of the array
        int n = scanner.nextInt();

        int[] array = new int[n]; // Create an integer array of size n to store the elements
        System.out.println("Enter array"); // Get the elements of the array from the user
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1)); // Print a message for each element
            array[i] = scanner.nextInt();
        }

        System.out.println("Array in reverse order:"); // Print a message indicating the reversal
        reverseArray(array, 0); // Pass the array and starting index (0)

        scanner.close();
    }
}
