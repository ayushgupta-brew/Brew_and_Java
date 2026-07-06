package Arrays_and_2dArrays.Sliding_Window;

public class Subarray_Product_Less_Than_K {
    static void main(String[] args) {
        int[] nums = {10,5,2,6};
        int k = 100;

        int result1 = solution1(nums , k);
        int result2 = solution2(nums, k);

        System.out.println(result1 +" " + result2);

    }
    static int solution1(int[] nums , int k){
        if(k <= 1){
            return 0;
        }

        int count = 0;

        for(int i = 0 ; i < nums.length ; i++){
            long singleProduct = nums[i];

            if(singleProduct < k){
                count++;
            }

            for(int j = i+1 ; j < nums.length; j++){
                singleProduct *= nums[j];
                if(singleProduct < k){
                    count++;
                }
                else{
                    break;
                }
            }
        }
        return count;
    }
    static int solution2(int[] nums , int k){
        int count = 0;
        int product = 1;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }
            count += right - left + 1;
        }
        return count;
    }
}
