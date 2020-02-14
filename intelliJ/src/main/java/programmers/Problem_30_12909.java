package programmers;

import java.util.Stack;

public class Problem_30_12909 {
    boolean solution(String str) {
        Stack<Character> s = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                s.push(ch);
                continue;
            }

            if (s.isEmpty()) {
                return false;
            }

            if (s.peek() == '(') {
                s.pop();
            }
        }
        return s.isEmpty();
    }
}
