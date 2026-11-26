/**
 * 918. Maximum Sum Circular Subarray (Medium)
 * https://leetcode.com/problems/maximum-sum-circular-subarray/
 *
 * Approach: max(Kadane max, total - Kadane min); all-negative case returns Kadane max.
 * Time: O(n), Space: O(1)
 */
public class P0918_MaxSumCircularSubarray {

    static class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int total = 0;
            int curMax = 0, bestMax = nums[0];
            int curMin = 0, bestMin = nums[0];
            for (int x : nums) {
                curMax = Math.max(x, curMax + x);
                bestMax = Math.max(bestMax, curMax);
                curMin = Math.min(x, curMin + x);
                bestMin = Math.min(bestMin, curMin);
                total += x;
            }
            if (bestMax < 0) return bestMax;
            return Math.max(bestMax, total - bestMin);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Maximum Sum Circular Subarray");
        System.out.println(s.maxSubarraySumCircular(new int[]{1, -2, 3, -2}) + "  expected 3");
        System.out.println(s.maxSubarraySumCircular(new int[]{5, -3, 5}) + "  expected 10");
        System.out.println(s.maxSubarraySumCircular(new int[]{-3, -2, -3}) + "  expected -2");
    }
}
