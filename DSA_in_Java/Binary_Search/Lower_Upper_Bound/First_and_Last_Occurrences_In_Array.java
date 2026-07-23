package Binary_Search.Lower_Upper_Bound;

import java.util.Arrays;

public class First_and_Last_Occurrences_In_Array {

    public static void main(String[] args) {

        int[] nums = {2, 4, 6, 8, 8, 8, 11, 13};
        int target = 8;

        System.out.println(Arrays.toString(bruteForceApproach(nums, target)));
        System.out.println(Arrays.toString(optimalApproach(nums, target)));
    }

    /*
    =========================================================
    Brute Force Approach
    =========================================================

    Idea:
    Traverse the entire array.

    • Store the first occurrence when the target is seen.
    • Keep updating the last occurrence.
    • If the target never appears, return {-1,-1}.

    Time Complexity  : O(n)
    Space Complexity : O(1)

    Interview Note:
    Although simple, this approach ignores the fact that
    the array is already sorted.
    */
    public static int[] bruteForceApproach(int[] nums, int target) {

        int first = -1;
        int last = -1;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == target) {

                // Record only the first occurrence.
                if (first == -1) {
                    first = i;
                }

                // Always update the latest occurrence.
                last = i;
            }
        }

        return new int[]{first, last};
    }

    /*
    =========================================================
    Optimal Approach
    =========================================================

    Since the array is sorted, Binary Search can locate both
    occurrences independently.

    Step 1:
    Find the first occurrence using Lower Bound.

    Step 2:
    If the returned index does not contain the target,
    the element is absent.

    Step 3:
    Find Upper Bound.

    Last Occurrence = Upper Bound - 1

    Time Complexity  : O(log n)
    Space Complexity : O(1)
    */
    public static int[] optimalApproach(int[] nums, int target) {

        int first = lowerBound(nums, target);

        /*
        lowerBound returns the first index where
        value >= target.

        If the index is outside the array OR the value
        is not equal to target, the target does not exist.
        */
        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        /*
        upperBound returns the first index where
        value > target.

        Therefore, the previous index is the last occurrence.
        */
        int last = upperBound(nums, target) - 1;

        return new int[]{first, last};
    }

    /*
    =========================================================
    Lower Bound
    =========================================================

    Definition:
    Returns the first index whose value is
    greater than or equal to the target.

    Example:

    Array  : [2,4,6,8,8,8,11]
    Target : 8

    Result : 3

    Search Space:
    We search in the half-open interval [left, right).

    Therefore,
    right is initialized as nums.length instead of
    nums.length - 1.

    This also allows lowerBound() to return nums.length
    when every element is smaller than the target.

    Time Complexity : O(log n)
    */
    private static int lowerBound(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {

            // Overflow-safe middle calculation.
            int mid = left + (right - left) / 2;

            /*
            nums[mid] is smaller than the target.

            The answer must lie on the right side.
            */
            if (nums[mid] < target) {

                left = mid + 1;
            }

            /*
            nums[mid] may already be the answer.

            Continue searching on the left to find
            an earlier valid index.
            */
            else {

                right = mid;
            }
        }

        /*
        left now points to the first index where

        nums[index] >= target
        */
        return left;
    }

    /*
    =========================================================
    Upper Bound
    =========================================================

    Definition:
    Returns the first index whose value is
    strictly greater than the target.

    Example:

    Array  : [2,4,6,8,8,8,11]
    Target : 8

    Result : 6

    Since nums[6] = 11 (> 8),

    Last Occurrence = Upper Bound - 1

    Time Complexity : O(log n)
    */
    private static int upperBound(int[] nums, int target) {

        int left = 0;
        int right = nums.length;

        while (left < right) {

            // Overflow-safe middle calculation.
            int mid = left + (right - left) / 2;

            /*
            Current value is still less than or equal
            to the target.

            Upper Bound must lie further right.
            */
            if (nums[mid] <= target) {

                left = mid + 1;
            }

            /*
            nums[mid] is greater than the target.

            It may be the first valid answer,
            so continue searching the left half.
            */
            else {

                right = mid;
            }
        }

        /*
        left now points to the first index where

        nums[index] > target
        */
        return left;
    }
}