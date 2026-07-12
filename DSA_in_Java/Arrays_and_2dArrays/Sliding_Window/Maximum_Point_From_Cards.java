package Arrays_and_2dArrays.Sliding_Window;

public class Maximum_Point_From_Cards {

    static void main() {
        int[] cardPoints = {1, 2, 3, 4, 5, 6, 1};
        int k = 3;

        int maxScore = Solution1(cardPoints, k);
        System.out.println(maxScore);
    }

    /*
     * Brute Force Approach
     *
     * Idea:
     * - We can pick cards only from the beginning or the end.
     * - Try every possible combination:
     *      Take i cards from the left.
     *      Take (k - i) cards from the right.
     * - Compute the total for each combination and keep the maximum.
     *
     * Time Complexity: O(k²)
     * Space Complexity: O(1)
     */
    public static int Solution1(int[] cardPoints, int k) {
        int maxPoint = 0;
        int n = cardPoints.length;

        // Try every possible left-right combination.
        for (int i = 0; i <= k; i++) {

            int tempSum = 0;

            // Take 'i' cards from the left.
            for (int j = 0; j < i; j++) {
                tempSum += cardPoints[j];
            }

            // Take remaining '(k - i)' cards from the right.
            for (int j = 0; j < k - i; j++) {
                tempSum += cardPoints[n - 1 - j];
            }

            // Update the maximum score.
            maxPoint = Math.max(maxPoint, tempSum);
        }

        return maxPoint;
    }

    /*
     * Optimal Sliding Window Approach
     *
     * Idea:
     * - Initially take all k cards from the left.
     * - Then, one by one:
     *      Remove a card from the left.
     *      Add a card from the right.
     * - This generates every possible combination without recalculating sums.
     *
     * Time Complexity: O(k)
     * Space Complexity: O(1)
     */
    public static int Solution2(int[] cardPoints, int k) {

        int leftSum = 0;

        // Initially take all k cards from the left.
        for (int i = 0; i < k; i++) {
            leftSum += cardPoints[i];
        }

        int maxPoint = leftSum;
        int rightSum = 0;

        // Gradually replace left cards with right cards.
        for (int i = 1; i <= k; i++) {

            // Remove one card from the left side.
            leftSum -= cardPoints[k - i];

            // Add one card from the right side.
            rightSum += cardPoints[cardPoints.length - i];

            // Update the maximum score.
            maxPoint = Math.max(maxPoint, leftSum + rightSum);
        }

        return maxPoint;
    }
}