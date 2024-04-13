import java.util.Scanner;

public class Pr_5 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner (System.in);
        System.out.println("Enter number ");
        int n = scan.nextInt();

        System.out.println(Fibonacci(n));
    }

    public static int Fibonacci (int n){
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return Fibonacci(n - 2) + Fibonacci(n - 1);
    }
}
