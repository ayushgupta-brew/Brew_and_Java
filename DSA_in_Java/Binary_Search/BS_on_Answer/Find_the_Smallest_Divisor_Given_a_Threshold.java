package Binary_Search.BS_on_Answer;

public class Find_the_Smallest_Divisor_Given_a_Threshold {

    public static void main(String[] args) {

        int[] nums = {44, 22, 33, 11, 1};
        int threshold = 5;

        System.out.println(bruteForceApproach(nums, threshold));
        // System.out.println(optimalApproach(nums, threshold));
    }

    // Brute Force Approach
//
// Idea:
// Try every divisor from 1 to maxElement.
// For each divisor, calculate Σ ceil(num/divisor).
// The first divisor satisfying sum <= threshold is the answer.
//
// Time Complexity:
// O(maxElement * n)
//   - maxElement possible divisors.
//   - For each divisor, traverse the entire array.
//
// Space Complexity:
// O(1)
//   - Only constant extra variables are used.

    public static int bruteForceApproach(int[] nums, int threshold) {

        // Every element contributes at least 1 to the sum.
        // Minimum possible sum = nums.length.
        // If threshold is smaller than that, answer is impossible.
        if (nums.length > threshold) {
            return -1;
        }

        // Search space:
        // Minimum divisor = 1
        // Maximum divisor = largest element.
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int left = 1;
        int right = max;

        while (left <= right) {

            // Overflow-safe mid calculation.
            int mid = left + (right - left) / 2;

            // Check if current divisor satisfies the threshold.
            if (sumOfDivisor(nums, mid) <= threshold) {

                // Current divisor works.
                // Try finding a smaller valid divisor.
                right = mid - 1;
            } else {

                // Current divisor is too small.
                // Need a larger divisor to reduce the sum.
                left = mid + 1;
            }
        }

        // 'left' points to the smallest valid divisor.
        return left;
    }

    // Optimal Approach (Binary Search on Answer)
//
// Observation:
// As the divisor increases, every ceil(num/divisor)
// decreases or remains the same.
// Therefore, the total sum is monotonically decreasing,
// allowing Binary Search on the answer.
//
// Search Space:
// [1, maxElement]
//
// Time Complexity:
// O(n * log(maxElement))
//   - Binary Search performs log(maxElement) iterations.
//   - Each iteration scans the array once.
//
// Space Complexity:
// O(1)
//   - No extra data structures are used.
    public static int optimalApproach(int[] nums, int threshold) {

        // Every element contributes at least 1 to the sum.
        // Minimum possible sum = nums.length.
        // If threshold is smaller than that, answer is impossible.
        if (nums.length > threshold) {
            return -1;
        }

        // Search space:
        // Minimum divisor = 1
        // Maximum divisor = largest element.
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
        }

        int left = 1;
        int right = max;

        while (left <= right) {

            // Overflow-safe mid calculation.
            int mid = left + (right - left) / 2;

            // Check if current divisor satisfies the threshold.
            if (sumOfDivisor(nums, mid) <= threshold) {

                // Current divisor works.
                // Try finding a smaller valid divisor.
                right = mid - 1;
            } else {

                // Current divisor is too small.
                // Need a larger divisor to reduce the sum.
                left = mid + 1;
            }
        }

        // 'left' points to the smallest valid divisor.
        return left;
    }

    //Helper Method
//
// Computes:
// Σ ceil(num/divisor)
//
// Used as the predicate function during Binary Search.
//
// Time Complexity:
// O(n)
//   - Visits every element once.
//
// Space Complexity:
// O(1)
    private static int sumOfDivisor(int[] nums, int divisor) {

        int sum = 0;

        for (int num : nums) {

            sum += (int) Math.ceil((double) num / divisor);
        }

        return sum;
    }
}