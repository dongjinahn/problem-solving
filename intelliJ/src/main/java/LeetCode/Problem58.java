package LeetCode;

public class Problem58 {
    public int lengthOfLastWord(String s) {
        if (s.length() == 0) {
            return 0;
        }
        final String[] tokens = s.split(" ");
        if (tokens.length == 0) {
            return 0;
        }
        return tokens[tokens.length - 1].length();
    }
}
