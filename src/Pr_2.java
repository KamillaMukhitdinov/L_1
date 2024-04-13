import java.util.Scanner;
public class Pr_2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the length of your array ");
        int n = scan.nextInt();
        System.out.println("Enter your array ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        System.out.println("The average of numbers is " + sum(arr, n) / n);


    }

    public static float sum (int[] arr, int n) {
        if(n == 1)
            return arr[0];

        return (arr[n - 1] + sum (arr, n-1));

    }
}
