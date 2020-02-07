package programmers.skillcheck1;

import java.util.Arrays;

public class Problem1 {
    public static void main(String[] args) {
        solution("Zbcdefg");
    }
    public static String solution(String s) {
        final char[] arr = s.toCharArray();
        Arrays.sort(arr);

        final StringBuilder sb = new StringBuilder(s.length());
        for (char ch : arr) {
            sb.insert(0, ch);
        }
        return sb.toString();
    }
}
