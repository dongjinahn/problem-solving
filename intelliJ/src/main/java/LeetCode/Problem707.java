package LeetCode;

public class Problem707 {
    public static void main(String[] args) {
        MyLinkedList l = new MyLinkedList();
        l.addAtHead(7);
        l.addAtHead(2);
        l.addAtHead(1);
        l.addAtIndex(3, 0);
        l.deleteAtIndex(2);
        l.addAtHead(6);
        l.addAtTail(4);
        int a = l.get(4);
        System.out.println(a);
    }
    static class MyNode {
        int val;
        MyNode next;

        MyNode(int x) {
            this.val = x;
        }
    }
    static class MyLinkedList {
        private MyNode tail;
        private int size;

        /** Initialize your data structure here. */
        public MyLinkedList() {
            tail = null;
            size = 0;
        }

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (index + 1 > size) {
                return -1;
            }
            MyNode cur = tail.next; // cur is head here
            for (int i = 0; i < index; i += 1) {
                cur = cur.next;
            }
            return cur.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            final MyNode newNode = new MyNode(val);
            if (size == 0) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
            }
            size += 1;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            final MyNode newNode = new MyNode((val));
            if (size == 0) {
                tail = newNode;
                tail.next = tail;
            } else {
                newNode.next = tail.next;
                tail.next = newNode;
                tail = newNode;
            }
            size += 1;
        }

        private MyNode findNodeAt(int index) {
            if (index + 1 > size) {
                return null;
            }
            if (index == -1) {
                return tail;
            }
            MyNode cur = tail.next;
            for (int i = 0; i < index; i += 1) {
                cur = cur.next;
            }
            return cur;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if (index > size) {
                return;
            }
            if (index == size) {
                addAtTail(val);
                return;
            }
            if (index == 0) {
                addAtHead(val);
                return;
            }
            final MyNode newNode = new MyNode(val);
            final MyNode targetBefore = findNodeAt(index - 1);
            newNode.next = targetBefore.next;
            targetBefore.next = newNode;
            size += 1;
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if (index >= size) {
                return;
            }
            if (index == 0 && size == 1) {
                size = 0;
                tail = null;
                return;
            }
            final MyNode targetBefore = findNodeAt(index - 1);
            targetBefore.next = targetBefore.next.next;
            if (index == size - 1) {
                tail = targetBefore;
            }
            size -= 1;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(10);
            sb.append("[");
            if (tail != null) {
                MyNode cur = tail.next;
                while (cur != tail) {
                    sb.append(",").append(cur.val);
                    cur = cur.next;
                }
                sb.append(",").append(cur.val);
            }
            sb.append("]");
            return sb.toString();
        }
    }
}
