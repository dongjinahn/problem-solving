package LeetCode;

import java.util.Vector;

public class Problem143 {
    public void reorderList(ListNode head) {
        if (head == null) {
            return;
        }
        final Vector<ListNode> l = new Vector<>();
        ListNode cur = head;
        while (cur != null) {
            l.add(cur);
            cur = cur.next;
        }

        int i = 1;
        int j = l.size() - 1;
        cur = head;
        while (true) {
            cur.next = l.elementAt(j);
            cur = cur.next;
            j -= 1;
            if (i > j) {
                cur.next = null;
                break;
            }

            cur.next = l.elementAt(i);
            cur = cur.next;
            i += 1;
            if (i > j) {
                cur.next = null;
                break;
            }
        }
    }
}
