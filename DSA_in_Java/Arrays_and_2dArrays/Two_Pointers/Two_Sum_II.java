package Arrays_and_2dArrays.Two_Pointers;

public class Two_Sum_II {
    public  static void main(String[] args){
        int[] array = {2,7,11,15};
        int target = 9;

        int[] result = solution(array , target);

        for(int i : result){
            System.out.print(i+ " ");
        }
    }
    public static int[] solution(int[] array , int target){
        // Initialize two pointers at both ends of the sorted array.
        int left = 0;
        int right = array.length - 1;

        // Continue until both pointers meet.
        while (left < right) {

            // Calculate the sum of the current pair.
            int sum = array[left] + array[right];

            // Pair found.
            // Return 1-based indices as required by the problem statement.
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            }

            // Current sum is smaller than target.
            // Move the left pointer to increase the sum.
            else if (sum < target) {
                left++;
            }

            // Current sum is greater than target.
            // Move the right pointer to decrease the sum.
            else {
                right--;
            }
        }

        // No valid pair exists.
        return new int[]{-1, -1};
    }
}