package LeetCode;

import java.util.*;

public class Problem315 {
    public static void main(String[] args) {
        System.out.println(countSmaller(new int[]{5, 2, 6, 1}));
    }
    public static List<Integer> countSmaller(int[] nums) {
        List<Integer> res = new LinkedList<>();
        Vector<Integer> traversed = new Vector<>();

        for (int i = nums.length - 1; i >= 0; i -= 1) {
            int num = nums[i];
            int index = Collections.binarySearch(traversed, num);
            if (index < 0) {
                res.add(0, -index - 1);
            } else {
                if (traversed.get(index) != num) {
                    res.add(0, index - 1);
                } else {
                    int indexCopy = index;
                    while (indexCopy > 0 && traversed.get(indexCopy).equals(traversed.get(indexCopy - 1))) {
                        indexCopy -= 1;
                    }
                    res.add(0, indexCopy);
                }
            }

            if (index < 0) {
                traversed.insertElementAt(num, -index - 1);
            } else {
                traversed.insertElementAt(num, index);
            }
        }
        return res;
    }
    public static List<Integer> countSmaller2(int[] nums) {
        Vector<Integer> v = new Vector<>();
        for (int i = 0; i < nums.length; i += 1) {
            int count = 0;
            int a = nums[i];
            for (int j = i + 1; j < nums.length; j += 1) {
                int b = nums[j];
                if (b < a) {
                    count += 1;
                }
            }
            v.add(count);
        }
        return v;
    }
}
