import java.util.Scanner;

public class Problem09_SumOfEvenPositionDigits {

    // Positions are counted from right to left, with the rightmost digit at position 1.
    // Example: 123456 -> digits at even positions are 5, 3, 1 -> sum 9
    public static long sumOfEvenPositionDigits(long n) {
        long sum = 0;
        int position = 1;
        while (n > 0) {
            long digit = n % 10;
            if (position % 2 == 0) {
                sum += digit;
            }
            n = n / 10;
            position++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        System.out.println(sumOfEvenPositionDigits(n));

        sc.close();
    }
}
