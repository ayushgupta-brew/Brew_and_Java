package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;

public class Max_Min_inArray {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input for array size

        int[] arr = new int[n];

        for(int i = 0 ; i< arr.length ; i++){ // input for elements in array
            arr[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

//        int max = arr[0];
//        int min = arr[0];

        for (int j : arr) {
            if (j > max) {
                max = j;
            } else if (j < min) {
                min = j;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }
}
