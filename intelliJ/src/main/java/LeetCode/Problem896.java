package LeetCode;

public class Problem896 {
    public boolean isMonotonic(int[] arr) {
        if (arr.length == 1) {
            return true;
        }
        boolean isIncreasing;
        if (arr[0] > arr[arr.length - 1]) {
            isIncreasing = false;
        } else {
            isIncreasing = true;
        }
        if (isIncreasing) {
            for (int i = 1; i < arr.length; i += 1) {
                int prev = arr[i - 1];
                int cur = arr[i];
                if (prev > cur) {
                    return false;
                }
            }
            return true;
        } else {
            for (int i = 1; i < arr.length; i += 1) {
                int prev = arr[i - 1];
                int cur = arr[i];
                if (cur > prev) {
                    return false;
                }
            }
            return true;
        }
    }
}
