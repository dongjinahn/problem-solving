package LeetCode;

import java.util.Stack;

public class Problem155 {
    public static void main(String[] args) {

    }

    private static class MinStack {
        private int min;
        private int minCount;
        private final Stack<Integer> stack;

        /** initialize your data structure here. */
        public MinStack() {
            min = Integer.MAX_VALUE;
            minCount = 0;
            stack = new Stack<>();
        }

        public void push(int x) {
            if (x < min) {
                min = x;
                minCount = 1;
            } else if (x == min) {
                minCount += 1;
            }
            stack.push(x);
        }

        public void pop() {
            final int popped = stack.pop();
            if (popped == min) {
                minCount -= 1;
            }
            if (minCount == 0) { // find new min
                min = Integer.MAX_VALUE;
                for (final int item : stack) {
                    if (item < min) {
                        min = item;
                        minCount = 1;
                    }
                }
            }
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min;
        }
    }
}
