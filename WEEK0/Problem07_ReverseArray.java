import java.util.Scanner;
import java.util.StringJoiner;

public class Problem07_ReverseArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Walk the array from the last index to the first
        StringJoiner result = new StringJoiner(" ");
        for (int i = n - 1; i >= 0; i--) {
            result.add(String.valueOf(arr[i]));
        }

        System.out.println(result);

        sc.close();
    }
}
