package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size for the array");
        int size = sc.nextInt();

        int[] nums = new int[size];

        System.out.println("Enter the elements to the array for the size given by you");
        for (int i = 0; i < size; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the value you want to remove all occurrence from the array");
        int val = sc.nextInt();


        System.out.println(removeElement(nums, val));

        sc.close();

    }

    public static int removeElement(int[] nums, int val) {
        int insertPos = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {

                nums[insertPos] = nums[i];
                insertPos++;
            }
        }
        return insertPos;
    }
}
