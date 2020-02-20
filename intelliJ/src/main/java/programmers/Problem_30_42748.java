package programmers;

import java.util.Arrays;

public class Problem_30_42748 {
    public int[] solution(int[] array, int[][] commands) {
        final int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i += 1) {
            final int[] command = commands[i];
            answer[i] = run(array, command);
        }
        return answer;
    }

    private int run(int[] array, int[] command) {
        final int startIndex = command[0] - 1;
        final int endIndex = command[1] - 1;
        final int k = command[2] - 1;

        final int[] newSubArray = Arrays.copyOfRange(array, startIndex, endIndex + 1);;
        Arrays.sort(newSubArray);
        return newSubArray[k];
    }
}
