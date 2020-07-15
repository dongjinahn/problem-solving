package LeetCode;

import java.util.HashMap;
import java.util.HashSet;

public class Problem160 {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        final HashSet<ListNode> s = new HashSet<>();
//        ListNode cur = headA;
//        while (cur != null) {
//            s.add(cur);
//            cur = cur.next;
//        }
//
//        cur = headB;
//        while (cur != null) {
//            if (s.contains(cur)) {
//                return cur;
//            }
//            cur = cur.next;
//        }
//        return null;
//    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            a = a == null ? headB : a.next;
            b = b == null ? headA : b.next;
        }
        return a;
    }
}
