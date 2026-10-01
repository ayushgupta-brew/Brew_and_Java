package HashMaps;

import java.util.*;

public class Highest_Occurring_Element_in_an_Array {
    public static void main(String[] args){
        int[] nums = {1,2,2,3,3,2};

        System.out.println(mostFrequentElement(nums));
    }
    public static int mostFrequentElement(int[] nums){

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int mostFrequent = nums[0];
        int maxFrequency = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > maxFrequency) {
                maxFrequency = entry.getValue();
                mostFrequent = entry.getKey();
            }
        }

        return mostFrequent;

    }
}