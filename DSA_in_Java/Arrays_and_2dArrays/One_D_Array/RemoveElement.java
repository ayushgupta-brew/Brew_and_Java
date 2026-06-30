package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {

        // Scanner object for taking user input from terminal
        Scanner sc = new Scanner(System.in);

        // Taking array size input
        System.out.println("Enter the size for the array");
        int size = sc.nextInt();

        int[] nums = new int[size];

        // Taking array elements input
        System.out.println("Enter the elements to the array for the size given by you");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        // Taking the value to remove from array
        System.out.println("Enter the value you want to remove all occurrence from the array");
        int val = sc.nextInt();

        // Calling method and printing new valid length
        System.out.println(removeElement(nums, val));

        // Closing scanner to prevent resource leak
        sc.close();

    }

    public static int removeElement(int[] nums, int val) {

        // Pointer to place non-target elements
        // It tracks where the next valid element should be inserted
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            // Check if current element is NOT equal to value to remove
            if (nums[i] != val) {

                // Place valid element at insert position
                nums[insertPos] = nums[i];

                // Move insert position forward
                insertPos++;
            }
        }
        // Return the count of remaining valid elements
        return insertPos;
    }
}
