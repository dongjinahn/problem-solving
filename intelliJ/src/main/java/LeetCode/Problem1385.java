package LeetCode;

public class Problem1385 {
    public static void main(String[] args) {
        System.out.println(findTheDistanceValue(new int[]{-3, 10, 2, 8, 0, 10}, new int[]{-9, -1, -4, -9, -8}, 9));
    }
    
    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = arr1.length;
        for (int a : arr1) {
            for (int b : arr2) {
                if (Math.abs(a - b) <= d) {
                    count -= 1;
                    break;
                }
            }
        }
        return count;
    }
}
