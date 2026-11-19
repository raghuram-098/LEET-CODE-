import java.util.Scanner;

public class Problem08_SumOfDigits {

    // Adds up the digits of a positive number, e.g. 12345 -> 15
    public static long sumOfDigits(long n) {
        long sum = 0;
        while (n > 0) {
            sum += n % 10;   // add the last digit
            n = n / 10;      // drop the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(sumOfDigits(n));

        sc.close();
    }
}
