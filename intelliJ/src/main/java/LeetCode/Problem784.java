package LeetCode;

import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Problem784 {
    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> res = new LinkedList<>();
        res.add(new StringBuilder(S.length()));

        char[] chars = S.toCharArray();
        for (final char ch : chars) {
            LinkedList<StringBuilder> tempList = new LinkedList<>();

            while (!res.isEmpty()) {
                StringBuilder sb = res.remove(0);
                if (Character.isAlphabetic(ch)) {
                    StringBuilder sb2 = new StringBuilder(sb);
                    sb.append(Character.toLowerCase(ch));
                    sb2.append(Character.toUpperCase(ch));
                    tempList.add(sb);
                    tempList.add(sb2);
                } else {
                    sb.append(ch);
                    tempList.add(sb);
                }
            }
            res.addAll(tempList);
        }

        List<String> res2 = new Vector<>(res.size());
        for (StringBuilder sb : res) {
            res2.add(sb.toString());
        }
        return res2;
    }
}
