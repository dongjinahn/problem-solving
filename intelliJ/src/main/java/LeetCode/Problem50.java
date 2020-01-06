package LeetCode;

public class Problem50 {
    public static void main(String[] args) {
        System.out.println(myPow(2, 10));
        System.out.println(myPow(2.1, 3));
        System.out.println(myPow(2, Integer.MIN_VALUE));
        System.out.println(myPow(2, -2));
    }
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            x = 1 / x;
            return x * myPow(x, -(n + 1));
        }
        return (n % 2 == 0) ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2);
    }
}
