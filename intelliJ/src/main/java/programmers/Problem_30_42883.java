package programmers;

public class Problem_30_42883 {
    public static void main(String[] args) {
        System.out.println(solution("1924", 2));
        System.out.println(solution("1231234", 3));
        System.out.println(solution("4177252841", 4));
        System.out.println(solution("999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999999", 100));

    }

    public static String solution(String number, int k) {
        final int n = number.length();
        final StringBuilder answer = new StringBuilder(n - k);
        int startIndex = 0, maxIndex = 0;
        char maxChar;

        for (int outerIndex = n - k; outerIndex > 0; outerIndex -= 1) {
            maxChar = '0';
            for (int innerIndex = startIndex; innerIndex <= n - outerIndex; innerIndex++) {
                if (number.charAt(innerIndex) > maxChar) {
                    maxIndex = innerIndex;
                    maxChar = number.charAt(innerIndex);
                    if (maxChar == '9') {
                        break;
                    }
                }
            }
            answer.append(maxChar);
            startIndex = maxIndex + 1;
        }
        return answer.toString();
    }
}
