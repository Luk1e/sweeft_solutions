package org.example.solutions;


/**
 * Task5: Maximum number of integers with Sum k
 * <p>
 * This class provides a method to find the maximum number of integers with Sum k within the given array
 * <p>
 * Time Complexity: O(n * k), where n the length of input array
 * Space Complexity: O(n * k), where n the length of input array
 */
public class Task5 {

    /**
     * Find the maximum number of integers with Sum k.
     *
     * @param array The input array of integers.
     * @param k The target sum.
     * @return The maximum number of integers which sum up to k.
     */
    public static int lenOfLongSubarr(int[] array, int k) {
        int n = array.length;

        // initialize a 2D dp array for storing the longest subsequence in the first i elements of the nums array that sums up to j
        int[][] dp = new int[n + 1][k + 1];

        for (int i = 0; i < n + 1; i++)
            dp[i][0] = 0;

        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < k + 1; j++) {
                // initialize with the result without including the current element
                dp[i][j] = dp[i - 1][j];

                // check if the current element can contribute to the current sum
                if (j >= array[i - 1] && dp[i - 1][j - array[i - 1]] != -1) {
                    // update dp[i][j] with the maximum of two values:
                    // 1. Length of subsequence without including the current element (dp[i-1][j])
                    // 2. Length of subsequence when considering the current element (1 + dp[i-1][j- array[i-1]]),
                    //    adding 1 to the length of the subsequence
                    dp[i][j] = Math.max(1 + dp[i - 1][j - array[i - 1]], dp[i][j]);
                }
            }
        }

        return dp[n][k];
    }
}