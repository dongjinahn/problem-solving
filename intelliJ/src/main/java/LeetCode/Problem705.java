package LeetCode;

import java.util.ArrayList;
import java.util.Vector;

public class Problem705 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        v.remove(new Integer(1));
    }
    static class MyHashSet {
        private Vector<Integer>[] lists;
        /** Initialize your data structure here. */
        public MyHashSet() {
            lists = new Vector[5000]; // 5000 is magic number
        }

        public void add(int num) {
            final int hashKey = hash(num);
            final Vector<Integer> v = lists[hashKey];
            if (v == null) {
                lists[hashKey] = new Vector<>();
                lists[hashKey].add(num);
                return;
            }
            if (!v.contains(num)) {
                v.add(num);
            }
        }

        public void remove(int num) {
            final int hashKey = num % 5000;
            final Vector<Integer> v = lists[hashKey];
            if (v == null) {
                return;
            }
            v.remove(new Integer(num));
        }

        private int hash(int num) {
            return num % 5000;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int num) {
            final int hashKey = hash(num);
            final Vector<Integer> v = lists[hashKey];
            if (v == null) {
                return false;
            }
            return v.contains(num);
        }
    }
}
