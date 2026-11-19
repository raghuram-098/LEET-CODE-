import java.util.Scanner;

public class Problem12_SumOfAllDigits {

    // Adds up all digits of an integer, e.g. 4567 -> 22
    public static long sumOfDigits(long n) {
        n = Math.abs(n);   // handle negative input as well
        long sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
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
