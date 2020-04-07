package LeetCode;

    import java.util.Vector;

public class Problem1221 {
    public static void main(String[] args) {
        System.out.println(balancedStringSplit("LLLLRRRR"));
    }

    private static boolean isBalanced(String s) {
        if (s.length() % 2 == 0) {
            int lCount = 0;
            int rCount = 0;
            for (char ch : s.toCharArray()) {
                if (ch == 'L') {
                    lCount += 1;
                } else {
                    rCount += 1;
                }
            }
            return lCount == rCount;
        } else {
            return false;
        }
    }

    private static void iterate(Vector<String> v, String s) {
        if (s.length() == 0) {
            return;
        }
        for (int i = 2; i <= s.length(); i += 1) {
            String sub = s.substring(0, i);
            if (isBalanced(sub)) {
                v.add(sub);
                iterate(v, s.substring(i));
                return;
            }
        }
    }

    public static int balancedStringSplit(String s) {
        Vector<String> v = new Vector<>();
        iterate(v, s);
        System.out.println(v);
        return v.size();
    }

}
