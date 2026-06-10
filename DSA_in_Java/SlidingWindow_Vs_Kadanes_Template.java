public class SlidingWindow_Vs_Kadanes_Template {

    public static void main(String[] args) {

        // Example for Sliding Window
        int[] nums1 = {2, 3, 1, 2, 4, 3};
        int target = 7;

        int longestWindow = slidingWindowTemplate(target, nums1);
        System.out.println("Sliding Window Result (max length): " + longestWindow);

        // Example for Kadane's Algorithm
        int[] nums2 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int maxSubarraySum = KadanesAlgoTemplate(nums2);
        System.out.println("Kadane's Algorithm Result (max subarray sum): " + maxSubarraySum);
    }

    /**
     * Generic Sliding Window Template
     * <p>
     * Idea:
     * 1. Expand the window by moving right pointer.
     * 2. If window becomes invalid, shrink it from the left.
     * 3. Update answer whenever window satisfies the condition.
     * <p>
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */

    public static int slidingWindowTemplate(int target, int[] nums) {

        // Left boundary of window
        int left = 0;

        // right boundary of window
        int right = 0;

        // Stores current window information
        // Here it represents the sum of elements inside the window
        int windowData = 0;

        // Stores the final answer
        int result = 0;

        // Expand the window one element at a time
        for (right = 0; right < nums.length; right++) {

            // Step 1: Include current element into window
            windowData += nums[right];

            // Step 2: Shrink window until it becomes valid again
            while (windowData > target) {
                windowData -= nums[left];
                left++;
            }

            // Step 3: Update answer using current valid window
            result = Math.max(result, right - left + 1);
        }

        return result;
    }

    /**
      Kadane's Algorithm Template

      Idea:
      At every index, decide:
      - Start a new subarray from current element
      OR
      - Extend the previous subarray

      Time Complexity: O(n)
      Space Complexity: O(1)
     */
    public static int KadanesAlgoTemplate(int[] nums) {

        // Maximum subarray sum found so far
        int maxSoFar = nums[0];

        // Maximum subarray sum ending at current index
        int currentMax = nums[0];

        // Traverse remaining elements
        for (int i = 1; i < nums.length; i++) {

            /*
              Choice:
              1. Start fresh from nums[i]
              2. Extend previous subarray
             */
            currentMax = Math.max(nums[i], currentMax + nums[i]);

            // Update global maximum answer
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }
}
