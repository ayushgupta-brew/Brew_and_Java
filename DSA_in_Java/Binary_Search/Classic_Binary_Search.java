package Binary_Search;

public class Classic_Binary_Search {
    public static void main(String[] args){

        int[] nums= {-1,0,3,5,9,12};
        int target = 9;
        int index = optimalApproach(nums, target);
        System.out.println(index);

    }
    public static int bruteApproach(int[] nums, int target){

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                return i;
            }
        }
        return -1;
    }
    public static int optimalApproach(int[] nums, int target){

        int left=0, right=nums.length-1;

        while(left <= right){
            int mid = left + (right-left) / 2;

            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] > target){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }
}
