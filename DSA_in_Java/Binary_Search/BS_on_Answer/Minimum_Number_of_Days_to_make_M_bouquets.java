package Binary_Search.BS_on_Answer;

public class Minimum_Number_of_Days_to_make_M_bouquets {
    public static void main(String[] args) {
        int[] bloomDay = {7, 7, 7, 7, 13, 11, 12, 7};
        int m = 2;
        int k = 3;
        System.out.println(bruteForceApproach(bloomDay, m, k));
        System.out.println(optimalApproach(bloomDay, m, k));
    }

    /*
     * Brute Force:
     * Check every day from the smallest bloom day to the largest bloom day.
     * For each day, see if we can make at least m bouquets.
     *
     * Easy idea:
     * - First possible day might be the answer.
     * - If not, try the next day.
     *
     * Time Complexity:
     * O((maxDay - minDay + 1) * n)
     * - We try every possible day.
     * - For each day, we scan the entire array once.
     *
     * Space Complexity:
     * O(1)
     */
    public static int bruteForceApproach(int[] bloomDay, int m, int k) {
        int totalFlowersNeeded = m * k;

        // If we need more flowers than available, answer is impossible.
        if (totalFlowersNeeded > bloomDay.length) {
            return -1;
        }

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        // Find the smallest and largest bloom day.
        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        // Try each day one by one.
        for (int day = minDay; day <= maxDay; day++) {
            if (isPossible(bloomDay, day, m, k)) {
                return day;
            }
        }

        return -1;
    }

    /*
     * Optimal Approach:
     * Use binary search on the answer.
     *
     * Why this works:
     * - If a certain day works, then any bigger day will also work.
     * - So the check becomes monotonic.
     *
     * This makes binary search possible.
     *
     * Time Complexity:
     * O(n * log(maxDay - minDay + 1))
     * - Binary search runs for log(maxDay - minDay + 1) iterations.
     * - Each iteration scans the array once.
     *
     * Space Complexity:
     * O(1)
     */
    public static int optimalApproach(int[] bloomDay, int m, int k) {
        int totalFlowersNeeded = m * k;

        // Not enough flowers at all.
        if (totalFlowersNeeded > bloomDay.length) {
            return -1;
        }

        int minDay = Integer.MAX_VALUE;
        int maxDay = Integer.MIN_VALUE;

        // Find the search range.
        for (int day : bloomDay) {
            minDay = Math.min(minDay, day);
            maxDay = Math.max(maxDay, day);
        }

        int left = minDay;
        int right = maxDay;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // If mid day can make the bouquets, try to find a smaller valid day.
            if (isPossible(bloomDay, mid, m, k)) {
                result = mid;
                right = mid - 1;
            } else {
                // If mid day does not work, go to bigger days.
                left = mid + 1;
            }
        }

        return result;
    }

    /*
    Helper Function
     * Check if we can make m bouquets by the given day.
     *
     * Simple logic:
     * - Walk through the array.
     * - Count flowers that have bloomed by this day.
     * - We need k consecutive bloomed flowers for one bouquet.
     * - When count reaches k, one bouquet is formed.
     * - If we hit a flower that is not bloomed yet, reset the count.
     *
     * Time Complexity:
     * O(n)
     * - Visit every flower once.
     *
     * Space Complexity:
     * O(1)
     */
    private static boolean isPossible(int[] bloomDay, int day, int m, int k) {

        // Number of bouquets we have successfully made.
        int bouquet = 0;

        // Counts consecutive flowers that have bloomed by the given day.
        int count = 0;

        // Traverse every flower in the garden.
        for (int bloom : bloomDay) {

            // Flower has bloomed on or before the current day.
            if (bloom <= day) {

                // Increase the consecutive bloomed flower count.
                count++;

                // If we have collected exactly k consecutive flowers,
                // we can make one bouquet.
                if (count == k) {
                    bouquet++;

                    // Reset count because these flowers are already used.
                    // A flower cannot belong to more than one bouquet.
                    count = 0;
                }

            } else {

                // Flower has not bloomed yet.
                // This breaks the consecutive sequence.
                // Any incomplete group cannot be used further.
                count = 0;
            }
        }

        // If we can make at least m bouquets,
        // then this day is a valid answer.
        return bouquet >= m;


        /*
         * ---------------- Alternative Approach ----------------
         *
         * Instead of creating a bouquet immediately after finding k flowers,
         * we count the length of every consecutive bloomed segment.
         *
         * Example:
         * Segment = [Bloomed, Bloomed, Bloomed, Bloomed, Bloomed]
         * count = 5, k = 2
         *
         * Number of bouquets from this segment = count / k = 5 / 2 = 2
         */

    /*
    int bouquet = 0;
    int count = 0;

    for (int bloom : bloomDay) {

        if (bloom <= day) {

            // Continue the consecutive bloomed segment.
            count++;

        } else {

            // End of a consecutive segment.
            // Convert this segment into as many bouquets as possible. (Count of the bloom segment / k number of adjacent flower)
            bouquet += count / k;

            // Start counting the next segment.
            count = 0;
        }
    }

    // Process the final consecutive segment
    // because the loop may end without encountering
    // an unbloomed flower.
    bouquet += count / k;

    // Check if enough bouquets can be formed.
    return bouquet >= m;
    */
    }
}
