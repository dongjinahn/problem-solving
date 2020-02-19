package programmers;

public class Problem_30_12916 {
    boolean solution(String s) {
        int pCount = 0;
        int yCount = 0;

        for (char ch: s.toCharArray()) {
            if (ch == 'p' || ch == 'P') {
                pCount += 1;
            } else if (ch == 'y' || ch == 'Y') {
                yCount += 1;
            }
        }
        return pCount == yCount;
    }
}
