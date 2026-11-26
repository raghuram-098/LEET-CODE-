import java.util.ArrayList;
import java.util.List;

/**
 * 229. Majority Element II (Medium)
 * https://leetcode.com/problems/majority-element-ii/
 *
 * Approach: Boyer-Moore voting with two candidates, then verify counts.
 * Time: O(n), Space: O(1)
 */
public class P0229_MajorityElementII {

    static class Solution {
        public List<Integer> majorityElement(int[] nums) {
            int cand1 = 0, cand2 = 1;
            int count1 = 0, count2 = 0;

            for (int x : nums) {
                if (x == cand1) {
                    count1++;
                } else if (x == cand2) {
                    count2++;
                } else if (count1 == 0) {
                    cand1 = x;
                    count1 = 1;
                } else if (count2 == 0) {
                    cand2 = x;
                    count2 = 1;
                } else {
                    count1--;
                    count2--;
                }
            }

            count1 = 0;
            count2 = 0;
            for (int x : nums) {
                if (x == cand1) count1++;
                else if (x == cand2) count2++;
            }

            List<Integer> result = new ArrayList<>();
            int n = nums.length;
            if (count1 > n / 3) result.add(cand1);
            if (count2 > n / 3) result.add(cand2);
            return result;
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("Majority Element II");
        System.out.println(s.majorityElement(new int[]{3, 2, 3}) + "  expected [3]");
        System.out.println(s.majorityElement(new int[]{1}) + "  expected [1]");
        System.out.println(s.majorityElement(new int[]{1, 2}) + "  expected [1, 2]");
    }
}
