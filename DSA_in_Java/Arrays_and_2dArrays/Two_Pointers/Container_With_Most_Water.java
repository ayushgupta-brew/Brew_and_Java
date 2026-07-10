package Arrays_and_2dArrays.Two_Pointers;

public class Container_With_Most_Water {
    static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }

    /*
     * Approach:
     * - Area = min(leftHeight, rightHeight) × width.
     * - Width decreases whenever a pointer moves.
     * - Therefore, the only chance to obtain a larger area is to increase
     *   the limiting height (the shorter line).
     * - Move the shorter pointer because moving the taller one keeps the
     *   shorter line as the bottleneck while reducing the width.
     *
     * Time Complexity  : O(n)
     * Space Complexity : O(1)
     */
    public static int maxArea(int[] height){
        // Stores the maximum container area found so far.
        int maxAreaLength = Integer.MIN_VALUE;

        // Two pointers representing the leftmost and rightmost boundaries.
        int left = 0, right = height.length - 1;

        while (left < right) {

            // The shorter wall determines the effective container height. As it will prevent the water to overflow
            int minHeight = Math.min(height[left], height[right]);

            // Distance between the two boundaries.
            int width = right - left;

            // Area of the current container.
            int area = minHeight * width;

            // Update the maximum area if the current one is larger.
            maxAreaLength = Math.max(maxAreaLength, area);

            /*
             * Move the pointer with the smaller height.
             * Keeping the shorter wall cannot produce a larger area because
             * the width will decrease in every subsequent iteration.
             */
            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxAreaLength;
    }
}
