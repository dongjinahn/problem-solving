package programmers;

public class Problem_30_12919 {
    public String solution(String[] seoul) {

        int i = 0;
        for (String s: seoul) {
            if (s.equals("Kim")) {
                return String.format("김서방은 %d에 있다", i);
            }
            i += 1;
        }
        return "";
    }
}
