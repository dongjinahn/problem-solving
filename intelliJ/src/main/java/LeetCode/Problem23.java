package LeetCode;

import java.util.PriorityQueue;

public class Problem23 {
    public static void main(String[] args) {

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        final ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;

        PriorityQueue<MyNode> pq = new PriorityQueue<>();

        /*
          initialize
         */
        for (int i = 0; i < lists.length; i += 1) {
            if (lists[i] == null) {
                continue;
            }
            pq.add(new MyNode(lists[i].val, i));
            lists[i] = lists[i].next;
        }

        /*
          merge with priority queue
         */
        while (!pq.isEmpty()) {
            MyNode mn = pq.poll();
            cur.next = new ListNode(mn.val);
            if (lists[mn.listIndex] != null) {
                pq.add(new MyNode(lists[mn.listIndex].val, mn.listIndex));
                lists[mn.listIndex] = lists[mn.listIndex].next;
            }
            cur = cur.next;
        }

        return dummy.next;
    }

    private static class MyNode implements Comparable<MyNode> {
        int val;
        int listIndex;

        public MyNode(int v, int li) {
            val = v;
            listIndex = li;
        }

        @Override
        public int compareTo(MyNode that) {
            return this.val - that.val;
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
        }
    }
}
