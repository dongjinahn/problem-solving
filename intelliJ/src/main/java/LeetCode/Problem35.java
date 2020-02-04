package LeetCode;

import java.util.Arrays;

public class Problem35 {
    public int searchInsert(int[] nums, int target) {
        final int a = Arrays.binarySearch(nums, target);
        if (a < 0) {
            return -a - 1;
        } else {
            return a;
        }
    }
}
