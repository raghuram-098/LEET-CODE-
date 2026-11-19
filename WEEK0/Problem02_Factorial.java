import java.util.Scanner;

public class Problem02_Factorial {

    // Iterative computation of n!
    // long can hold factorials up to 20! (2432902008176640000); larger values overflow.
    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));

        sc.close();
    }
}
