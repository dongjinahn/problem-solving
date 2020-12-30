package LeetCode;


import java.util.Arrays;

public class Problem1470 {
    public int[] shuffle(int[] nums, int n) {
        int[] a = Arrays.copyOfRange(nums, 0, nums.length / 2);
        int[] b = Arrays.copyOfRange(nums, nums.length / 2, nums.length);

        int j = 0;
        for (int i = 0; i < nums.length / 2; i += 1) {
            nums[j] = a[i];
            j += 1;
            nums[j] = b[i];
            j += 1;
        }
        return nums;
    }
}
