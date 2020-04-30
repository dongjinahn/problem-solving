package LeetCode;

import java.util.*;

public class Problem989 {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{1, 2, 0, 0}, 34));
    }

    public static List<Integer> addToArrayForm(int[] A, int K) {
        int[] B = new int[String.valueOf(K).length()];
        int bIndex = B.length - 1;
        while (K > 0) {
            B[bIndex] = K % 10;
            K = K / 10;
            bIndex -= 1;
        }

        int aIndex = A.length - 1;
        bIndex = B.length - 1;

        List<Integer> l = new LinkedList<>();

        int carry = 0;
        while (true) {
            int a = aIndex == - 1 ? 0 : A[aIndex];
            int b = bIndex == - 1 ? 0 : B[bIndex];

            int tempRes = a + b + carry;
            if (tempRes >= 10) {
                carry = 1;
            } else {
                carry = 0;
            }
            l.add(0, tempRes % 10);

            if (aIndex != -1) {
                aIndex -= 1;
            }
            if (bIndex != -1) {
                bIndex -= 1;
            }
            if (bIndex == -1 && aIndex == -1) {
                break;
            }
        }
        if (carry == 1) {
            l.add(0, 1);
        }
        return l;
    }
}
