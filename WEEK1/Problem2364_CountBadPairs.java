import java.util.HashMap;
import java.util.Map;

/**
 * 2364. Count Number of Bad Pairs (Medium)
 * https://leetcode.com/problems/count-number-of-bad-pairs/
 *
 * Approach: j - i == nums[j] - nums[i]  <=>  nums[j] - j == nums[i] - i.
 * Count good pairs with a HashMap and subtract from total pairs.
 * Time: O(n), Space: O(n)
 */
public class P2364_CountBadPairs {

    static class Solution {
        public long countBadPairs(int[] nums) {
            int n = nums.length;
            long totalPairs = (long) n * (n - 1) / 2;
            Map<Integer, Integer> freq = new HashMap<>();
            long goodPairs = 0;
            for (int i = 0; i < n; i++) {
                int key = nums[i] - i;
                int seen = freq.getOrDefault(key, 0);
                goodPairs += seen;
                freq.put(key, seen + 1);
            }
            return totalPairs - goodPairs;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Count Number of Bad Pairs");
        System.out.println(s.countBadPairs(new int[]{4, 1, 3, 3}) + "  expected 5");
        System.out.println(s.countBadPairs(new int[]{1, 2, 3, 4, 5}) + "  expected 0");
    }
}
