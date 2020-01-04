package LeetCode;

import java.util.Arrays;

public class Problem88 {
    public static void main(String[] args) {
        int[] nums1 = {4, 5, 6, 0, 0, 0};
        int m = 3;
        int[] num2 = {1, 2, 3};
        int n = 3;

        merge(nums1, m, num2, n);
        System.out.println(Arrays.toString(nums1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        int ai = 0;
        int bi = 0;
        for (int i = 0; i < m; i += 1) {
            int a = nums1[ai];
            int b = nums2[bi];

            if (a == b) {
                ai += 1;
            } else if (a > b) {
                nums1[ai] = b;
                nums2[bi] = a;
                Arrays.sort(nums2);
                ai += 1;
            } else {
                ai += 1;
            }
        }

        for (int i = 0; i < n; i += 1) {
            nums1[ai] = nums2[bi];
            ai += 1;
            bi += 1;
        }
    }
}
