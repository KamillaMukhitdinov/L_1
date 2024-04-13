import java.util.Scanner;

public class Pr_8 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        System.out.println(word + ": " + (isAllDigits(word)? "Yes" : "No"));
    }

    public static boolean isAllDigits(String s) {
        if (s.isEmpty()) {
            return true;
        }
        if (Character.isDigit(s.charAt(0))) {
            return isAllDigits(s.substring(1));
        }
        return false;
    }
}