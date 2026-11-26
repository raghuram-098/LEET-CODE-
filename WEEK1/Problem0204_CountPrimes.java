/**
 * 204. Count Primes (Medium)
 * https://leetcode.com/problems/count-primes/
 *
 * Approach: Sieve of Eratosthenes.
 * Time: O(n log log n), Space: O(n)
 */
public class P0204_CountPrimes {

    static class Solution {
        public int countPrimes(int n) {
            if (n < 3) return 0;
            boolean[] composite = new boolean[n];
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (!composite[i]) {
                    count++;
                    if ((long) i * i < n) {
                        for (int j = i * i; j < n; j += i) {
                            composite[j] = true;
                        }
                    }
                }
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Count Primes");
        System.out.println(s.countPrimes(10) + "  expected 4");
        System.out.println(s.countPrimes(0) + "  expected 0");
        System.out.println(s.countPrimes(1) + "  expected 0");
    }
}
