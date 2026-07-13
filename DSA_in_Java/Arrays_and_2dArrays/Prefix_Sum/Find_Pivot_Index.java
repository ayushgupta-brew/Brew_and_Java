package Arrays_and_2dArrays.Prefix_Sum;

public class Find_Pivot_Index {

    public static void main(String[] args) {
        // Sample input array
        int[] nums = {1, 7, 3, 6, 5, 6};

        // Call the optimized solution to find the pivot index
        int pivotIndex = solution2(nums);

        // Print the result
        System.out.println(pivotIndex);
    }

    /*
     * Brute-force approach:
     * For every index i, calculate:
     * - sum of all elements on the left side of i
     * - sum of all elements on the right side of i
     *
     * If both sums are equal, i is the pivot index.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static int solution1(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int leftSum = 0;

            // Sum elements from index 0 to i - 1
            for (int j = 0; j < i; j++) {
                leftSum += nums[j];
            }

            int rightSum = 0;

            // Sum elements from index i + 1 to n - 1
            for (int k = i + 1; k < n; k++) {
                rightSum += nums[k];
            }

            // If both sides are equal, current index is the pivot index
            if (leftSum == rightSum) {
                return i;
            }
        }

        // No pivot index found
        return -1;
    }

    /*
     * Optimized approach using prefix-sum logic:
     *
     * Step 1: Calculate the total sum of the array.
     * Step 2: Traverse the array while maintaining leftSum.
     * Step 3: For each index i:
     *         rightSum = totalSum - leftSum - nums[i]
     *         If leftSum == rightSum, return i.
     * Step 4: Update leftSum by adding nums[i].
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int solution2(int[] nums) {
        int totalSum = 0;

        // Calculate total sum of all elements
        for (int num : nums) {
            totalSum += num;
        }

        int leftSum = 0;

        // Traverse the array and check pivot condition at each index
        for (int i = 0; i < nums.length; i++) {
            int rightSum = totalSum - leftSum - nums[i];

            // Pivot index found when left and right sums are equal
            if (leftSum == rightSum) {
                return i;
            }

            // Add current element to leftSum before moving to next index
            leftSum += nums[i];
        }

        // No pivot index exists
        return -1;
    }
}