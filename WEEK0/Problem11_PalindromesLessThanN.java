import java.util.Scanner;
import java.util.StringJoiner;

public class Problem11_PalindromesLessThanN {

    // Reverses the digits of n, e.g. 151 -> 151
    public static long reverse(long n) {
        long reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n = n / 10;
        }
        return reversed;
    }

    public static boolean isPalindrome(long n) {
        return n == reverse(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // Check every positive integer strictly less than n
        StringJoiner palindromes = new StringJoiner(" ");
        for (int i = 1; i < n; i++) {
            if (isPalindrome(i)) {
                palindromes.add(String.valueOf(i));
            }
        }

        System.out.println(palindromes);

        sc.close();
    }
}
