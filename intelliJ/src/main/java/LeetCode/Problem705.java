package LeetCode;

import java.util.TreeSet;
import java.util.Vector;

public class Problem705 {
    public static void main(String[] args) {
    }
    static class MyHashSet {
        private TreeSet<Integer>[] lists;
        /** Initialize your data structure here. */
        public MyHashSet() {
            lists = new TreeSet[5000]; // 5000 is magic number
        }

        public void add(int num) {
            final int hashKey = hash(num);
            final TreeSet<Integer> t = lists[hashKey];
            if (t == null) {
                lists[hashKey] = new TreeSet<>();
                lists[hashKey].add(num);
                return;
            }
            t.add(num);
        }

        public void remove(int num) {
            final int hashKey = num % 5000;
            final TreeSet<Integer> t = lists[hashKey];
            if (t == null) {
                return;
            }
            t.remove(num);
        }

        private int hash(int num) {
            return num % 5000;
        }

        /** Returns true if this set contains the specified element */
        public boolean contains(int num) {
            final int hashKey = hash(num);
            final TreeSet<Integer> t = lists[hashKey];
            if (t == null) {
                return false;
            }
            return t.contains(num);
        }
    }
}
