import java.util.Scanner;
public class Pr_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of your array ");  // Prompt user to enter the array length
        int n = scan.nextInt();
        System.out.println("Enter your array ");  // Create an integer array to store the elements
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) // Loop to get integer values from the user and store them in the array
            arr[i] = scan.nextInt();

        System.out.println("The average of numbers is " + sum(arr, n) / n); // Calculate and print the average of the array elements (corrected calculation)


    }

    public static float sum (int[] arr, int n) {
        if(n == 1)  // Base case: If there's only one element, return it (sum is itself)
            return arr[0];

        return (arr[n - 1] + sum (arr, n-1)); // Recursive case: Add the last element to the sum

    }
}
