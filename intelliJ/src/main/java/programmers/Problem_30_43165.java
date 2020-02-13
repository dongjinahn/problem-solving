package programmers;

import java.util.*;

public class Problem_30_43165 {
    int solutionCount = 0;

    private void traverse(int headSum, int[] array, int start, int target) {
        if (start == array.length - 1) { // last recursive call
            if (headSum + array[start] == target) {
                this.solutionCount += 1;
            }
            if (headSum - array[start] == target) {
                this.solutionCount += 1;
            }
            return;
        }
        traverse(headSum + array[start], array, start + 1, target);
        traverse(headSum - array[start], array, start + 1, target);
    }

    public int solution(int[] numbers, int target) {
        traverse(0, numbers, 0, target);
        return this.solutionCount;
    }
}
