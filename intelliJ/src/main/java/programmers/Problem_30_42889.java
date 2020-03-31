package programmers;

import java.util.*;

public class Problem_30_42889 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(5, new int[]{2, 1, 2, 6, 2, 4, 3, 3})));
        System.out.println(Arrays.toString(solution(4, new int[]{4, 4, 4, 4, 4})));
    }
    public static int[] solution(int N, int[] stages) {
        Map<Integer, Integer> stageCount = new TreeMap<>();
        for (int stage : stages) {
            if (stageCount.containsKey(stage)) {
                stageCount.put(stage, stageCount.get(stage) + 1);
            } else {
                stageCount.put(stage, 1);
            }
        }

        int leftPeopleCount = stages.length;

        Map<Integer, Double> stageFailureRate = new TreeMap<>();
        int sum = 0;
        for (int key = 1; key <= N; key += 1) {
            int value = stageCount.getOrDefault(key, 0);
            stageFailureRate.put(key, (double) value / (leftPeopleCount - sum));
            sum += value;

        }
        List<Tuple> l = new Vector<>(stages.length);
        for (int key : stageFailureRate.keySet()) {
            l.add(new Tuple(key, stageFailureRate.get(key)));
        }

        l.sort((a, b) -> {
            if (a.failureRate == b.failureRate) {
                return a.stage - b.stage;
            }
            if (a.failureRate < b.failureRate) {
                return 1;
            } else if (a.failureRate > b.failureRate) {
                return -1;
            }
            return 0;
        });

        int[] result = new int[N];
        for (int i = 0; i < N; i += 1) {
            result[i] = l.get(i).stage;
        }
        return result;
    }

    static class Tuple {
        int stage;
        double failureRate;
        Tuple(int _stage, double _failureRate) {
            this.stage = _stage;
            this.failureRate = _failureRate;
        }

        @Override
        public String toString() {
            return "Tuple{" +
                    "stage=" + stage +
                    ", failureRate=" + failureRate +
                    '}';
        }
    }
}
