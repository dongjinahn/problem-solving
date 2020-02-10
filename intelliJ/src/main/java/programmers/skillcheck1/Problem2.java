package programmers.skillcheck1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Vector;

public class Problem2 {
    public String solutionn(String[] participant, String[] completion) {
        Arrays.sort(participant);
        final Vector<String> participantVector = new Vector<>(participant.length);
        participantVector.addAll(Arrays.asList(participant));

        for (String c : completion) {
            final int index = Collections.binarySearch(participantVector, c);
            if (index < 0) {
                return c;
            }
            participantVector.remove(index);
        }
        return participantVector.get(0);
    }
}
