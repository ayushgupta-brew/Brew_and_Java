package Arrays_and_2dArrays.Two_Pointers;

public class Container_With_Most_Water {
    static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};

        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height){
        int maxAreaLength = Integer.MIN_VALUE;
        int left = 0 , right = height.length - 1;

        while(left < right){

            int minHeight = Math.min(height[left] , height[right]);
            int width = right - left;

            int area = minHeight * width;

            maxAreaLength = Math.max(maxAreaLength , area);

            if(height[left] <= height[right]) left++;
            else right--;
        }
        return maxAreaLength;
    }
}
