/**
 * 41. First Missing Positive (Hard)
 * https://leetcode.com/problems/first-missing-positive/
 *
 * Approach: cyclic placement, put value v at index v - 1, then find first mismatch.
 * Time: O(n), Space: O(1)
 */
public class P0041_FirstMissingPositive {

    static class Solution {
        public int firstMissingPositive(int[] nums) {
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                while (nums[i] > 0 && nums[i] <= n && nums[nums[i] - 1] != nums[i]) {
                    int target = nums[i] - 1;
                    int temp = nums[target];
                    nums[target] = nums[i];
                    nums[i] = temp;
                }
            }
            for (int i = 0; i < n; i++) {
                if (nums[i] != i + 1) {
                    return i + 1;
                }
            }
            return n + 1;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("First Missing Positive");
        System.out.println(s.firstMissingPositive(new int[]{1, 2, 0}) + "  expected 3");
        System.out.println(s.firstMissingPositive(new int[]{3, 4, -1, 1}) + "  expected 2");
        System.out.println(s.firstMissingPositive(new int[]{7, 8, 9, 11, 12}) + "  expected 1");
    }
}
