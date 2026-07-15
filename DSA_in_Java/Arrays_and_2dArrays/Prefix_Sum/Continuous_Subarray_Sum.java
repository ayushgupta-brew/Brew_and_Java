package Arrays_and_2dArrays.Prefix_Sum;

import java.util.HashMap;
import java.util.Map;
/**
 * Problem: Continuous Subarray Sum
 *
 * Goal:
 * Find whether there exists a continuous subarray of length at least 2
 * whose sum is a multiple of k.
 *
 * Approach:
 * 1. Brute Force
 * 2. Prefix Sum + HashMap (Optimized)
 */
public class Continuous_Subarray_Sum {

    public static void main(String[] args) {

        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;

        boolean result = solution2(nums, k);
        System.out.println(result);
    }

    /**
     * ---------------------- Brute Force ----------------------
     *
     * Interview Explanation:
     * - Consider every possible subarray.
     * - Calculate its sum.
     * - If the subarray length is at least 2 and
     *   the sum is divisible by k, return true.
     *
     * Time Complexity : O(n²)
     * Space Complexity: O(1)
     */
    public static boolean solution1(int[] nums, int k) {

        int n = nums.length;

        // Consider every possible starting index
        for (int i = 0; i < n; i++) {

            int sum = 0;

            // Extend the subarray one element at a time
            for (int j = i; j < n; j++) {

                sum += nums[j];

                // Subarray length must be at least 2
                if (j - i + 1 >= 2 && sum % k == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Prefix Sum + HashMap
     *
     * Idea:
     * If two prefix sums have the same remainder when divided by k,
     * then the elements between those two prefix sums form a subarray
     * whose sum is divisible by k.
     *
     * Why?
     * prefixSum[j] % k == prefixSum[i] % k
     * => (prefixSum[j] - prefixSum[i]) % k == 0
     * => sum of subarray (i + 1 to j) is divisible by k
     *
     * We store the first index where each remainder appears,
     * because the earliest index gives the longest possible subarray.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static boolean solution2(int[] nums, int k) {

        // remainder -> first index where this remainder was seen
        Map<Integer, Integer> map = new HashMap<>();

        // Remainder 0 is considered seen before the array starts.
        // This helps detect subarrays starting from index 0.
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Add current element to running sum
            prefixSum += nums[i];

            // Find current remainder
            int remainder = prefixSum % k;

            // If this remainder was seen before,
            // the subarray between the previous index and current index
            // has a sum divisible by k.
            if (map.containsKey(remainder)) {

                int prevIndex = map.get(remainder);

                // Ensure subarray length is at least 2
                if (i - prevIndex >= 2) {
                    return true;
                }

            } else {
                // Store only the first time this remainder appears
                // so we can get the longest possible subarray later
                map.put(remainder, i);
            }
        }

        return false;
    }
}