package programmers;

import java.util.HashSet;
import java.util.Set;

public class Problem_30_42577 {
    public boolean solution(String[] phoneBook) {
        final Set<String> s = new HashSet<>();
        for (final String inputPhone : phoneBook) {
            for (int i = 1; i < inputPhone.length(); i += 1) {
                s.add(inputPhone.substring(0, i));
            }
        }

        for (final String inputPhone : phoneBook) {
            if (s.contains(inputPhone)) {
                return false;
            }
        }
        return true;
    }
}
