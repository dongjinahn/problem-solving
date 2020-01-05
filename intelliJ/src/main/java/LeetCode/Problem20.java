package LeetCode;

import java.util.Stack;

public class Problem20 {
    public static void main(String[] args) {
        System.out.println(isValid("["));
    }

    public static boolean isValid(String s) {
        final Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (isStart(ch)) {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (stack.peek() == getMatch(ch)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isStart(char ch) {
        return ch == '[' || ch == '{' || ch == '(';
    }

    private static char getMatch(char ch) {
        if (ch == ']') {
            return '[';
        } else if (ch == '}') {
            return '{';
        }
        return '(';
    }
}
