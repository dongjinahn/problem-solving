package LeetCode;

import java.util.Arrays;
import java.util.HashMap;

public class Problem1636 {
    public int[] frequencySort(int[] nums) {
        final HashMap<Integer, Integer> m = new HashMap<>();

        for (final int n : nums) {
            if (m.containsKey(n)) {
                m.put(n, m.get(n) + 1);
            } else {
                m.put(n, 1);
            }
        }
        return Arrays.stream(nums).boxed().sorted((a, b) -> {
            final int aCount = m.get(a);
            final int bCount = m.get(b);
            if (aCount == bCount) {
                return b - a;
            }
            return aCount - bCount;
        }).mapToInt(i -> i).toArray();
    }

}
