package LeetCode;

import java.util.Vector;

public class Problem1389 {
    public static int[] createTargetArray(int[] nums, int[] indices) {
        final Vector<Integer> v = new Vector<>();

        for (int i = 0; i < nums.length; i += 1) {
            v.insertElementAt(nums[i], indices[i]);
        }

        final int[] res = new int[v.size()];
        for (int i = 0; i < v.size(); i += 1) {
            res[i] = v.get(i);
        }
        return res;
    }
}
