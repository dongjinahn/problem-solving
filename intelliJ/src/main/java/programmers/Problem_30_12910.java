package programmers;

import java.util.Collections;
import java.util.Vector;

public class Problem_30_12910 {
    public int[] solution(int[] arr, int divisor) {
        final Vector<Integer> v = new Vector<>(arr.length);
        for (int n : arr) {
            if (n % divisor == 0) {
                v.add(n);
            }
        }

        if (v.size() == 0) {
            return new int[]{-1};
        }
        Collections.sort(v);
        int[] result = new int[v.size()];
        for (int i = 0; i < result.length; i += 1) {
            result[i] = v.get(i);
        }
        return result;
    }

}
