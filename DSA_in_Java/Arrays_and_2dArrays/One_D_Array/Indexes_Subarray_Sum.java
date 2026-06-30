package Arrays_and_2dArrays.One_D_Array;
// Sliding Window Technique used

import java.util.Arrays;

public class Indexes_Subarray_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 3 , 1 , 7 , 5};
        int target = 12;
        int target2 = 22;

        System.out.println(Arrays.toString(subArraySum(arr , target)));
        System.out.println(Arrays.toString(subArraySum(arr , target2)));
    }
    public static int[] subArraySum(int[] arr , int target){
        int currSum = 0;
        int j = 0;

        for(int i = 0 ; i<arr.length; i++){
            currSum += arr[i];

            while(currSum > target && j <= i){
                currSum -= arr[j];
                j++;
            }
            if(currSum == target){
                return new int[]{j,i};
            }
        }
        return new int[]{-1};
    }
}
