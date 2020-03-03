package programmers;

import java.util.Arrays;

public class Problem_30_12917 {
    public static void main(String[] args) {
        System.out.println(solution("ZbcCdefg"));
    }
    public static String solution(String s) {
        char[] c = s.toCharArray();
        Character[] chars = new Character[c.length];
        for (int i = 0; i < c.length; i += 1) {
            chars[i] = c[i];
        }
        Arrays.sort(chars, (a, b) -> b - a);
        final StringBuilder sb = new StringBuilder(c.length);
        for (char ch : chars) {
            sb.append(ch);
        }
        return sb.toString();
    }
}
