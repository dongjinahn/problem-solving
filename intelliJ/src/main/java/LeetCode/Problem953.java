package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem953 {
    private Map<Character, Character> getDict(String order) {
        char[] alphabetArr = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<Character, Character> d = new HashMap<>();
        for (int i = 0; i < order.length(); i += 1) {
            char ch = order.charAt(i);
            d.put(ch, alphabetArr[i]);
        }
        return d;
    }

    private String translate(Map<Character, Character> d, String s) {
        final StringBuilder sb = new StringBuilder();
        final char[] chars = s.toCharArray();
        for (char ch : chars) {
            sb.append(d.get(ch));
        }
        return sb.toString();
    }

    public boolean isAlienSorted(String[] words, String order) {
        String[] myWords = Arrays.copyOf(words, words.length);
        Map<Character, Integer> orderIndexMap = getOrderIndexMap(order);

        Arrays.sort(myWords, (a, b) -> {
            int shortLength = Math.min(a.length(), b.length());
            for (int i = 0; i < shortLength; i += 1) {
                char aCh = a.charAt(i);
                char bCh = b.charAt(i);
                if (aCh == bCh) {
                    continue;
                }
                return orderIndexMap.get(aCh) - orderIndexMap.get(bCh);
            }
            return a.length() - b.length();
        });

        return Arrays.equals(myWords, words);
    }

    private Map<Character, Integer> getOrderIndexMap(String order) {
        Map<Character, Integer> orderIndexMap = new HashMap<>();
        for (int i = 0; i < order.length(); i += 1) {
            char ch = order.charAt(i);
            orderIndexMap.put(ch, i);
        }
        return orderIndexMap;
    }

    public boolean isAlienSorted2(String[] words, String order) {
        String[] myWords = Arrays.copyOf(words, words.length);
        Map<Character, Integer> orderIndexMap = getOrderIndexMap(order);

        Arrays.sort(myWords, (a, b) -> {
            int shortLength = Math.min(a.length(), b.length());
            for (int i = 0; i < shortLength; i += 1) {
                char aCh = a.charAt(i);
                char bCh = b.charAt(i);
                if (aCh == bCh) {
                    continue;
                }
                return orderIndexMap.get(aCh) - orderIndexMap.get(bCh);
            }
            return a.length() - b.length();
        });

        return Arrays.equals(myWords, words);
    }
}
