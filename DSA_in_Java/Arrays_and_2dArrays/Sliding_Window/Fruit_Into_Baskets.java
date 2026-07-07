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
        Map<Integer, Integer> freqMap = new HashMap<>();

        for(int right = 0; right < fruits.length; right++){
            freqMap.put(fruits[right] , freqMap.getOrDefault(fruits[right] , 0) + 1);

            while(freqMap.size() > 2){
                freqMap.put(fruits[left] , freqMap.get(fruits[left]) - 1);

                if(freqMap.get(fruits[left]) == 0){
                    freqMap.remove(fruits[left]);
                }
                left++;
            }
            ans = Math.max(ans, (right - left + 1));
        }
        return ans;
    }
}
