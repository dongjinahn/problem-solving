package LeetCode;

import java.util.Arrays;
import java.util.TreeMap;

public class Problem1365 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3})));
    }
    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] myNums = Arrays.copyOf(nums, nums.length);
        Arrays.sort(myNums);

        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i += 1) {
            int num = nums[i];
            int index = Arrays.binarySearch(myNums, num);
            while (index != 0 && myNums[index] == myNums[index - 1]) {
                index -= 1;
            }
            res[i] = index;
        }
        return res;
    }
}
