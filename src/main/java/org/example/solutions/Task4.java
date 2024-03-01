import java.util.HashSet;
import java.util.Set;

public class Task4 {
/*
   Time Complexity: O(n + m + k) where n is the length of nums1, m is the length of nums2 and k is the size of the result set.
   Space Complexity: O(n + 2k)  where n is the length of nums1 and k is the size of the result set.
*/
    public static int[] findIntersection(int[] nums1, int[] nums2) {
        // convert first array to set
        Set<Integer> set = new HashSet<>();
            for (int num : nums1) {
                set.add(num);
            }

        // searching for intersections and adding in resultSet
        Set<Integer> resultSet = new HashSet<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] resultArray = new int[resultSet.size()];
        // converting set object to integer array
        int i = 0;
        for (int num: resultSet) {
            resultArray[i++] = num;
        }

        return resultArray;
    }
}
