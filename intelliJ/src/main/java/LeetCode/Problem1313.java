package LeetCode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

public class Problem1313 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(decompressRLElist(new int[]{1, 2, 3, 4})));
    }
    public static int[] decompressRLElist(int[] nums) {
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j += 1) {
                v.add(nums[i + 1]);
            }
        }
        int[] res = new int[v.size()];
        for (int i = 0; i < v.size(); i += 1) {
            res[i] = v.get(i);
        }
        return res;
    }
}
