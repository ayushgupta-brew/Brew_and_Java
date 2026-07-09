package Arrays_and_2dArrays.Two_Pointers;

import java.util.*;

public class Three_Sum {

    static void main(String[] args) {
        int[] array = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> lists = solution2(array);
        System.out.println(lists);
    }

    // ------------------------------------------------------------
    // Approach 1 : Brute Force
    // Check every possible triplet using three nested loops.
    // Store triplets in a HashSet after sorting each triplet
    // to eliminate duplicate combinations.
    //
    // Time Complexity:
    // O(N³) -> Three nested loops
    // + O(1) sorting (only 3 elements)
    //
    // Space Complexity:
    // O(K) -> HashSet storing unique triplets
    // where K = number of unique answers
    // ------------------------------------------------------------
    public static List<List<Integer>> solution1(int[] nums) {

        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum == 0) {

                        // Sort so that [-1,0,1] and [1,-1,0]
                        // become identical before inserting.
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);

                        set.add(temp);
                    }
                }
            }
        }

        return new ArrayList<>(set);
    }

    // ------------------------------------------------------------
    // Approach 2 : Hashing
    //
    // Fix the first element.
    // Use a HashSet to find the required third element
    // while traversing the remaining array.
    //
    // Required third element:
    // k = -(nums[i] + nums[j])
    //
    // Duplicate triplets are removed by storing
    // sorted triplets inside a HashSet.
    //
    // Time Complexity:
    // O(N²)
    //
    // Space Complexity:
    // O(N) -> HashSet for seen elements
    // O(K) -> Result HashSet
    // ------------------------------------------------------------
    public static List<List<Integer>> solution2(int[] nums) {

        Set<List<Integer>> ans = new HashSet<>();

        for (int i = 0; i < nums.length - 1; i++) {

            Set<Integer> seen = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {

                int k = -(nums[i] + nums[j]);

                // If complement already exists,
                // a valid triplet is found.
                if (seen.contains(k)) {

                    List<Integer> temp = Arrays.asList(nums[i], nums[j], k);
                    Collections.sort(temp);

                    ans.add(temp);
                }

                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(ans);
    }

    // ------------------------------------------------------------
    // Approach 3 : Sorting + Two Pointers (Optimal)
    //
    // Step 1:
    // Sort the array.
    //
    // Step 2:
    // Fix one element (nums[i]).
    //
    // Step 3:
    // Use two pointers to search for the remaining
    // two numbers whose sum equals -nums[i].
    //
    // Since the array is sorted:
    // - If sum < 0 -> move left pointer right
    // - If sum > 0 -> move right pointer left
    // - If sum == 0 -> store answer and skip duplicates
    //
    // Duplicate Handling:
    // 1. Skip duplicate fixed elements.
    // 2. After finding a valid triplet,
    //    skip duplicate left values.
    // 3. Skip duplicate right values.
    //
    // Time Complexity:
    // Sorting : O(N log N)
    // Two Pointer Traversal : O(N²)
    //
    // Overall:
    // O(N²)
    //
    // Space Complexity:
    // O(1) Auxiliary Space
    // (Ignoring the output list and Java's sorting stack.)
    // ------------------------------------------------------------
    public static List<List<Integer>> solution3(int[] nums) {

        Arrays.sort(nums);

        // Stores all unique triplets.
        List<List<Integer>> ans = new ArrayList<>();

        // Fix the first element of the triplet.
        for (int i = 0; i < nums.length; i++) {

            // Skip duplicate first elements
            // to avoid duplicate triplets.
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {

                int sum = nums[i] + nums[left] + nums[right];

                if (sum == 0) {

                    // Valid triplet found.
                    ans.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    left++;
                    right--;

                    // Skip duplicate values on left pointer.
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                    // Skip duplicate values on right pointer.
                    while (left < right && nums[right] == nums[right + 1])
                        right--;

                } else if (sum < 0) {

                    // Need a larger sum.
                    left++;

                } else {

                    // Need a smaller sum.
                    right--;
                }
            }
        }

        return ans;
    }
}