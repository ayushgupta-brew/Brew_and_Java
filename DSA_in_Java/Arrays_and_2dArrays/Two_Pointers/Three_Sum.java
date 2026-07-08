package Arrays_and_2dArrays.Two_Pointers;

import java.util.*;

public class Three_Sum {
    static void main(String[] args) {
        int[] array = {-1,0,1,2,-1,-4};
        List<List<Integer>> lists = solution3(array);
        System.out.print(lists);
    }
    public static List<List<Integer>> solution1(int[] nums){
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0 ; i < nums.length - 2; i++){
            for(int j = i+1; j < nums.length - 1; j++){
                for(int k = j+1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(temp);
                        set.add(temp);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> solution2(int[] nums){
        Set<List<Integer>> set = new HashSet<>();

        for(int i = 0; i<nums.length; i++){
            Set<Integer> seen = new HashSet<>();
            for(int j = i+1; j<nums.length; j++){
                int k = -(nums[i] + nums[j]);

                if(seen.contains(k)){
                    List<Integer> temp = Arrays.asList(nums[i] , nums[j] , k);
                    Collections.sort(temp);
                    set.add(temp);
                }
                seen.add(nums[j]);
            }
        }
        return new ArrayList<>(set);
    }
    public static List<List<Integer>> solution3(int[] nums){
            Arrays.sort(nums);
            // Store final result
            List<List<Integer>> ans = new ArrayList<>();

            for (int i = 0; i < nums.length; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) continue;

                int left = i + 1, right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];

                    if (sum == 0) {
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        left++;
                        right--;

                        // Skip duplicates for left
                        while (left < right && nums[left] == nums[left - 1]) left++;
                        // Skip duplicates for right
                        while (left < right && nums[right] == nums[right + 1]) right--;
                    } else if (sum < 0) left++;
                    else right--;
                }
            }
            return ans;
    }
}
