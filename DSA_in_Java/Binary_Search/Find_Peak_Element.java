package Binary_Search;

public class Find_Peak_Element {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 1};

        System.out.println(optimalApproach(nums));
    }

    /*
     * Interview idea:
     * A peak element is an element that is greater than its neighbors.
     * For this problem, we do NOT need to find every peak.
     * We only need to return any one peak index.
     *
     * Why binary search works:
     * If nums[mid] > nums[mid + 1], then a peak must exist on the left side,
     * including mid itself.
     * If nums[mid] < nums[mid + 1], then a peak must exist on the right side.
     *
     * This is because the array is treated like a slope:
     * - if the slope goes down, peak is on the left
     * - if the slope goes up, peak is on the right
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int optimalApproach(int[] nums) {
        int left = 0, right = nums.length - 1;

        // Keep shrinking the search space until left and right meet
        while (left < right) {
            // Safe midpoint calculation to avoid overflow
            int mid = left + (right - left) / 2;

            /*
             * Compare mid with next element:
             * Case 1: nums[mid] > nums[mid + 1]
             *   - We are on a descending slope
             *   - Peak lies on the left side or at mid
             *   - So move right to mid
             *
             * Case 2: nums[mid] < nums[mid + 1]
             *   - We are on an ascending slope
             *   - Peak lies on the right side
             *   - So move left to mid + 1
             */
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        /*
         * When loop ends, left == right
         * That position is guaranteed to be a peak index
         * Returning either left or right gives the same answer
         */
        return left;
    }
}