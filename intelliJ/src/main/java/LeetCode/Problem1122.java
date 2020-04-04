package LeetCode;

import java.util.*;

public class Problem1122 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(relativeSortArray(new int[]{2,21,43,38,0,42,33,7,24,13,12,27,12,24,5,23,29,48,30,31}, new int[]{2,42,38,0,43,21})));
    }

    public static int[] relativeSortArray(int[] arr1, int[] arr2) {
        final Set<Integer> s = new TreeSet<>();
        final Map<Integer, Integer> m = new HashMap<>();
        for (int num : arr1) {
            if (m.containsKey(num)) {
                m.put(num, m.get(num) + 1);
            } else {
                m.put(num, 1);
            }
            s.add(num);
        }

        int i = 0;
        final int[] res = new int[arr1.length];
        for (int value : arr2) {
            int count = m.get(value);
            s.remove(value);
            for (int j = 0; j < count;) {
                res[i] = value;
                j += 1;
                i += 1;
            }
        }

        for (int value : s) {
            int count = m.get(value);
            for (int j = 0; j < count; ) {
                res[i] = value;
                i += 1;
                j += 1;
            }
        }

        return res;
    }
}
