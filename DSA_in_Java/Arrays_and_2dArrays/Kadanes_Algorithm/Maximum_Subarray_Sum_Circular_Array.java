package Arrays_and_2dArrays.Kadanes_Algorithm;

public class Maximum_Subarray_Sum_Circular_Array {

    public static void main(String[] args) {

        int[] nums = {1, -2, 3, -2};

        System.out.println("Brute Force : " + bruteForceApproach(nums));
        System.out.println("Optimal     : " + optimalApproach(nums));
    }

    // ------------------------------------------------------------
    // Brute Force Approach
    // Time Complexity  : O(n²)
    // Space Complexity : O(1)
    //
    // Interview Idea:
    // Try every index as the starting point and generate every
    // possible circular subarray using modulo indexing.
    // ------------------------------------------------------------
    public static int bruteForceApproach(int[] nums) {

        int n = nums.length;

        // Stores the maximum circular subarray sum found so far.
        int maxSum = nums[0];

        // Consider every index as the starting point.
        for (int i = 0; i < n; i++) {

            // Running sum of the current circular subarray.
            int currSum = 0;

            // Extend the subarray one element at a time.
            // Maximum possible length is n because
            // no element can be visited more than once.
            for (int j = 0; j < n; j++) {

                // Circular Index
                //
                // Example:
                // n = 5
                // i = 4
                //
                // j = 0 -> index = 4
                // j = 1 -> index = 0
                // j = 2 -> index = 1
                int idx = (i + j) % n;

                // Add current element to the running sum.
                currSum += nums[idx];

                // Update the maximum sum found.
                maxSum = Math.max(maxSum, currSum);
            }
        }

        return maxSum;
    }

    // ------------------------------------------------------------
    // Optimal Approach (Kadane's Algorithm)
    // Time Complexity  : O(n)
    // Space Complexity : O(1)
    //
    // Interview Trick:
    //
    // Maximum Circular Subarray has only two possibilities:
    //
    // 1. Normal Maximum Subarray
    //    -> Found using Kadane's Algorithm.
    //
    // 2. Circular Maximum Subarray
    //    -> Total Sum - Minimum Subarray
    //
    // Final Answer:
    // max(Normal Maximum, Circular Maximum)
    // ------------------------------------------------------------
    public static int optimalApproach(int[] nums) {

        // Running maximum subarray sum.
        int currentMax = 0;

        // Overall maximum subarray sum.
        int maxSum = nums[0];

        // Running minimum subarray sum.
        int currentMin = 0;

        // Overall minimum subarray sum.
        int minSum = nums[0];

        // Sum of the complete array.
        int totalSum = 0;

        for (int num : nums) {

            // ==============================
            // Kadane's Algorithm (Maximum)
            // ==============================
            //
            // Either:
            // 1. Continue previous subarray.
            // 2. Start a new subarray.
            currentMax = Math.max(currentMax + num, num);

            // Store the best maximum found.
            maxSum = Math.max(maxSum, currentMax);

            // ==============================
            // Kadane's Algorithm (Minimum)
            // ==============================
            //
            // Same logic as Kadane,
            // but using Math.min().
            currentMin = Math.min(currentMin + num, num);

            // Store the smallest subarray found.
            minSum = Math.min(minSum, currentMin);

            // Calculate total array sum.
            totalSum += num;
        }

        // --------------------------------------------------------
        // Interview Edge Case
        //
        // If every element is negative:
        //
        // nums = {-3,-2,-5}
        //
        // totalSum - minSum = 0
        //
        // 0 represents an empty subarray,
        // which is NOT allowed.
        // Therefore return the normal maximum.
        // --------------------------------------------------------
        if (maxSum < 0)
            return maxSum;

        // Circular Maximum
        //
        // Instead of directly finding the wrapped subarray,
        // remove the minimum subarray.
        //
        // Circular Maximum = Total Sum - Minimum Subarray
        int circularSum = totalSum - minSum;

        // Return the better of:
        // 1. Normal Maximum
        // 2. Circular Maximum
        return Math.max(maxSum, circularSum);
    }
}