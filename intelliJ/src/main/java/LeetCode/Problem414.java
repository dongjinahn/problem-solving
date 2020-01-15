package LeetCode;

import java.util.*;

public class Problem414 {
    public static void main(String[] args) {
        int nums[] = {1, 2, 2, 5, 3, 5};
        System.out.println(thirdMax(nums));
    }
    public static int thirdMax(int[] nums) {
        final PriorityQueue<Integer> pq = new PriorityQueue<>();
        int pqSize = 0;
        for (final int num : nums) {
            if (pq.contains(num)) {
                continue;
            }
            pq.add(num);
            pqSize += 1;
            if (pqSize == 4) {
                pq.remove();
                pqSize -= 1;
            }
        }

        if (pqSize == 3) {
            return pq.peek();
        }
        final Iterator<Integer> it = pq.iterator();
        int max = Integer.MIN_VALUE;
        while (it.hasNext()) {
            final int nextInt = it.next();
            if (max < nextInt) {
                max = nextInt;
            }
        }
        return max;
    }

//    public static int thirdMax(int[] nums) {
//        final List<Integer> l = new Vector<>(4);
//
//        for (int num : nums) {
//            if (l.contains(num)) {
//                continue;
//            }
//            l.add(num);
//            Collections.sort(l);
//            if (l.size() == 4) {
//                l.remove(0);
//            }
//        }
//
//        if (l.size() == 3) {
//            return l.get(0);
//        }
//        return l.get(l.size() - 1);
//    }
}
