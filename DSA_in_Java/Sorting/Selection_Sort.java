package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class Selection_Sort {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size for an array");
        int size = sc.nextInt();

        int[] array = new int[size];

        System.out.println("Enter elements for an array");
        for(int i = 0 ; i< size ; i++){
            array[i] = sc.nextInt();
        }
        selectionSort(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));
    }


    public static void selectionSort(int[] array){

        int len = array.length;

        for(int i = 0 ; i < len - 1 ; i++){

            int minIndex = i;

            for(int j = i + 1 ; j < len; j++)
            {
                if(array[j] < array[minIndex]){

                    minIndex = j;

                }
                swap(array , minIndex, i);
            }
        }
    }
    public static void swap(int[] array , int index1 , int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}

/*
Selection Sort:
• simple sorting technique jo har pass me smallest element ko pick karta hai
• correct position par place karta hai.
• Use case: Chote arrays ya basic logic samajhne ke liye (O(n^2)).
*/