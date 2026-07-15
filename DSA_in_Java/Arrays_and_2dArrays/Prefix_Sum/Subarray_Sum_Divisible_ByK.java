package Arrays_and_2dArrays.Prefix_Sum;

import java.util.HashMap;
import java.util.Map;

public class Subarray_Sum_Divisible_ByK {

    static void main() {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(optimalApproach(nums, k));
    }

    // ---------------------------------------------------------
    // Brute Force Approach
    // Time Complexity : O(n²)
    // Space Complexity: O(1)
    //
    // Generate every possible subarray and calculate its sum.
    // If the sum is divisible by k, increase the count.
    // ---------------------------------------------------------
    public static int bruteForceApproach(int[] nums, int k) {

        int maxSubarray = 0; // (Actually stores count. Variable name can simply be 'count')
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            // Sum of current subarray starting from index i
            int sum = 0;

            for (int j = i; j < nums.length; j++) {

                // Extend the current subarray
                sum += nums[j];

                // If current subarray sum is divisible by k
                if (sum % k == 0) {
                    count++;
                }
            }

            // Not required for this problem.
            // This statement doesn't affect the final answer.
            maxSubarray = Math.max(maxSubarray, count);
        }

        return maxSubarray;
    }

    // ---------------------------------------------------------
    // Optimal Approach (Prefix Sum + HashMap)
    //
    // Time Complexity : O(n)
    // Space Complexity: O(n)
    //
    // Pattern:
    // If two prefix sums have the same remainder when divided by k,
    // then the subarray between them has a sum divisible by k.
    //
    // Example:
    // Prefix1 % k = 2
    // Prefix2 % k = 2
    //
    // Then:
    // (Prefix2 - Prefix1) % k = 0
    //
    // Therefore, the subarray sum is divisible by k.
    // ---------------------------------------------------------
    public static int optimalApproach(int[] nums, int k) {

        // Stores:
        // Key   -> remainder (prefixSum % k)
        // Value -> number of times this remainder has appeared
        Map<Integer, Integer> map = new HashMap<>();

        // Very important initialization.
        // Remainder 0 has already occurred once before processing any element.
        // This helps count subarrays starting from index 0.
        map.put(0, 1);

        int count = 0;
        int prefixSum = 0;

        // Traverse every element
        for (int num : nums) {

            // Update running prefix sum
            prefixSum += num;

            // Find current remainder
            int remainder = prefixSum % k;

            // Java gives negative remainder for negative numbers.
            // Convert it into positive remainder.
            //
            // Example:
            // -2 % 5 = -2
            // Required remainder = 3
            if (remainder < 0) {
                remainder += k;
            }

            // If this remainder has appeared before,
            // every previous occurrence forms one valid subarray.
            //
            // Example:
            // remainder 2 occurred 3 times previously
            // Current remainder is also 2
            // => 3 new subarrays are formed.
            if (map.containsKey(remainder)) {
                count += map.get(remainder);
            }

            // Store/update frequency of current remainder
            map.put(remainder, map.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}