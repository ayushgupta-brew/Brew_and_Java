package Binary_Search.Classic_Binary_Search;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(bruteForceApproach(nums));
        System.out.println(optimalApproach(nums));
    }

    // ----------------------------------------------------------
    // Brute Force Approach
    // ----------------------------------------------------------
    // Idea:
    // - Traverse every element.
    // - Keep track of the minimum value seen so far.
    //
    // Interview note:
    // - Very easy to explain.
    // - Not optimal because it does not use the sorted/rotated property.
    //
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    public static int bruteForceApproach(int[] nums) {
        int minElement = Integer.MAX_VALUE;

        for (int num : nums) {
            minElement = Math.min(minElement, num);
        }

        return minElement;
    }

    // ----------------------------------------------------------
    // Optimal Approach: Binary Search
    // ----------------------------------------------------------
    // Key Observation:
    // - The minimum element is the rotation (pivot) point.
    // - Compare nums[mid] with nums[right] to determine
    //   which half contains the minimum.
    //
    // Logic:
    // - If nums[mid] <= nums[right],
    //   the minimum is at mid or in the left half.
    //   Move: right = mid.
    //
    // - Otherwise,
    //   the minimum is in the right half.
    //   Move: left = mid + 1.
    //
    // Important:
    // - Use while(left < right) to avoid an infinite loop.
    // - When the loop ends, left == right,
    //   and that index stores the minimum element.
    //
    // Time Complexity : O(log n)
    // Space Complexity: O(1)
    public static int optimalApproach(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            // Safe midpoint calculation
            int mid = left + (right - left) / 2;

            // If middle element is smaller than or equal to right element,
            // the minimum is in the left part including mid.
            if (nums[mid] <= nums[right]) {
                right = mid;
            } else {
                // Otherwise, the minimum is in the right part excluding mid.
                left = mid + 1;
            }
        }

        // left and right meet at the minimum element
        return nums[left];
    }
}
