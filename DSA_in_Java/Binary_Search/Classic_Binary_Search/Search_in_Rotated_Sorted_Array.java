package Binary_Search.Classic_Binary_Search;

public class Search_in_Rotated_Sorted_Array {

    public static void main(String[] args) {

        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;

        System.out.println(bruteForceApproach(nums, target));
        System.out.println(optimalApproach(nums, target));
    }

    // ==========================================================
    // Brute Force Approach
    // ==========================================================
    // Idea:
    // - Traverse the entire array.
    // - If target is found, return its index.
    // - Otherwise return -1.
    //
    // Time Complexity : O(n)
    // Space Complexity: O(1)
    //
    // Interview Note:
    // This approach ignores the fact that the array is almost sorted
    // (only rotated), so it is not the expected optimal solution.
    public static int bruteForceApproach(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }

    // ==========================================================
    // Optimal Approach (Binary Search)
    // ==========================================================
    //
    // Key Observation:
    // A rotated sorted array always has ONE HALF completely sorted.
    //
    // Example:
    // nums = [4,5,6,7,0,1,2]
    //
    // Left Half : [4,5,6,7]
    // Right Half: [0,1,2]
    //
    // During every iteration,
    // either the LEFT HALF or the RIGHT HALF must be sorted.
    //
    // Once we know which half is sorted,
    // we simply check whether the target belongs to that half.
    //
    // If yes -> search there.
    // Else -> search in the other half.
    //
    // Time Complexity : O(log n)
    // Space Complexity: O(1)
    public static int optimalApproach(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {

            // Safe way of calculating mid
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // ------------------------------------------------------
            // Check if LEFT HALF is sorted
            // ------------------------------------------------------
            //
            // Example:
            // [4,5,6,7,0,1,2]
            //  L     M
            //
            // nums[left] <= nums[mid]
            //
            // means everything from left to mid is sorted.
            //
            if (nums[left] <= nums[mid]) {

                // Check if target lies inside the sorted left half
                //
                // Range:
                // nums[left] <= target < nums[mid]
                //
                if (target >= nums[left] && target < nums[mid]) {

                    // Search left half
                    right = mid - 1;
                } else {

                    // Otherwise search right half
                    left = mid + 1;
                }
            }

            // ------------------------------------------------------
            // Otherwise RIGHT HALF must be sorted
            // ------------------------------------------------------
            else {

                // Check if target belongs to sorted right half
                //
                // Range:
                // nums[mid] < target <= nums[right]
                //
                if (target > nums[mid] && target <= nums[right]) {

                    // Search right half
                    left = mid + 1;
                } else {

                    // Search left half
                    right = mid - 1;
                }
            }
        }

        // Target not present
        return -1;
    }
}