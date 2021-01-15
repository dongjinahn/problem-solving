package LeetCode;

import java.util.Vector;

public class Problem234 {
    public boolean isPalindrome(ListNode head) {
        Vector<Integer> v = new Vector<>();
        ListNode cur = head;
        while (cur != null) {
            v.add(cur.val);
            cur = cur.next;
        }

        System.out.println(v.toString());
        int n = v.size();
        for (int i = 0; i < n / 2; i += 1) {
            if (!v.get(i).equals(v.get(n - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
