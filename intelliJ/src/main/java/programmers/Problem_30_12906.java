package programmers;

import java.util.Vector;

public class Problem_30_12906 {
    public int[] solution(int []arr) {
        final Vector<Integer> v = new Vector<>(arr.length);
        v.add(arr[0]);
        int vectorLastIndex = 0;
        for (int i = 1; i < arr.length; i += 1) {
            final int item = arr[i];
            final int lastElementOfVector = v.get(vectorLastIndex);
            if (lastElementOfVector != item) {
                v.add(item);
                vectorLastIndex += 1;
            }
        }

        int[] answer = new int[v.size()];
        for (int i = 0; i < answer.length; i += 1) {
            answer[i] = v.get(i);
        }
        return answer;
    }
}
