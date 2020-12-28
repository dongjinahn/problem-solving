package LeetCode;

public class Problem374 {
    /**
     * NOTE: This function is implemented by LeetCode
     */
    private int guess(int a) {
        return a;
    }

    public int guessNumber(int n) {
        long low = 1;
        long high = n;
        while (low <= high) {
            if (low == high) {
                return (int) low;
            }
            final long mid = (low + high) / 2;
            if (mid == low && this.guess((int) high) == 0) {
                return (int) high;
            }
            switch (this.guess((int) mid)) {
                case 0:{
                    return (int) mid;
                }
                case 1: {
                    low = mid;
                    break;
                }
                case -1: {
                    high = mid;
                    break;
                }
                default: {
                    System.out.println("what?");
                }
            }
        }
        return -1;
    }
}
