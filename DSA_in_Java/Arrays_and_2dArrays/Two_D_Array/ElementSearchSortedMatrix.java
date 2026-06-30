package Arrays_and_2dArrays.Two_D_Array;

import java.util.Scanner;

public class ElementSearchSortedMatrix { // also known as staircase algorithm
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // rows
        int m = sc.nextInt(); // cols

        int[][] arr = new int[n][m];

        int x = sc.nextInt();

        for(int i = 0 ; i<n ; i++){ // input of  the elements
            for (int j = 0 ; j<m ; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int i = 0;
        int j = m-1;

        while(i<n && j>=0){
            if(arr[i][j] == x){
                System.out.println(i + " " + j);
                sc.close();
                return;
            }
            else if (arr[i][j] > x) {
                j--;
            }
                else {
                i++;
            }
        }
        System.out.println("Not found");
        sc.close();
    }
}