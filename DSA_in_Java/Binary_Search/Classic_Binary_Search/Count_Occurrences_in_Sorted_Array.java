package Binary_Search.Classic_Binary_Search;

public class Count_Occurrences_in_Sorted_Array {
    public static void main(String[] args){
        int[] nums = {1, 1, 2, 2, 2, 2, 2, 3};
        int target = 2;

        System.out.println(bruteForceApproach(nums, target));
        System.out.println(optimalApproach(nums, target));
    }
    public static int bruteForceApproach(int[] nums, int target){

        int count = 0;

        for(int num : nums){
            if(num == target){
                count++;
            }
        }
        return count;
    }
    public static int optimalApproach(int[] nums, int target){
        return upperBound(nums, target) - lowerBound(nums, target);
    }
    private static int lowerBound(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] >= target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
    private static int upperBound(int[] nums, int target){
        int left = 0, right = nums.length - 1;
        int ans = nums.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (nums[mid] > target) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }
}
