import java.util.Scanner;

public class Pr_5 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in); // Scanner object to read user input
        System.out.println("Enter number "); // Prompt user to enter a number
        int n = scan.nextInt();

        System.out.println(Fibonacci(n)); // Call the Fibonacci method to calculate the nth Fibonacci number
    }

    public static int Fibonacci (int n){
        if (n == 0) // Base case 1: 0th Fibonacci number is 0
            return 0;
        if (n == 1) //Base case 2: 1st Fibonacci number is 1
            return 1;

        return Fibonacci(n - 2) + Fibonacci(n - 1); // Recursive case: nth Fibonacci number is (n-1)th + (n-2)th Fibonacci number
    }
}
