import java.util.Scanner;

public class Problem13_FactorialRecursive {

    // Recursive definition: 0! = 1 and n! = n * (n - 1)!
    // long can hold factorials up to 20!; larger values overflow.
    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(factorial(n));

        sc.close();
    }
}
