package Arrays_and_2dArrays.Prefix_Sum;

public class Product_Of_Array_Except_Self {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4};

        // Print the result of the brute-force approach
        for (int value : solution1(nums)) {
            System.out.print(value + " ");
        }
    }

    /*
     * Brute-Force Approach
     *
     * Idea:
     * For every index, calculate:
     * 1. Product of all elements on the left.
     * 2. Product of all elements on the right.
     * Their multiplication gives the product of the array except itself.
     *
     * Time Complexity : O(n²)
     * Space Complexity: O(1) (excluding the output array)
     */
    public static int[] solution1(int[] nums) {

        int[] ans = new int[nums.length];

        // Process every index independently
        for (int i = 0; i < nums.length; i++) {

            // Stores the product of all elements before index i.
            // Initialized to 1 because 1 is the multiplicative identity.
            int leftProduct = 1;

            // Multiply every element on the left side of the current index.
            //
            // Example:
            // nums = [1, 2, 3, 4], i = 2
            //
            // left = 0 -> leftProduct = 1 * 1 = 1
            // left = 1 -> leftProduct = 1 * 2 = 2
            //
            // Final leftProduct = 2
            for (int left = 0; left < i; left++) {
                leftProduct *= nums[left];
            }

            // Stores the product of all elements after index i.
            // Again initialized to 1 so that multiplication remains unaffected
            // when there are no elements on the right.
            int rightProduct = 1;

            // Multiply every element on the right side of the current index.
            //
            // Example:
            // nums = [1, 2, 3, 4], i = 2
            //
            // right = 3 -> rightProduct = 1 * 4 = 4
            //
            // Final rightProduct = 4
            for (int right = i + 1; right < nums.length; right++) {
                rightProduct *= nums[right];
            }

            // Product except self = Left Product × Right Product
            //
            // Example:
            // leftProduct = 2
            // rightProduct = 4
            //
            // ans[2] = 2 * 4 = 8
            ans[i] = leftProduct * rightProduct;
        }

        return ans;
    }

    /*
     * Optimized Prefix-Suffix Approach
     *
     * prefix[i]  = Product of all elements before index i.
     * suffix[i]  = Product of all elements after index i.
     *
     * Answer = prefix[i] * suffix[i + 1]
     *
     * Time Complexity : O(n)
     * Space Complexity: O(n)
     */
    public static int[] solution2(int[] nums) {

        // Extra one position simplifies prefix and suffix calculations
        int[] prefix = new int[nums.length + 1];
        int[] suffix = new int[nums.length + 1];

        // No element exists before index 0,
        // so the product is initialized to 1.
        prefix[0] = 1;

        // Build prefix product array.
        //
        // Example:
        // nums = [1,2,3,4]
        //
        // prefix = [1,1,2,6,24]
        for (int i = 0; i < nums.length; i++) {
            prefix[i + 1] = prefix[i] * nums[i];
        }

        // No element exists after the last index,
        // so initialize with 1.
        suffix[nums.length] = 1;

        // Build suffix product array.
        //
        // Example:
        // suffix = [24,24,12,4,1]
        for (int i = nums.length - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * nums[i];
        }

        int[] ans = new int[nums.length];

        // Product except self:
        // prefix[i] contains product before i.
        // suffix[i + 1] contains product after i.
        //
        // Example:
        // i = 2
        // prefix[2] = 2
        // suffix[3] = 4
        // ans[2] = 2 * 4 = 8
        for (int i = 0; i < nums.length; i++) {
            ans[i] = prefix[i] * suffix[i + 1];
        }

        return ans;
    }
}