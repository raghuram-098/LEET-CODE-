import java.util.Scanner;

public class Problem04_PalindromeNumber {

    // Reverses the digits of n, e.g. 121 -> 121
    public static long reverse(long n) {
        long reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed;
    }

    // A palindrome reads the same forwards and backwards
    public static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        if (isPalindrome(n)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        sc.close();
    }
}
