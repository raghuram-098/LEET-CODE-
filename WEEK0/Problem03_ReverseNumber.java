import java.util.Scanner;

public class Problem03_ReverseNumber {

    // Reverses the digits of n, e.g. 12345 -> 54321
    public static long reverse(long n) {
        long reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;  // append the last digit of n
            n = n / 10;                         // remove the last digit of n
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(reverse(n));

        sc.close();
    }
}
