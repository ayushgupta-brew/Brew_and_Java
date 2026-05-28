package Arrays_and_2dArrays.One_D_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Move_Zeros_toEnd {
    public static void main(String[] args) {

        // Scanner for command line terminal input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the elements");
        for(int i = 0 ; i < size; i++){
            array[i] = sc.nextInt();
        }

        // to print the modified array using Arrays.toString() method
        moveZeroToEnd(array);
        System.out.println(Arrays.toString(array));

        // for garbage collection
        sc.close();

    }

    // static function to move zero to end using two pointer swap approach
    public static void moveZeroToEnd(int[] array){

        int insertPos = 0;

        for (int i = 0 ; i < array.length ; i++) {
            if (array[i] != 0) {

                // swap function to swap the non zero element and insert it to the correct position
                swap(array , insertPos, i);

                // incrementing insertPos to update the pos of the swap o and non zero element
                insertPos++;
            }
        }
    }

    // static swap function
    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
