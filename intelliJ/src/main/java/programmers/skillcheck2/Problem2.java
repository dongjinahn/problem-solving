package programmers.skillcheck2;

public class Problem2 {
    public int[] solution(int[] heights) {
        int[] result = new int[heights.length];
        for (int i = heights.length - 1; i >= 0; i -= 1) {
            final int height = heights[i];
            final int order = findReceiveTowerOrder(heights, i, height);
            result[i] = order;
        }
        return result;
    }

    private int findReceiveTowerOrder(int[] heights, int sourceTowerIndex, int sourceTowerHeight) {
        for (int i = sourceTowerIndex - 1; i >= 0; i -= 1) {
            final int height = heights[i];
            if (height > sourceTowerHeight) {
                return i + 1; // index아니고 order이기 때문에 + 1
            }
        }
        return 0; // 못찾은경우, 문제 스펙에서 0으로 넣으면 됨
    }
}
