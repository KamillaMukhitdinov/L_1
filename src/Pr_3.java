import java.util.Scanner;

public class Pr_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your number");
        int number = scan.nextInt();

        if (check_prime(number, 2))
            System.out.println("Prime");
        else
            System.out.println("Composite");

    }

    public static boolean check_prime(int number, int prime_num){
        if(number == prime_num)
            return true;
        else if(number % prime_num == 0)
            return false;
        else
             return check_prime(number, prime_num + 1);
        }
    }

