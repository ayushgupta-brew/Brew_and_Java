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

    public static int slidingWindowTemplate(int target, int[] nums) {
        int left = 0, right = 0;
        int windowData = 0; // sum
        int result = 0;

        for (right = 0; right < nums.length; right++) {
            // 1. Expand window
            windowData += nums[right];

            // 2. Shrink window if condition violated
            while (windowData > target) {
                windowData -= nums[left];
                left++;
            }

            // 3. Update result
            result = Math.max(result, right - left + 1);
        }
        return result;
    }

    public static int KadanesAlgoTemplate(int[] nums) {
        int maxSoFar = nums[0];
        int currentMax = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        return maxSoFar;
    }
}
