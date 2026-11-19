import java.util.Scanner;
import java.util.StringJoiner;

public class Problem05_FibonacciSeries {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // number of terms

        StringJoiner series = new StringJoiner(" ");
        long first = 0;
        long second = 1;

        for (int i = 0; i < n; i++) {
            series.add(String.valueOf(first));
            long next = first + second;
            first = second;
            second = next;
        }

        System.out.println(series);

        sc.close();
    }
}
