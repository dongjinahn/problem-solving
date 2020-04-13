package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class Problem1346 {
    public static void main(String[] args) {
        System.out.println(checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));
    }

    private static int[] getDoubles(int a) {
        if (a % 2 == 0) {
            return new int[]{a * 2, a / 2};
        } else {
            return new int[]{a * 2};
        }
    }

    public static boolean checkIfExist(int[] arr) {
        final Set<Integer> s = new HashSet<>(arr.length);
        for (int num : arr) {
            int[] doubles = getDoubles(num);
            for (int d : doubles) {
                if (s.contains(d)) {
                    return true;
                }
            }
            s.add(num);
        }
        return false;
    }
}
