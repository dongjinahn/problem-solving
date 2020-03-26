package programmers;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class Problem_30_42587 {
    public static void main(String[] args) {
//        System.out.println(solution(new int[]{2, 1, 3, 2}, 2));
//        System.out.println(solution(new int[]{1, 1, 9, 1, 1, 1}, 0));
        System.out.println(solution(new int[]{1, 1, 1}, 2));

    }
    public static int solution(int[] properties, int location) {
        Queue<Integer> queue = new LinkedList<>();
        for (final int p : properties) {
            queue.add(p);
        }

        int order = 0;
        while (!queue.isEmpty()) {
            int head = queue.poll();
            if (queue.isEmpty()) {
              return order + 1;
            } else if (head < Collections.max(queue)) {
                queue.add(head);
                if (location == 0) {
                    location = queue.size() - 1;
                } else {
                    location -= 1;
                }
            } else {
                order += 1;
                if (location == 0) {
                    break;
                } else {
                    location -= 1;
                }
            }
        }

        return order;
    }
}
