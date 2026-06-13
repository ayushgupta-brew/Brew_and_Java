package HashMaps;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Contains_Duplicate {
    static void main(String[] args) {

        int[] nums = {1, 2, 2, 4};

        System.out.println(usingHashSet(nums));
    }

    public static boolean usingHashMap(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() > 1){
                return true;
            }
        }
        return false;
    }
    public static boolean usingHashSet(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
}