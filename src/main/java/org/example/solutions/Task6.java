public class Task6 {
/*
   Time Complexity: O(n)
   Space Complexity: O(1)
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
