package Binary_Search;

public class Classic_Binary_Search {

    public static void main(String[] args) {

        // Sample input: sorted array is required for binary search
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        // Optimal binary search: O(log n)
        int index = optimalApproach(nums, target);

        System.out.println(index);
    }

    // Brute-force approach
    // Time Complexity: O(n)
    // Space Complexity: O(1)
    // Interview note:
    // This is the simplest solution, but not the expected optimal one
    // when the input array is sorted and binary search is allowed.
    public static int bruteApproach(int[] nums, int target) {

        // Linear scan through the entire array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i; // Return index as soon as target is found
            }
        }

        // Target not present in the array
        return -1;
    }

    // Optimal binary search approach
    // Time Complexity: O(log n)
    // Space Complexity: O(1)
    // Interview note:
    // Binary search works only on sorted arrays.
    // This is the standard iterative approach and is preferred in interviews
    // because it is efficient and avoids recursion stack overhead.
    public static int optimalApproach(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        // Continue while search space is valid
        while (left <= right) {

            // Safe mid calculation to avoid integer overflow
            // Interview note: always prefer this over (left + right) / 2
            int mid = left + (right - left) / 2;

            // Case 1: target found
            if (nums[mid] == target) {
                return mid;
            }
            // Case 2: target is in the left half
            else if (nums[mid] > target) {
                right = mid - 1;
            }
            // Case 3: target is in the right half
            else {
                left = mid + 1;
            }
        }

        // Target not found in the array
        return -1;
    }
}