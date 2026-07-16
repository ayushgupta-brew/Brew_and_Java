package Arrays_and_2dArrays.Kadanes_Algorithm;

public class Maximum_Absolute_Sum_of_Any_Subarray {

    public static void main(String[] args) {

        int[] nums = {2, -5, 1, -4, 3, -2};

        // System.out.println(bruteForceApproach(nums));
        System.out.println(optimalApproach(nums));
    }

    /*
     * Brute Force
     * ----------------------------
     * Idea:
     * - Generate every subarray.
     * - Calculate its sum.
     * - Keep the maximum absolute sum.
     *
     * Time : O(n²)
     * Space: O(1)
     */
    public static int bruteForceApproach(int[] nums) {

        int maxSum = 0;

        // Fix starting index
        for (int i = 0; i < nums.length; i++) {

            int currentSum = 0;

            // Extend subarray
            for (int j = i; j < nums.length; j++) {

                currentSum += nums[j];

                // Update maximum absolute sum
                maxSum = Math.max(maxSum, Math.abs(currentSum));
            }
        }

        return maxSum;
    }

    /*
     * Optimal (Kadane's Algorithm)
     * ----------------------------
     * Idea:
     * - Find maximum subarray sum.
     * - Find minimum subarray sum.
     * - Answer = max(maxSum, |minSum|).
     *
     * Time : O(n)
     * Space: O(1)
     */
    public static int optimalApproach(int[] nums) {

        int currentMax = 0, currentMin = 0;
        int maxSum = 0, minSum = 0;

        for (int num : nums) {

            // Kadane for maximum subarray sum
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            // Kadane for minimum subarray sum
            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);
        }

        // Maximum absolute sum
        return Math.max(maxSum, Math.abs(minSum));
    }
}