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
     * ---------------- Prefix Sum + HashMap ----------------
     *
     * Core Observation:
     * If two prefix sums have the same remainder when divided by k,
     * then the subarray between them has a sum divisible by k.
     *
     * Mathematical Proof:
     *
     * prefixSum1 % k == prefixSum2 % k
     *
     * =>
     * (prefixSum2 - prefixSum1) % k == 0
     *
     * =>
     * Sum of elements between the two indices is divisible by k.
     *
     * Why store only the first occurrence?
     * Because the earliest index gives the maximum possible subarray length,
     * making it easier to satisfy the minimum length requirement.
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     */
    public static boolean solution2(int[] nums, int k) {

        // Stores:
        // Key   -> remainder of prefix sum
        // Value -> first index where this remainder occurred
        Map<Integer, Integer> map = new HashMap<>();

        // Assume remainder 0 exists before the array starts.
        // This helps detect valid subarrays starting from index 0.
        map.put(0, -1);

        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {

            // Running sum from index 0 to i
            prefixSum += nums[i];

            // Current remainder
            int remainder = prefixSum % k;

            // Same remainder seen before?
            if (map.containsKey(remainder)) {

                /*
                 * Previous Index ---- Current Index
                 *        |                  |
                 *        v                  v
                 *
                 * prefixSum(prev) % k == prefixSum(curr) % k
                 *
                 * Therefore,
                 * Sum(prev+1 ... curr) is divisible by k.
                 */

                // Subarray length must be at least 2
                if (i - map.get(remainder) >= 2) {
                    return true;
                }

            } else {

                // Store only the first occurrence.
                // Keeping the earliest index maximizes subarray length.
                map.put(remainder, i);
            }
        }
        return false;
    }
}