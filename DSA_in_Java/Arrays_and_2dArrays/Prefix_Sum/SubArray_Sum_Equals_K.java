package Arrays_and_2dArrays.Prefix_Sum;

import java.util.HashMap;
import java.util.Map;

public class SubArray_Sum_Equals_K {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;

        int count = solution2(nums, k);
        System.out.println("Sub array sum = " + count);
    }

    /*
     * Approach 1: Brute Force
     * - Generate every possible subarray.
     * - Keep a running sum for each starting index.
     * - Increment the count whenever the sum equals k.
     *
     * Time Complexity: O(n^2)
     * Space Complexity: O(1)
     */
    public static int solution1(int[] nums, int k) {

        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            int sum = 0;

            for (int j = i; j < nums.length; j++) {
                sum += nums[j];

                if (sum == k) {
                    count++;
                }
            }
        }

        return count;
    }

    /*
     * Approach 2: Prefix Sum + HashMap
     * - Maintain the current prefix sum while traversing the array.
     * - Store each prefix sum and its frequency in a HashMap.
     * - If (currentSum - k) exists, a subarray with sum k is found.
     * - Add its frequency to the answer.
     *
     * Time Complexity: O(n)
     * Space Complexity: O(n)
     */
    public static int solution2(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        // Base prefix sum to handle subarrays starting from index 0.
        map.put(0, 1);

        int currSum = 0;
        int count = 0;

        for (int num : nums) {

            currSum += num;

            // Check whether a valid previous prefix sum exists.
            if (map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            // Record the current prefix sum.
            map.put(currSum, map.getOrDefault(currSum, 0) + 1);
        }

        return count;
    }
}