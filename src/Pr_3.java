import java.util.Scanner;

public class Pr_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scan.nextInt();

        if (check_prime(number, 2)) // Call check_prime to see if number is prime
            System.out.println("Prime");
        else
            System.out.println("Composite");

    }

    public static boolean check_prime(int number, int prime_num){
        if(number == prime_num) // Base case: Reached the potential prime factor
            return true;
        else if(number % prime_num == 0) // Divisible by current prime_num, not prime
            return false;
        else
             return check_prime(number, prime_num + 1); // Recursive call with next prime
        }
    }

