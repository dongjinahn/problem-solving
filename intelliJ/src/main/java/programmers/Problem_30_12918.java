package programmers;

public class Problem_30_12918 {
    private boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
    public boolean solution(String str) {
        if (str.length() != 4 && str.length() != 6) {
            return false;
        }
        final String trimStr = str.trim();
        if (trimStr.length() == 0) {
            return false;
        }
        for (char ch : trimStr.toCharArray()) {
            if (!isDigit(ch)) {
                return false;
            }
        }
        return true;
    }
}
