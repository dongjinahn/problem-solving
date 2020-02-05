package LeetCode;

import java.util.Arrays;

public class Problem27 {
    public static void main(String[] args) {
//        int[] t1 = {3, 2, 2, 3};
        int[] t1 = {2, 2, 3};
        int length = removeElement(t1, 2);
        System.out.println(length);
        System.out.println(Arrays.toString(t1));
    }
    public static int removeElement(int[] nums, int val) {
        int i = 0;
        int n = nums.length;
        while (i < n) {
            if (nums[i] == val) {
                nums[i] = nums[n - 1];
                n -= 1;
            } else {
                i += 1;
            }
        }
        return n;
    }
}
