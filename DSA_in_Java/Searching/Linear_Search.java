package Searching;

import java.util.Scanner;
public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = 5 ;
        int n = sc.nextInt();
        int[] arr = new int[n];
        int flag = 0;

        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0 ; i<n ; i++){
            if(arr[i] == target){
                flag = 1;
                System.out.println("element found at index: " + i);
                break;
            }
        }
        if(flag == 0) {
            System.out.println("element not found");
        }
    }
}

/*
 Linear Search:
 • Array ya list ke elements ko ek-ek karke check karta hai.
 • Sorted hona zaroori nahi hota.
 • Use case: Chhote datasets, unsorted data, ya jab simplicity important ho.
 Time Complexity: O(n)
*/
