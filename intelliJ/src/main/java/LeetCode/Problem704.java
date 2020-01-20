package LeetCode;

import java.util.Arrays;

public class Problem704 {
    public int search(int[] nums, int target) {
        final int targetIndex = Arrays.binarySearch(nums, target);
        final boolean isOutOfBound = targetIndex < 0 || targetIndex >= nums.length;
        if (isOutOfBound) {
            return -1;
        }
        final int foundTarget = nums[targetIndex];
        return foundTarget == target ? targetIndex : -1;
    }
}
