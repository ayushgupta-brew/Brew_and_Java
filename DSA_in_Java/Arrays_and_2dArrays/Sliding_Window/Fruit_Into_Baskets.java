package Arrays_and_2dArrays.Sliding_Window;

import java.util.HashMap;
import java.util.Map;

public class Fruit_Into_Baskets {
    static void main(String[] args) {
        int[] fruits = {1,2,3,2,2};

        int result = totalFruit(fruits);
        System.out.println(result);
    }
    public static int totalFruit(int[] fruits) {

        int ans = 0;
        int left = 0;
        // Stores the frequency of fruit types in the current window.
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int right = 0; right < fruits.length; right++){
            // Expand the window by adding the current fruit.
            freqMap.put(fruits[right] , freqMap.getOrDefault(fruits[right] , 0) + 1);

            // Shrink the window until it contains at most two distinct fruit types.
            while(freqMap.size() > 2){
                freqMap.put(fruits[left] , freqMap.get(fruits[left]) - 1);

                // Remove the fruit type once its frequency becomes zero.
                if(freqMap.get(fruits[left]) == 0){
                    freqMap.remove(fruits[left]);
                }
                left++;
            }
            // Update the maximum valid window size.
            ans = Math.max(ans, (right - left + 1));
        }
        return ans;
    }
}
