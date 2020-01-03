package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem1 {
    public static void main(String[] args) {
        int[] a = {2, 7, 11, 15};

        System.out.println(Arrays.toString(twoSum(a, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        final Map<Integer, Integer> m = new HashMap<>(); // key = num, value = index
        for (int i = 0; i < nums.length; i += 1) {
            int num = nums[i];
            if (m.containsKey(target - num)) {
                return new int[]{m.get(target - num), i};
            }
            m.put(num, i);
        }
        return null;
    }
}
