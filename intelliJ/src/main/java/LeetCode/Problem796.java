package LeetCode;

public class Problem796 {
    public boolean rotateString(String A, String B) {
        if (A.length() != B.length()) {
            return false;
        }
        String next = B;
        for (int i = 0; i <= B.length(); i += 1) {
            if (A.equals(next)) {
                return true;
            }
            next = rotateByOne(next);
        }
        return false;
    }

    private String rotateByOne(String s) {
        return s.substring(1) + s.charAt(0);
    }
}
