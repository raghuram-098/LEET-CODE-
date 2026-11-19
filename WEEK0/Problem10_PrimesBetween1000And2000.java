import java.util.StringJoiner;

public class Problem10_PrimesBetween1000And2000 {

    // Returns true if n is a prime number, false otherwise
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // No input required
        StringJoiner primes = new StringJoiner(" ");
        for (int i = 1000; i <= 2000; i++) {
            if (isPrime(i)) {
                primes.add(String.valueOf(i));
            }
        }

        System.out.println(primes);
    }
}
