import java.util.Scanner;

public class Pr_7 {
    
    public static void reverseArray(int[] array, int i) {
        if (i < array.length) {
            reverseArray(array, i + 1);
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number  ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Enter your array");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        System.out.println("Array in reverse order:");
        reverseArray(array, 0);

        scanner.close();
    }
}
