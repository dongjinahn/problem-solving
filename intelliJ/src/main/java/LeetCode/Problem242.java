package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem242 {
    public boolean isAnagram(String s, String t) {
        return Arrays.equals(getCharCountArray(s), getCharCountArray(t));
    }

    private int[] getCharCountArray(String s) {
        final int[] arr = new int[26];
        for (char ch : s.toCharArray()) {
            final int index = 97 - ch;
            arr[index] = arr[index] + 1;
        }
        return arr;
    }
}
