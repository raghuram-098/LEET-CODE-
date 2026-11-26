/**
 * 1512. Number of Good Pairs (Easy)
 * https://leetcode.com/problems/number-of-good-pairs/
 *
 * Approach: frequency array; each earlier equal value forms one pair.
 * Time: O(n), Space: O(1)
 */
public class P1512_NumberOfGoodPairs {

    static class Solution {
        public int numIdenticalPairs(int[] nums) {
            int[] freq = new int[101];
            int count = 0;
            for (int x : nums) {
                count += freq[x];
                freq[x]++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Number of Good Pairs");
        System.out.println(s.numIdenticalPairs(new int[]{1, 2, 3, 1, 1, 3}) + "  expected 4");
        System.out.println(s.numIdenticalPairs(new int[]{1, 1, 1, 1}) + "  expected 6");
        System.out.println(s.numIdenticalPairs(new int[]{1, 2, 3}) + "  expected 0");
    }
}
