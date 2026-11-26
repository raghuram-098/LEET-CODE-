import java.util.Arrays;

/**
 * 167. Two Sum II - Input Array Is Sorted (Medium)
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 *
 * Approach: two pointers on the sorted array (1-indexed answer).
 * Time: O(n), Space: O(1)
 */
public class P0167_TwoSumII {

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0, right = numbers.length - 1;
            while (left < right) {
                int sum = numbers[left] + numbers[right];
                if (sum == target) {
                    return new int[]{left + 1, right + 1};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{};
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Two Sum II - Input Array Is Sorted");
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 7, 11, 15}, 9)) + "  expected [1, 2]");
        System.out.println(Arrays.toString(s.twoSum(new int[]{2, 3, 4}, 6)) + "  expected [1, 3]");
        System.out.println(Arrays.toString(s.twoSum(new int[]{-1, 0}, -1)) + "  expected [1, 2]");
    }
}
