package programmers;

public class Problem_30_12951 {
    public static void main(String[] args) {
        System.out.print(solution("hello sEdddd   "));
        System.out.println(1);
    }
    public static String solution(String s) {
        final StringBuilder sb = new StringBuilder(s.length());
        StringBuilder tempSb = new StringBuilder();
        for (final char ch : s.toCharArray()) {
            if (ch == ' ') {
                if (tempSb.length() != 0) {
                    sb.append(toCamelCase(tempSb.toString()));
                    tempSb = new StringBuilder();
                }
                sb.append(' ');
            } else {
                tempSb.append(ch);
            }
        }
        if (tempSb.length() != 0) {
            sb.append(toCamelCase(tempSb.toString()));
        }
        return sb.toString();
    }

    public static String toCamelCase(String s) {
        final StringBuilder sb = new StringBuilder(s.length());
        boolean isFirstChar = true;
        for (final char ch : s.toCharArray()) {
            if (Character.isAlphabetic(ch)) {
                if (isFirstChar) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }
            } else {
                sb.append(ch);
            }
            isFirstChar = false;
        }
        return sb.toString();
    }


}
