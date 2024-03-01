package org.example.solutions;

import java.util.List;

/**
 * Task2: Number of Happy Strings
 * <p>
 * This class provides a method to count the number of "happy strings" in a list of strings.
 * A happy string is defined as a string in which no two consecutive characters are the same.
 * <p>
 * Time Complexity: O(n * m), where n is the number of strings and m is the length of the longest string
 * Space Complexity: O(1)
 */
public class Task2 {

    /**
     * Count the number of "happy strings" in a list of strings.
     *
     * @param strings The list of strings to analyze.
     * @return The number of "happy strings" in the list.
     */
    public static int numberOfHappyStrings(List<String> strings) {
        return (int) strings.stream()
                .filter(str -> { // filter happy strings based on condition
                    for (int i = 0; i < str.length() - 1; i++) {
                        if (str.charAt(i) == str.charAt(i + 1)) {
                            return false; // not a happy string if consecutive duplicates exist
                        }
                    }
                    return true; // happy string if no consecutive duplicates found
                })
                .count(); // count the number of remaining elements (happy strings)
    }

}