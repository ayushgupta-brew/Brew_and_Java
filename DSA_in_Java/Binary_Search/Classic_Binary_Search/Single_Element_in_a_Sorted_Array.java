package Binary_Search.Classic_Binary_Search;

/**

 * Problem:
 * In a sorted array where every element appears twice except one element,
 * find that single element.
 *
 * Example:
 * [1, 1, 2, 3, 3, 4, 4, 8, 8] -> 2
 */
public class Single_Element_in_a_Sorted_Array {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println("Brute Force Answer: " + bruteForceApproach(nums));
        System.out.println("Optimal Answer: " + optimalApproach(nums));
    }

    /*

     * Brute force approach using XOR.
     * XOR cancels out duplicate values:
     * a ^ a = 0 and 0 ^ b = b
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int bruteForceApproach(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // invalid input
        }

        int singleElement = 0;

        for (int num : nums) {
            singleElement ^= num;
        }

        return singleElement;
    }

    /*
      Optimal approach using Binary Search.

      Observation:
         Before the single element, pairs start at even index.
         After the single element, this pattern breaks.

     Logic:
        If mid is the single element, return it immediately.
        If mid belongs to a valid pair pattern, search right.
        Otherwise, search left.

    Time Complexity: O(log n)
    Space Complexity: O(1)
     */
    public static int optimalApproach(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1; // invalid input
        }

        int n = nums.length;

        // Edge case: only one element exists
        if (n == 1) {
            return nums[0];
        }

        // Edge case: single element at the beginning
        if (nums[0] != nums[1]) {
            return nums[0];
        }

        // Edge case: single element at the end
        if (nums[n - 1] != nums[n - 2]) {
            return nums[n - 1];
        }

        int low = 1;
        int high = n - 2;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If mid is the single element
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            /*
             * Determine which side to move to:
             * - If mid is on the correct side of pairing, move right.
             * - Otherwise, move left.
             */
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) ||
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // should never happen for valid input
    }
}
