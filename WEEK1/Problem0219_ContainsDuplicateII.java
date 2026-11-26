import java.util.HashMap;
import java.util.Map;

/**
 * 219. Contains Duplicate II (Easy)
 * https://leetcode.com/problems/contains-duplicate-ii/
 *
 * Approach: HashMap of value -> most recent index.
 * Time: O(n), Space: O(n)
 */
public class P0219_ContainsDuplicateII {

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> lastIndex = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                Integer prev = lastIndex.get(nums[i]);
                if (prev != null && i - prev <= k) {
                    return true;
                }
                lastIndex.put(nums[i], i);
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Contains Duplicate II");
        System.out.println(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3) + "  expected true");
        System.out.println(s.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1) + "  expected true");
        System.out.println(s.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2) + "  expected false");
    }
}
