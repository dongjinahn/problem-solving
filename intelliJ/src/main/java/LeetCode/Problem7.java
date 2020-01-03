package LeetCode;

public class Problem7 {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
    }

    public static int reverse(int x) {
        int res = 0;
        boolean hasException = false;
        while (x != 0) {
            try {
                res = Math.multiplyExact(res, 10);
                res = Math.addExact(res, x % 10);
            } catch (ArithmeticException e) {
                hasException = true;
            }
            if (hasException) {
                // try catch중에 return하는건 anti-pattern
                return 0;
            }
            x = x / 10;
        }
        return res;
    }
}
