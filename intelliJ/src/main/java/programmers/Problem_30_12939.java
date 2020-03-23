package programmers;

public class Problem_30_12939 {
    public String solution(String s) {
        final String[] tokens = s.split(" ");
        int min = Integer.parseInt(tokens[0]);
        int max = min;

        for (int i = 1; i < tokens.length; i += 1) {
            int num = Integer.parseInt(tokens[i]);
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return String.format("%d %d", min, max);
    }
}
