package LeetCode;

import java.util.List;
import java.util.Vector;

public class Problem412 {
    public List<String> fizzBuzz(int n) {
        final List<String> list = new Vector<>();
        for (int i = 1; i <= n; i += 1) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
                continue;
            }
            if (i % 5 == 0) {
                list.add("Buzz");
                continue;
            }
            if (i % 3 == 0) {
                list.add("Fizz");
                continue;
            }
            list.add(String.valueOf(i));
        }
        return list;
    }
}
