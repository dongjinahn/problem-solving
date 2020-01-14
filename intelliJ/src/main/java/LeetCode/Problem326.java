package LeetCode;

public class Problem326 {
    public static void main(String[] args) {
        System.out.println(isPowerOfThree(45));
    }
    public static  boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (!isDivisibleByThree(n)) {
            return false;
        }
        return isPowerOfThree(n / 3);
    }

    private static boolean isDivisibleByThree(int n) {
        if (n == 6) {
            return false;
        }
        int sum = 0;
        while (n > 0) {
            System.out.println(n);
            final int lastDigit = n % 10;
            sum += lastDigit;
            n = n / 10;
        }
        if (n != 0) {
            sum += n;
        }
        System.out.println("sum " + sum);
        return sum % 3 == 0;
    }
}
