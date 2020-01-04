package LeetCode;

public class Problem148 {
    public static void main(String[] args) {
//        final ListNode a = new ListNode(4);
//        a.next = new ListNode(2);
//        a.next.next = new ListNode(1);
//        a.next.next.next = new ListNode(3);
//
//        final ListNode sortedA = sortList(a);
//        System.out.println(sortedA.toString());

//        final ListNode b = new ListNode(-1);
//        b.next = new ListNode(5);
//        b.next.next = new ListNode(3);
//        b.next.next.next = new ListNode(4);
//        b.next.next.next.next = new ListNode(0);
//
//        final ListNode sortedB = sortList(b);
//        System.out.println(sortedB.toString());

        final ListNode sortedC = sortList(null);
        System.out.println(sortedC.toString());
    }

    public static ListNode sortList(ListNode head) {
        if (head == null) {
            return null;
        }
        return mergeSort(head);
    }

    private static ListNode mergeSort(ListNode node) {
        if (node.next == null) { // length 1
            return node;
        }
//        System.out.println(node.toString());
        if (node.next.next == null) { // length 2
            final int max = Math.max(node.val, node.next.val);
            final int min = Math.min(node.val, node.next.val);

            final ListNode l = new ListNode(min);
            l.next = new ListNode(max);
            return l;
        }
        final ListNode[] tuple = split(node);
        final ListNode left = tuple[0];
        final ListNode right = tuple[1];

        final ListNode sortedLeft = mergeSort(left);
        final ListNode sortedRight = mergeSort(right);
        return merge(sortedLeft, sortedRight);
    }

    private static ListNode[] split(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
//        System.out.println("a " + slow.toString());
//        System.out.println("b " + fast.toString());

        final ListNode right = slow.next;
        slow.next = null; // 끊기
        return new ListNode[]{head, right};
    }

    private static ListNode merge(ListNode a, ListNode b) {
        final ListNode dummy = new ListNode(-1);
        append(dummy, a, b);
        return dummy.next;
    }

    private static void append(ListNode cursor, ListNode c, ListNode d) {
        if (c == null && d == null) {
            return;
        }

        if (c == null) {
            cursor.next = d;
            append(cursor.next, c, d.next);
        } else if (d == null) {
            cursor.next = c;
            append(cursor.next, c.next, d);
        } else if (c.val < d.val) {
            cursor.next = c;
            append(cursor.next, c.next, d);
        } else {
            cursor.next = d;
            append(cursor.next, c, d.next);
        }
    }

    private static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder(50);
            ListNode cur = this;
            sb.append(this.val);
            while (cur.next != null) {
                sb.append("->");
                sb.append(cur.next.val);
                cur = cur.next;
            }
            return sb.toString();
        }
    }
}
