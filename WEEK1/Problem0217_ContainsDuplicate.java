import java.util.HashSet;
import java.util.Set;

/**
 * 217. Contains Duplicate (Easy)
 * https://leetcode.com/problems/contains-duplicate/
 *
 * Approach: HashSet; add() returns false when the value already exists.
 * Time: O(n), Space: O(n)
 */
public class P0217_ContainsDuplicate {

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> seen = new HashSet<>();
            for (int x : nums) {
                if (!seen.add(x)) {
                    return true;
                }
            }
            return false;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Contains Duplicate");
        System.out.println(s.containsDuplicate(new int[]{1, 2, 3, 1}) + "  expected true");
        System.out.println(s.containsDuplicate(new int[]{1, 2, 3, 4}) + "  expected false");
        System.out.println(s.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}) + "  expected true");
    }
}
