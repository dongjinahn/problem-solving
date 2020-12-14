package LeetCode;

import java.util.Map;
import java.util.LinkedHashMap;

public class Problem146 {
    private final LinkedHashMap<Integer, Integer> cache;

    public Problem146(int capacity) {
        cache = new LinkedHashMap<Integer, Integer>(capacity, 0.75F, true) {
            @Override
            protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
                return size() > capacity;
            }
        };
    }

    public int get(int key) {
        return cache.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        cache.put(key, value);
    }
}
