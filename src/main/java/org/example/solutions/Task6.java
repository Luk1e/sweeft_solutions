package org.example.solutions;

/**
 * Task6: Check Valid Sequence
 * <p>
 * This class provides a method to check if the second array is a subset of the first array
 * and the elements are given in the same order.
 * <p>
 * Time Complexity: O(n + m), where n is the length of the array and m is the length of sequence array.
 * Space Complexity: O(1)
 */
public class Task6 {

    /**
     * Check if the second array is a subset of the first array and the elements are given in the same order.
     *
     * @param array    The first array.
     * @param sequence The second array to check if it's a subset of the first array.
     * @return true if the second array is a subset of the first array with elements in the same order, false otherwise.
     */
    public static boolean isValidSequence(int[] array, int[] sequence) {
        int i = 0, j = 0;

        while (i < array.length && j < sequence.length) {
            if (array[i] == sequence[j]) {
                j++; // move to the next element in the sequence array
            }
            i++; // move to the next element in the main array
        }

        return j == sequence.length; // return true if all elements in sequence were found
    }
}