import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array (Easy)
 * https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 *
 * Approach: mark presence by negating nums[value - 1].
 * Time: O(n), Space: O(1) extra
 */
public class P0448_FindAllNumbersDisappeared {

    static class Solution {
        public List<Integer> findDisappearedNumbers(int[] nums) {
            for (int i = 0; i < nums.length; i++) {
                int idx = Math.abs(nums[i]) - 1;
                if (nums[idx] > 0) {
                    nums[idx] = -nums[idx];
                }
            }
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] > 0) {
                    result.add(i + 1);
                }
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Find All Numbers Disappeared in an Array");
        System.out.println(s.findDisappearedNumbers(new int[]{4, 3, 2, 7, 8, 2, 3, 1}) + "  expected [5, 6]");
        System.out.println(s.findDisappearedNumbers(new int[]{1, 1}) + "  expected [2]");
    }
}
