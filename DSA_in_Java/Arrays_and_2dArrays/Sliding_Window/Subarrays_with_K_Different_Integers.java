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
        return atMostK(nums, k) - atMostK(nums, k-1);
    }
    private static int atMostK(int[] nums , int k){
        int left = 0;
        int count = 0;
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int right = 0; right < nums.length; right++){
            freqMap.put(nums[right] , freqMap.getOrDefault(nums[right] , 0) + 1);

            while(freqMap.size() > k){
                freqMap.put(nums[left] , freqMap.get(nums[left]) - 1);
                if(freqMap.get(nums[left]) == 0){
                    freqMap.remove(nums[left]);
                }
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
