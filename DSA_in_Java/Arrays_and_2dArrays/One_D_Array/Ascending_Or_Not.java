package Arrays_and_2dArrays.One_D_Array;

import java.util.Scanner;

public class Ascending_Or_Not {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // input for array size

        int[] arr = new int[n];

        for(int i = 0 ; i< arr.length ; i++){ // input for elements in array
            arr[i] = sc.nextInt();
        }

        boolean isAscending = true;

        for(int i = 0 ; i< arr.length-1; i++){
            if (arr[i] > arr[i + 1]) {
                isAscending = false;
                break;
            }
        }
        if(isAscending)
            System.out.println("Ascending order");
        else
            System.out.println("Descending order");
    }
}
