package LeetCode;

public class Problem344 {
    public void reverseString(char[] s) {
        for (int i = 0; i < s.length / 2; i += 1) {
            swap(s, i, s.length - 1 - i);
        }
    }

    private void swap(char[] s, int i, int j) {
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}
