/**
 * 53. Maximum Subarray (Medium)
 * https://leetcode.com/problems/maximum-subarray/
 *
 * Approach: Kadane's algorithm.
 * Time: O(n), Space: O(1)
 */
public class P0053_MaximumSubarray {

    static class Solution {
        public int maxSubArray(int[] nums) {
            int current = nums[0];
            int best = nums[0];
            for (int i = 1; i < nums.length; i++) {
                current = Math.max(nums[i], current + nums[i]);
                best = Math.max(best, current);
            }
            return best;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Maximum Subarray");
        System.out.println(s.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}) + "  expected 6");
        System.out.println(s.maxSubArray(new int[]{1}) + "  expected 1");
        System.out.println(s.maxSubArray(new int[]{5, 4, -1, 7, 8}) + "  expected 23");
    }
}
