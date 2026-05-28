package Arrays_and_2dArrays.One_D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Move_Zeros_toEnd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements");
        for(int i = 0 ; i < size; i++){
            array[i] = sc.nextInt();
        }

        moveZeroToEnd(array);
        System.out.println(Arrays.toString(array));

        sc.close();

    }
    public static void moveZeroToEnd(int[] array){

        int insertPos = 0;

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] != 0) {
                swap(array , insertPos, i);
                insertPos++;
            }
        }
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
