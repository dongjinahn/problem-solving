package LeetCode;

public class Problem709 {
    public static void main(String[] args) {

    }
    public String toLowerCase(String str) {
        final StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                sb.append((char) (ch + 32));
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}
