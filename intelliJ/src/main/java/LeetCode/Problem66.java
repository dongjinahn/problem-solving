package LeetCode;

import java.util.Arrays;
import java.util.Vector;

public class Problem66 {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(digitToArray(120)));
//        System.out.println(arrayToDigit(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0}));
//        System.out.println(arrayToDigit(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

        System.out.println(Arrays.toString(plusOne(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1, 0})));
    }

    public static int[] plusOne(int[] digits) {
        final Vector<Integer> v = new Vector<>();

        final int lastDigit = digits[digits.length - 1];
        boolean hasCarry = lastDigit == 9;
        if (hasCarry) {
            v.add(0, 0);
        } else {
            v.add(0, lastDigit + 1);
        }


        for (int i = digits.length - 2; i >= 0; i -= 1) {
            final int n = digits[i];
            if (hasCarry && n == 9) {
                v.add(0, 0);
            } else if (hasCarry) {
                v.add(0, n + 1);
                hasCarry = false;
            } else {
                v.add(0, n);
                hasCarry = false;
            }
        }
        if (hasCarry) {
            v.add(0, 1);
        }

        final int[] res = new int[v.size()];
        for (int i = 0; i < v.size(); i += 1) {
            res[i] = v.get(i);
        }
        return res;
    }
}
