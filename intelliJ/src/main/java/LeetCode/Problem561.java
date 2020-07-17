package LeetCode;

public class Problem561 {
    public int arrayPairSum(int[] nums) {
        java.util.Arrays.sort(nums);
        int sum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }
        return sum;
    }
}
