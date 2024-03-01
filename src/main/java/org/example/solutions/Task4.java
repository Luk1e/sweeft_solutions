package org.example.solutions;

import java.util.HashSet;
import java.util.Set;

/**
 * Task4: Find Intersection of Two Arrays
 * <p>
 * This class provides a method to find the intersection of two integer arrays and return the result as an array.
 * The intersection is defined as the common elements that appear in both arrays.
 * </p>
 * Time Complexity: O(n + m + k), where n is the length of nums1, m is the length of nums2, and k is the size of the result set.
 * Space Complexity: O(n + 2k), where n is the length of nums1 and k is the size of the result set.
 */
public class Task4 {

    /**
     * Find the intersection of two integer arrays and return the result as an array.
     *
     * @param nums1 The first integer array.
     * @param nums2 The second integer array.
     * @return An array containing the intersection of nums1 and nums2.
     */
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        // Convert first array to set for faster lookup
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }

        // Search for intersections and add them to resultSet
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        // Convert set object to integer array
        int[] resultArray = new int[resultSet.size()];
        int i = 0;
        for (int num : resultSet) {
            resultArray[i++] = num;
        }

        return resultArray;
    }
}