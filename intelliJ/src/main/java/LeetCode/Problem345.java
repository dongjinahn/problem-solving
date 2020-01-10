package LeetCode;

import java.util.Stack;

public class Problem345 {
    public String reverseVowels(String s) {
        final Stack<Character> stack = new Stack<>();
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                stack.push(ch);
            }
        }

        final StringBuilder sb = new StringBuilder(s.length());
        for (char ch : s.toCharArray()) {
            if (isVowel(ch)) {
                sb.append(stack.pop());
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    private boolean isVowel(char ch) {
        return (ch == 'a') || (ch == 'e') || (ch == 'i') || (ch == 'o') || (ch == 'u') ||
                (ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U');
    }
}
