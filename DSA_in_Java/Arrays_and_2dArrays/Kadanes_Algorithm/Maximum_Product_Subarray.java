package Arrays_and_2dArrays.Kadanes_Algorithm;

public class Maximum_Product_Subarray {

    public static void main(String[] args) {

        int[] nums = {0, 2};

        // Brute Force Approach
        System.out.println("Brute Force Answer : " + bruteForceApproach(nums));

        // Better Approach (Optimal)
        System.out.println("Better Approach Answer : " + betterApproach(nums));
    }

    // ============================================================
    // Brute Force Approach
    // Time Complexity  : O(n²)
    // Space Complexity : O(1)
    //
    // Idea:
    // Generate every possible subarray.
    // Calculate the product of each subarray.
    // Keep track of the maximum product found.
    // ============================================================
    public static int bruteForceApproach(int[] nums) {

        // Initialize answer with first element because
        // array can contain negative numbers.
        int maxProduct = nums[0];

        // Select the starting index of the subarray
        for (int i = 0; i < nums.length; i++) {

            // Product of current subarray
            int product = 1;

            // Extend the subarray one element at a time
            for (int j = i; j < nums.length; j++) {

                // Multiply current element
                product *= nums[j];

                // Update maximum product if current product is greater
                maxProduct = Math.max(maxProduct, product);
            }
        }

        return maxProduct;
    }

    // ============================================================
    // Better (Optimal) Approach
    // Time Complexity  : O(n)
    // Space Complexity : O(1)
    //
    // Idea:
    // Traverse from both left and right simultaneously.
    //
    // Why?
    // A negative number changes the sign of the product.
    // Sometimes the maximum product starts after a negative
    // number or ends before a negative number.
    //
    // Prefix Product -> Left to Right
    // Suffix Product -> Right to Left
    //
    // Take the maximum of both at every step.
    // ============================================================
    public static int betterApproach(int[] nums) {

        // Running product from left
        int prefix = 1;

        // Running product from right
        int suffix = 1;

        // Stores the maximum product found so far
        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {

            // If product becomes 0,
            // start a new product calculation.
            if (prefix == 0)
                prefix = 1;

            if (suffix == 0)
                suffix = 1;

            // Calculate prefix product
            prefix *= nums[i];

            // Calculate suffix product
            suffix *= nums[nums.length - 1 - i];

            // Update answer with the maximum product found
            maxProduct = Math.max(maxProduct, Math.max(prefix, suffix));
        }

        return maxProduct;
    }
}