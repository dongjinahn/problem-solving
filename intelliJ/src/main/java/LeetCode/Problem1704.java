package LeetCode;

import java.util.HashSet;

public class Problem1704 {
    private HashSet<Character> vowelSet = new HashSet<>();

    Problem1704() {
        this.vowelSet.add('a');
        this.vowelSet.add('A');
        this.vowelSet.add('e');
        this.vowelSet.add('E');
        this.vowelSet.add('i');
        this.vowelSet.add('I');
        this.vowelSet.add('o');
        this.vowelSet.add('O');
        this.vowelSet.add('u');
        this.vowelSet.add('U');
    }
    public boolean halvesAreAlike(String s) {

        final char[] chars = s.toCharArray();

        int aVowelCount = 0;
        int bVowelCount = 0;
        for (int i = 0; i < chars.length; i += 1) {
            if (this.vowelSet.contains(chars[i])) {
                if (i < chars.length / 2) {
                    aVowelCount += 1;
                } else {
                    bVowelCount += 1;
                }
            }
        }

        return aVowelCount == bVowelCount;
    }


}
