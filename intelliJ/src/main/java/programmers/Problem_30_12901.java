package programmers;

public class Problem_30_12901 {
    static int[] days = {-1, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    static String[] dayMap = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};

    public static void main(String[] args) {
        System.out.println(solution(5, 24));
    }
    public static  String solution(int a, int b) {
        int daysBeforeMonth = 0;
        for (int i = 1; i < a; i += 1) {
            daysBeforeMonth += days[i];
        }

        int m = (daysBeforeMonth + b) % 7;
        return dayMap[m];
    }
}
