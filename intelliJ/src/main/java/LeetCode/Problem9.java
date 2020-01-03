package LeetCode;

import java.util.Arrays;

public class Problem9 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            // by 문제
            return false;
        }
        if (x == 0) {
            // special case
            return true;
        }
        int numLength = 0;
        int[] arr = new int[10]; // 21억까지 있으니까 10자리 안넘음

        while (x != 0) {
            arr[numLength] = x % 10;
            numLength += 1;
            x /= 10;
        }

        for (int i = 0; i < numLength / 2; i += 1) {
            if (arr[i] != arr[numLength - 1 - i]) {
                // 하나라도 다르면 회문 아님
                return false;
            }
        }
        return true;
    }

}
