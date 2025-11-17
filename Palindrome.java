import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String str = sc.nextLine();

        String reverse = new StringBuilder(str).reverse().toString();

        if (str.equalsIgnoreCase(reverse)) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is NOT a palindrome.");
        }
    }
}
