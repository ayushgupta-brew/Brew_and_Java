package Binary_Search.Lower_Upper_Bound;

public class First_Bad_Version {

    public static void main(String[] args) {

        // Total number of versions available.
        int n = 5;

        // Find and print the first bad version.
        System.out.println("First Bad Version : " + optimalApproach(n));
    }

    /**
     * Optimal Approach (Binary Search)
     *
     * Time Complexity  : O(log n)
     * Space Complexity : O(1)
     *
     * Interview Explanation:
     * ----------------------
     * We know:
     * Good Versions -> Good Versions -> Bad Versions -> Bad Versions
     *
     * Once a version becomes bad, every version after it is also bad.
     * This creates a monotonic (sorted) property:
     *
     * F F F T T T T
     *
     * Since the answers are sorted, Binary Search is the best choice.
     *
     * Goal:
     * Find the FIRST occurrence of 'true'.
     */
    public static int optimalApproach(int n) {

        // Search space starts from version 1 to version n.
        int left = 1;
        int right = n;

        // Continue until only one element remains.
        while (left < right) {

            // Prevent integer overflow.
            int mid = left + (right - left) / 2;

            /*
             * Case 1:
             * mid itself is bad.
             *
             * The first bad version can be:
             * - mid
             * - somewhere before mid
             *
             * Therefore, do NOT remove mid.
             */
            if (isBadVersion(mid)) {
                right = mid;
            }

            /*
             * Case 2:
             * mid is good.
             *
             * Therefore the first bad version must be after mid.
             *
             * We safely discard mid.
             */
            else {
                left = mid + 1;
            }
        }

        /*
         * When left == right,
         * both pointers point to the first bad version.
         */
        return left;
    }

    /**
     * Dummy API
     *
     * In interview platforms like LeetCode,
     * this method is already implemented.
     *
     * Here we simulate it for local testing.
     */
    private static boolean isBadVersion(int version) {

        // Assume version 4 is the first bad version.
        int firstBadVersion = 4;

        /*
         * Every version from firstBadVersion onwards is bad.
         */
        return version >= firstBadVersion;
    }
}