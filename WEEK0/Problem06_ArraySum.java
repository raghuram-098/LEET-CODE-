import java.util.Scanner;

public class Problem06_ArraySum {

    // Adds up every element of the array (long avoids overflow of the total)
    public static long sumOfArray(int[] arr) {
        long sum = 0;
        for (int value : arr) {
            sum += value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(sumOfArray(arr));

        sc.close();
    }
}
