import java.util.HashMap;

public class Task5 {
    public static int lenOfLongSubarr(int[] array, int k) {
        // Initialize result to store the maximum number of elements
        int[] result = new int[1];
        result[0] = Integer.MIN_VALUE;

        // Call the recursive function
        backtrack(array, 0, k, result, 0);

        return result[0] == Integer.MIN_VALUE ? 0 : result[0];
    }

    public static void backtrack(int[] array, int index, int target, int[] result, int count) {
        // Base case: if target becomes 0, update result with maximum count
        if (target == 0) {
            result[0] = Math.max(result[0], count);
            return;
        }

        // If index reaches end of array or target becomes negative, return
        if (index == array.length || target < 0)
            return;

        // Explore two possibilities: include the current element or exclude it
        backtrack(array, index + 1, target - array[index], result, count + 1); // Include current element
        backtrack(array, index + 1, target, result, count); // Exclude current element
    }
}
