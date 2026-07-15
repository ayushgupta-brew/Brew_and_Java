package Arrays_and_2dArrays.Kadanes_Algorithm;

public class Maximum_Subarray_Sum {
    public static void main(String[] args) {

        int[] nums = {5,4,-1,7,8};

        System.out.println(optimalApproach(nums));
    }

    public static int bruteForceApproach(int[] nums){

        int maxSum = 0;

        for(int i = 0; i < nums.length; i++){
            int sum = 0;
            for(int j = i; j < nums.length; j++){
                sum += nums[j];

                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static int optimalApproach(int[] nums){
        int currentSum = nums[0];
        int maxSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
