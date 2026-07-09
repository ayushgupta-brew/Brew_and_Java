package Arrays_and_2dArrays.Two_Pointers;

import java.util.HashMap;

public class Sort_Colors {
    static void main() {
        int[] nums = {2,0,2,1,1,0};
        solution3(nums);

        for(int i : nums){
            System.out.print(i + " ");
        }
    }
    public static void solution1(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int index = 0;
        for (int i = 0; i < map.getOrDefault(0, 0); i++) {
            nums[index++] = 0;
        }
        for (int i = 0; i < map.getOrDefault(1, 0); i++) {
            nums[index++] = 1;
        }
        for (int i = 0; i < map.getOrDefault(2, 0); i++) {
            nums[index++] = 2;
        }
    }
    public static void solution2(int[] nums){
        int[] count = new int[3];

        for (int num : nums) {
           count[num]++;
        }
        int index = 0;
        for(int color = 0; color < count.length; color++){
            while(count[color] > 0) {
                nums[index++] = color;
                count[color]--;
            }
        }
    }

    public static void solution3(int[] nums){
        int low = 0 , mid = 0, high = nums.length - 1;

        while(mid <= high){
            if(nums[mid] == 0){
                sortArray(nums , low , mid);
                low++;
                mid++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else{
                sortArray(nums, mid , high);
                high--;
                mid++;
            }
        }
    }
    private static void sortArray(int[] nums, int index1 , int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
