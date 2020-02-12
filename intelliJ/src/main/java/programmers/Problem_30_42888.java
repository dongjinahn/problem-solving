package programmers;

import java.util.HashMap;
import java.util.Map;

public class Problem_30_42888 {
    final Map<String, String> idNicknameMap = new HashMap<>();

    public String[] solution(String[] record) {
        int changeCommandCount = 0;
        for (String r : record) {
            final String[] tokens = r.split("\\s+");
            final String command = tokens[0];
            final String uid = tokens[1];

            if (command.equals("Enter")) {
                idNicknameMap.put(uid, tokens[2]);
                continue;
            }
            if (command.equals("Change")) {
                idNicknameMap.put(uid, tokens[2]);
                changeCommandCount += 1;
            }
        }

        final String[] result = new String[record.length - changeCommandCount];
        int resultIndex = 0;
        for (final String r : record) {
            final String[] tokens = r.split(" ");
            final String command = tokens[0];
            final String uid = tokens[1];
            if (command.equals("Change")) {
                continue;
            }
            if (command.equals("Enter")) {
                result[resultIndex] = String.format("%s님이 들어왔습니다.", idNicknameMap.get(uid));
                resultIndex += 1;
                continue;
            }
            if (command.equals("Leave")) {
                result[resultIndex] = String.format("%s님이 나갔습니다.", idNicknameMap.get(uid));
                resultIndex += 1;
            }
        }
        return result;
    }
}
