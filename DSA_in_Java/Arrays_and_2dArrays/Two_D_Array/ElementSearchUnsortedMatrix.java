package Arrays_and_2dArrays.Two_D_Array;

import java.util.Scanner;

public class ElementSearchUnsortedMatrix { // linear search algorithm used
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // input for array size row
        int m = sc.nextInt(); // input for array size col

        int[][] arr = new int[n][m];

        //input
        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int x = sc.nextInt();

        for(int i = 0 ; i< n ; i++){
            for(int j = 0 ; j< m ;j++){
                if(arr[i][j] == x)
                    System.out.print(i + " " + j);
            }
        }
        sc.close();
    }
}
