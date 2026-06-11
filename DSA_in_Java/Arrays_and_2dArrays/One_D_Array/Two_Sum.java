package Arrays_and_2dArrays.One_D_Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_Sum {

    public static void main(String[] args) {

        // Input array
        int[] a = {2, 6, 5, 8, 11};

        // Target sum to find
        int target = 14;

        // Calling HashMap approach
        int[] answer = usingHashMap(a, target);

        // Printing the indices of the two numbers
        System.out.println(Arrays.toString(answer));
    }

    /**
     * Brute Force Approach
     * Time Complexity: O(n²)
     * Space Complexity: O(1)
     *
     * Checks every possible pair in the array.
     */
    public static int[] usingNestedLoop(int[] a, int target) {

        int n = a.length;

        // Pick first element
        for (int i = 0; i < n; i++) {

            // Compare it with all elements after it
            for (int j = i + 1; j < n; j++) {

                // Check if current pair forms the target sum
                if (a[i] + a[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        // No valid pair found
        return new int[]{-1, -1};
    }

    /**
     * Optimal HashMap Approach
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     *
     * Stores previously visited numbers and their indices.
     */
    public static int[] usingHashMap(int[] array, int target) {

        // Stores number as key and its index as value
        Map<Integer, Integer> map = new HashMap<>();

        // Traverse the array once
        for (int i = 0; i < array.length; i++) {

            // Number required to reach the target
            int complement = target - array[i];

            // Check if complement already exists in the map
            if (map.containsKey(complement)) {

                // Pair found:
                // complement index = map.get(complement)
                // current number index = i
                return new int[]{map.get(complement), i};
            }

            // Store current number and its index
            // so future elements can use it as a complement
            map.put(array[i], i);
        }

        // No valid pair found
        return new int[]{-1, -1};
    }
}