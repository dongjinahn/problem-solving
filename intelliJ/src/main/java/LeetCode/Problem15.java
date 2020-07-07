package LeetCode;

import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Problem15 {

    public List<List<Integer>> threeSum(int[] nums) {
        final List<List<Integer>> ans = new Vector<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i += 1) {
            if (i == 0 || nums[i - 1] < nums[i]) {
                int low = i + 1;
                int high = nums.length - 1;
                final int a = nums[i];
                while (low < high) {
                    final int b = nums[low];
                    final int c = nums[high];
                    final int sum = a + b + c;
                    if (sum == 0) {
                        final Vector<Integer> v = new Vector<>();
                        v.add(a);
                        v.add(b);
                        v.add(c);
                        ans.add(v);
                        low += 1;
                        high -= 1;

                        while (low < high && nums[low - 1] == nums[low]) {
                            low += 1;
                        }
                        while (low < high && nums[high + 1] == nums[high]) {
                            high -= 1;
                        }
                    } else if (sum < 0) {
                        low += 1;
                    } else {
                        high -= 1;
                    }
                }
            }

        }

        return ans;
    }
}
