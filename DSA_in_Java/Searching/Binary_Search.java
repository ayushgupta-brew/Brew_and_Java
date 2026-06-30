package Searching;

import java.util.*;
public class Binary_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();

        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56, 72};

        // Search space starts from first index to last index
        int low = 0;
        int high = arr.length-1;

        while(low <= high){

            // Find middle index safely without integer overflow issue that caused by -> mid = (low + high) / 2;
        int mid = low + (high - low) / 2;
            if(arr[mid] == target){
                System.out.println("element found at: " + mid);
                break;
            }
            else if (arr[mid] > target) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        System.out.println("no element found");
    }
}

/*
 Binary Search:
 • Sorted array me fast searching technique.
 • Har step me array ka half part discard karta hai.
 • Use case: Jab data pehle se sorted ho aur search repeatedly karni ho (O(log n)).
 */
