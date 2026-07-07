package Arrays_and_2dArrays.Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Subarrays_with_K_Different_Integers {
    static void main(String[] args) {
        int[] nums = {1, 2, 1, 2, 3};
        int k = 2;

        int result = subarraysWithKDistinct(nums , k);
        System.out.println(result);
    }
    public static int subarraysWithKDistinct(int[] nums, int k) {

        // Exactly K distinct = At most K distinct - At most (K - 1) distinct
        return atMostK(nums, k) - atMostK(nums, k-1);
    }
    private static int atMostK(int[] nums , int k){
        int left = 0;
        int count = 0;

        // Stores the frequency of elements inside the current sliding window.
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int right = 0; right < nums.length; right++){
            // Expand the window by including the current element.
            freqMap.put(nums[right] , freqMap.getOrDefault(nums[right] , 0) + 1);

            // Shrink the window until it contains at most K distinct elements.
            while(freqMap.size() > k){
                freqMap.put(nums[left] , freqMap.get(nums[left]) - 1);

                // Remove the element once its frequency becomes zero.
                if(freqMap.get(nums[left]) == 0){
                    freqMap.remove(nums[left]);
                }
                left++;
            }
            // Every subarray ending at 'right' and starting between
            // 'left' and 'right' is a valid subarray.
            count += right - left + 1;
        }
        return count;
    }
}
