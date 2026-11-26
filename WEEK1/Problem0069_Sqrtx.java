/**
 * 69. Sqrt(x) (Easy)
 * https://leetcode.com/problems/sqrtx/
 *
 * Approach: binary search for the largest mid with mid * mid <= x
 * (written as mid <= x / mid to avoid int overflow).
 * Time: O(log x), Space: O(1)
 */
public class P0069_Sqrtx {

    static class Solution {
        public int mySqrt(int x) {
            if (x < 2) return x;
            int low = 1, high = x / 2;
            int ans = 0;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (mid <= x / mid) {
                    ans = mid;
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return ans;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Sqrt(x)");
        System.out.println(s.mySqrt(4) + "  expected 2");
        System.out.println(s.mySqrt(8) + "  expected 2");
        System.out.println(s.mySqrt(Integer.MAX_VALUE) + "  expected 46340");
    }
}
