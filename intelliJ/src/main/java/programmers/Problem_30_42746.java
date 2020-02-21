package programmers.skillcheck1;

import java.util.Arrays;

public class Problem_30_42746 {
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0};
        System.out.println(solution(a));
    }
    public static String solution(int[] numbers) {
        final String[] stringNumbers = new String[numbers.length];
        for (int i = 0; i < stringNumbers.length; i += 1) {
            stringNumbers[i] = String.valueOf(numbers[i]);
        }
        Arrays.sort(stringNumbers, (a, b) -> Integer.parseInt(a + b) - Integer.parseInt(b + a));

        final StringBuilder sb = new StringBuilder(numbers.length * 2);
        for (int i = stringNumbers.length - 1; i >= 0; i -= 1) {
            final String item = stringNumbers[i];
            sb.append(item);
        }

        final String res = sb.toString();
        if (res.charAt(0) == '0') {
            return "0";
        }
        return res;
    }
}
