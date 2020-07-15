package LeetCode;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;

public class Problem599 {
    public String[] findRestaurant(String[] list1, String[] list2) {
        final HashMap<String, Integer> m = new HashMap<>();
        int index = 0;
        for (final String s : list1) {
            m.put(s, index);
            index += 1;
        }

        Vector<String> answer = new Vector<>();
        int indexSum = Integer.MAX_VALUE;

        index = 0;
        for (final String s : list2) {
            if (!m.containsKey(s)) {
                index += 1;
                continue;
            }
            final int index1 = m.get(s);
            final int tempSum = index1 + index;
            if (tempSum == indexSum) {
                answer.add(s);
            } else if (tempSum < indexSum) {
                answer = new Vector<>();
                answer.add(s);
                indexSum = tempSum;
            }
            index += 1;
        }

        final String[] a = new String[answer.size()];
        for (int i = 0; i < a.length; i += 1) {
            a[i] = answer.get(i);
        }
        return a;
    }
}
