import java.util.List;

public class Task2 {
/*
   Time Complexity: O(n * m) where n is the input array length and m the largest strings length
   Space Complexity: O(1)
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
