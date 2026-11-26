import java.util.Arrays;

/**
 * 2523. Closest Prime Numbers in Range (Medium)
 * https://leetcode.com/problems/closest-prime-numbers-in-range/
 *
 * Approach: sieve up to right, then scan consecutive primes for the smallest gap.
 * Time: O(right log log right), Space: O(right)
 */
public class P2523_ClosestPrimesInRange {

    static class Solution {
        public int[] closestPrimes(int left, int right) {
            boolean[] composite = new boolean[right + 1];
            for (int i = 2; (long) i * i <= right; i++) {
                if (!composite[i]) {
                    for (int j = i * i; j <= right; j += i) {
                        composite[j] = true;
                    }
                }
            }

            int prev = -1;
            int minGap = Integer.MAX_VALUE;
            int[] ans = {-1, -1};
            for (int i = Math.max(left, 2); i <= right; i++) {
                if (!composite[i]) {
                    if (prev != -1 && i - prev < minGap) {
                        minGap = i - prev;
                        ans[0] = prev;
                        ans[1] = i;
                    }
                    prev = i;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Closest Prime Numbers in Range");
        System.out.println(Arrays.toString(s.closestPrimes(10, 19)) + "  expected [11, 13]");
        System.out.println(Arrays.toString(s.closestPrimes(4, 6)) + "  expected [-1, -1]");
    }
}
