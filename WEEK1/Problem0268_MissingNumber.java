/**
 * 268. Missing Number (Easy)
 * https://leetcode.com/problems/missing-number/
 *
 * Approach: expected sum 0..n minus actual sum.
 * Time: O(n), Space: O(1)
 */
public class P0268_MissingNumber {

    static class Solution {
        public int missingNumber(int[] nums) {
            int n = nums.length;
            int expected = n * (n + 1) / 2;
            int actual = 0;
            for (int x : nums) {
                actual += x;
            }
            return expected - actual;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Missing Number");
        System.out.println(s.missingNumber(new int[]{3, 0, 1}) + "  expected 2");
        System.out.println(s.missingNumber(new int[]{0, 1}) + "  expected 2");
        System.out.println(s.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1}) + "  expected 8");
    }
}
