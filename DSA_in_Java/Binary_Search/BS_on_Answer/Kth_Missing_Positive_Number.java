package Binary_Search.BS_on_Answer;

public class Kth_Missing_Positive_Number {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 7, 11};
        int k = 5;

        System.out.println(bruteForceApproach(arr, k));
        System.out.println(optimalApproach(arr, k));
    }

    /*
     * Brute Force Approach
     * ---------------------
     * Idea:
     * - Start with the k-th missing number candidate as k.
     * - Traverse the sorted array.
     * - If the current array element is <= candidate, it means one missing number
     *   has been "covered", so shift candidate by 1.
     * - Stop as soon as the array element becomes greater than candidate.
     *
     * Example:
     * arr = [2, 3, 4, 7, 11], k = 5
     * candidate = 5
     * 2 <= 5  -> candidate = 6
     * 3 <= 6  -> candidate = 7
     * 4 <= 7  -> candidate = 8
     * 7 <= 8  -> candidate = 9
     * 11 > 9  -> stop
     * Answer = 9
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     */
    public static int bruteForceApproach(int[] arr, int k) {
        for (int element : arr) {
            if (element <= k) {
                k++;
            } else {
                break;
            }
        }
        return k;
    }

    /*
     * Optimal Approach using Binary Search on Answer
     * -----------------------------------------------
     * Observation:
     * - For index i, the count of missing numbers before arr[i] is:
     *   missing = arr[i] - (i + 1)
     *
     * Why?
     * - If there were no missing numbers, the array would look like:
     *   1, 2, 3, 4, 5...
     * - At index i, the expected value is i + 1.
     * - The difference between actual value and expected value gives
     *   how many numbers are missing before that index.
     *
     * Binary Search Logic:
     * - If missing < k, the kth missing number lies to the right.
     * - Otherwise, it lies to the left.
     * - After binary search ends, left indicates how many array elements
     *   are strictly before the kth missing number.
     *
     * Final Answer:
     * - k + left
     *
     * Time Complexity: O(log n)
     * Space Complexity: O(1)
     */
    public static int optimalApproach(int[] arr, int k) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int missing = arr[mid] - (mid + 1);

            if (missing < k) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return k + left;
    }
}
