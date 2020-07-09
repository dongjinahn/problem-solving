package LeetCode;

import java.util.Arrays;

public class Problem506 {
    public String[] findRelativeRanks(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);

        final int first = copy[copy.length - 1];

        int second = -1;
        if (copy.length >= 2) {
            second = copy[copy.length - 2];
        }
        int third = -1;
        if (copy.length >= 3) {
            third = copy[copy.length - 3];
        }


        final String[] ans = new String[nums.length];
        for (int i = 0; i < nums.length; i += 1) {
            final int num = nums[i];
            if (num == first) {
                ans[i] = "Gold Medal";
                continue;
            }
            if (num == second) {
                ans[i] = "Silver Medal";
                continue;
            }
            if (num == third) {
                ans[i] = "Bronze Medal";
                continue;
            }
            final int index = Arrays.binarySearch(copy, num);
            ans[i] = String.valueOf(index + 1);
        }

        return ans;
    }
}
