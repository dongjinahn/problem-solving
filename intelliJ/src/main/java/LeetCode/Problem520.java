package LeetCode;

public class Problem520 {
    public boolean detectCapitalUse(String word) {
        if(word.length() == 1) {
            return true;
        }
        final char firstChar = word.charAt(0);
        // all lowercase
        if (isCharLowerCase(firstChar)) {
            for (char ch : word.toCharArray()) {
                if (!isCharLowerCase(ch)) {
                    return false;
                }
            }
            return true;
        }

        // ALL UPPER
        final char secondChar = word.charAt(1);
        if (!isCharLowerCase(firstChar) && !isCharLowerCase(secondChar)) {
            for (char ch : word.toCharArray()) {
                if (isCharLowerCase(ch)) {
                    return false;
                }
            }
            return true;
        }

        // Capital
        if (!isCharLowerCase(firstChar) && isCharLowerCase(secondChar)) {
            for (char ch : word.toCharArray()) {
                if (!isCharLowerCase(ch)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private boolean isCharLowerCase(char ch) {
        return (int) ch >= 97 && (int) ch <= 122;
    }
}
