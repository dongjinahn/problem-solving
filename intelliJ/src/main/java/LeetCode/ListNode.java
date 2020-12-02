package LeetCode;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
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
