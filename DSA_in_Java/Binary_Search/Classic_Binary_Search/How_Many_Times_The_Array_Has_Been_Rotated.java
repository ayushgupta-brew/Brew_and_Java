package Binary_Search.Classic_Binary_Search;

/**
 * Problem:
 * Find how many times a sorted array has been rotated.
 *
 * Example:
 * [4, 5, 6, 7, 0, 1, 2, 3] -> rotated 4 times
 * The rotation count is the index of the smallest element.
 */
public class How_Many_Times_The_Array_Has_Been_Rotated {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};

        System.out.println("Brute Force Rotation Count: " + bruteForceApproach(nums));
        System.out.println("Optimal Rotation Count: " + optimalApproach(nums));
    }

    /**
     * Brute force approach:
     * Traverse the entire array and find the index of the minimum element.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int bruteForceApproach(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // invalid input
        }

        int minValue = nums[0];
        int minIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < minValue) {
                minValue = nums[i];
                minIndex = i;
            }
        }

        return minIndex;
    }

    /**
     * Optimal approach using Binary Search:
     * In a rotated sorted array, the smallest element lies in the unsorted part.
     *
     * Logic:
     * - If nums[mid] > nums[right], the minimum lies on the right side.
     * - Otherwise, the minimum lies on the left side including mid.
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int optimalApproach(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // invalid input
        }

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // Minimum is in the right half
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                // Minimum is in the left half including mid
                right = mid;
            }
        }

        // left == right points to the smallest element
        return left;
    }
}