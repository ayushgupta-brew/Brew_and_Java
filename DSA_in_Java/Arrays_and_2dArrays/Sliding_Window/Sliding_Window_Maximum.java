package Arrays_and_2dArrays.Sliding_Window;

import java.util.ArrayList;

public class Sliding_Window_Maximum {
    static void main() {
        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] result = maxSlidingWindow(nums, k);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] maxSlidingWindow(int[] nums, int k) {
        int[] ans = new int[nums.length - k + 1];

        for (int left = 0; left <= nums.length - k; left++) {

            int max = nums[left];

            for (int right = left; right < left + k; right++) {
                max = Math.max(max, nums[right]);
            }

            ans[left] = max;
        }

        return ans;
    }
}