package LeetCode;

import java.util.HashMap;

public class Problem75 {
    public void sortColors(int[] nums) {
        final HashMap<Integer, Integer> map = new HashMap<>();
        for (final int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int i = 0;
        for (int j = 0; j < map.getOrDefault(0, 0); j += 1) {
            nums[i] = 0;
            i += 1;
        }
        for (int j = 0; j < map.getOrDefault(1, 0); j += 1) {
            nums[i] = 1;
            i += 1;
        }
        for (int j = 0; j < map.getOrDefault(2, 0); j += 1) {
            nums[i] = 2;
            i += 1;
        }
    }
}
