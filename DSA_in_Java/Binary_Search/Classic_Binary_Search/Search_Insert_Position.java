package Binary_Search;

public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        System.out.println(bruteForceApproach(nums, target));
        System.out.println(optimalApproach(nums, target));
    }

    // Brute force approach:
    // Idea:
    // - Traverse the array from left to right.
    // - If current element is smaller than target, the insertion index moves forward.
    // - If current element is equal to target, return that index.
    // - If target is not present, the final value of index becomes the correct insertion position.
    //
    // Interview note:
    // - Since the array is sorted, this approach works but is not optimal.
    // - Time complexity: O(n)
    // - Space complexity: O(1)
    public static int bruteForceApproach(int[] nums, int target) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            // If current number is less than target,
            // target should be inserted after this position.
            if (nums[i] < target) {
                index = i + 1;
            }
            // If target is found, return its exact position.
            // In the original LeetCode problem, the array has distinct values,
            // so this is straightforward.
            else if (nums[i] == target) {
                index = i;
            }
        }

        return index;
    }

    // Optimal approach using Binary Search:
    // Idea:
    // - Because the array is sorted, we can eliminate half of the search space each time.
    // - If target is found, return its index immediately.
    // - If target is not found:
    //     - 'left' will point to the correct insertion position after the loop ends.
    //
    // Why return 'left'?
    // - When the loop ends, 'left' is the first position where target can be inserted
    //   while maintaining sorted order.
    //
    // Interview note:
    // - Time complexity: O(log n)
    // - Space complexity: O(1)
    public static int optimalApproach(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            // Safe mid calculation to avoid integer overflow
            int mid = left + (right - left) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }
            // Target lies in the right half
            else if (nums[mid] < target) {
                left = mid + 1;
            }
            // Target lies in the left half
            else {
                right = mid - 1;
            }
        }

        // If not found, left is the insertion position
        return left;
    }
}