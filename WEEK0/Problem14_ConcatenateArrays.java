import java.util.Scanner;
import java.util.StringJoiner;

public class Problem14_ConcatenateArrays {

    // Reads an array in the format: size, then size space-separated integers
    public static int[] readArray(Scanner sc) {
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    // Returns a new array containing all elements of first followed by all elements of second
    public static int[] concatenate(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        System.arraycopy(first, 0, result, 0, first.length);
        System.arraycopy(second, 0, result, first.length, second.length);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] first = readArray(sc);
        int[] second = readArray(sc);
        int[] combined = concatenate(first, second);

        StringJoiner output = new StringJoiner(" ");
        for (int value : combined) {
            output.add(String.valueOf(value));
        }

        System.out.println(output);

        sc.close();
    }
}
