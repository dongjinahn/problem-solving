package LeetCode;

import java.util.Stack;

public class Problem232 {
    private static class MyQueue {
        private Stack<Integer> popStack;
        private Stack<Integer> pushStack;

        /** Initialize your data structure here. */
        public MyQueue() {
            popStack = new Stack<>();
            pushStack = new Stack<>();
        }

        /** Push element x to the back of queue. */
        public void push(int x) {
            pushStack.push(x);
        }

        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            if (!popStack.isEmpty()) {
                return popStack.pop();
            }

            bwak();

            return popStack.pop();
        }

        /** Get the front element. */
        public int peek() {
            if (!popStack.isEmpty()) {
                return popStack.peek();
            }

            bwak();

            return popStack.peek();
        }

        /**
         * pour all elements from pushStack to popStack
         */
        private void bwak() {
            // popStack is empty now
            if (pushStack.isEmpty()) {
                throw new Error("Empty Queue Pop");
            }

            // popStack is empty, pushStack is not empty
            while (!pushStack.isEmpty()) {
                popStack.push(pushStack.pop());
            }
        }

        /** Returns whether the queue is empty. */
        public boolean empty() {
            return popStack.isEmpty() && pushStack.isEmpty();
        }
    }
}
