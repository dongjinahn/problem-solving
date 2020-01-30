package LeetCode;

import java.util.TreeMap;

public class Problem729 {
    public static void main(String[] args) {
        final MyCalendar mc = new MyCalendar();
        System.out.println(mc.book(10, 20));
        System.out.println(mc.book(15, 25));
        System.out.println(mc.book(20, 30));
//        final MyCalendar mc = new MyCalendar();
//        System.out.println(mc.book(47, 50));
//        System.out.println(mc.book(33, 41));
//        System.out.println(mc.book(39, 45));
//        System.out.println(mc.book(33, 42));
//        System.out.println(mc.book(25, 32));
//        System.out.println(mc.book(26, 35));
//        System.out.println(mc.book(19, 25));
//        System.out.println(mc.book(8, 13));
//        System.out.println(mc.book(18, 27));
//        System.out.println(mc.book(18, 27));
    }
    // if boolean is true = it means start
    // if boolean is false = it means end

    static class MyCalendar {
        private TreeMap<Integer, Integer> b;
        public MyCalendar() {
            b = new TreeMap<>();
        }

        public boolean book(int start, int end) {
            final Integer floorKey = b.floorKey(start);
            if (floorKey != null && b.get(floorKey) > start) return false;
            final Integer ceilingKey = b.ceilingKey(start);
            if (ceilingKey != null && ceilingKey < end) return false;
            b.put(start, end);
            return true;
        }

    }
}
